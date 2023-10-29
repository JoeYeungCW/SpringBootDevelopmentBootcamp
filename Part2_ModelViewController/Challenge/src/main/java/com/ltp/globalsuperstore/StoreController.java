package com.ltp.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class StoreController {
    List<Item> Item = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getIdIndex(id);
        model.addAttribute("item", index == Constants.NOT_FOUND ? new Item() : Item.get(index));
        model.addAttribute("categories", Constants.CATEGORIES);
        return "form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", Item);
        return "inventory";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(Item item, RedirectAttributes redirectAttributes) {
        int index = getIdIndex(item.getId());
        String status = Constants.SUCCESS_STATUS;
        if (index == Constants.NOT_FOUND) {
            Item.add(item);
        }
        else if(within5Days(item.getDate(),Item.get(index).getDate())){
            Item.set(index, item);
        }
        else {
            status = Constants.FAILED_STATUS;
        }
        redirectAttributes.addFlashAttribute("status",status);
        return "redirect:/inventory";
    }

    public int getIdIndex(String id) {
        for (int i = 0; i < Item.size(); i++) {
            if (Item.get(i).getId().equals(id)) {
                return i;
            }
        }
        return Constants.NOT_FOUND;
    }

    public boolean within5Days(Date newDate, Date oldDate) {
        long diff = Math.abs(newDate.getTime() - oldDate.getTime());
        return (int) (TimeUnit.MILLISECONDS.toDays(diff)) <= 5;
    }

}
