package com.ltp.workbook2_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {

    @GetMapping("/")
        public String getShows(){
        return "shows.html";
        }
    }
