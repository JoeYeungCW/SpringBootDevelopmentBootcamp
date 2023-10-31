package workbook31;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WorkbookController {

    List<User> users = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getUserIndex(id);
        model.addAttribute("user", index == Constant.NOT_FOUND ? new User() : users.get(index));
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult(Model model) {
        model.addAttribute("users",users);
        return "result";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid User user, BindingResult bindingResult) {
        if(user.getFirstName().equals(user.getLastName())) {
            bindingResult.rejectValue("lastName","", "please enter valid data");
        }
        if(bindingResult.hasErrors()) {
            return "/sign-up";
        }
        int index = getUserIndex(user.getId());
        if(index == Constant.NOT_FOUND) {
            users.add(user);
        }
        else {
            users.set(index, user);
        }
        return "redirect:/result";
    }

    public int getUserIndex(String id) {
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getId().equals(id)){
                return i;
            }
        }
        return Constant.NOT_FOUND;
    }
}
