package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

@GetMapping("/")
public String getInfoForAllEmps(){
    return "all_employees";
}

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "hr";
    }


    @GetMapping("/manager_info")
    public String getInfoOnlyForManager(){
        return "manager";
    }

}
