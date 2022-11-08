package com.security.configration.controller;


import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){

//        List<User> allUsers = userService.getAllUsers();
//        model.addAttribute("allUsers", allUsers);

        return "all-employees";
    }

//    @RequestMapping("/addNewEmployee")
//    public String addNewEmployee(Model model){
//
//        Employee employee = new Employee();
//
//        model.addAttribute("employee",employee);
//
//        return "employee-info";
//    }
//
//    @RequestMapping("/saveEmployee")
//    public String saveEmployee(@ModelAttribute("employee") Employee employee){
//
//        employeeService.saveEmployee(employee);
//
//        return "redirect:/";
//    }
//
//    @RequestMapping("/updateInfo")
//    public String updateInfo(@RequestParam("empId") int id, Model model ){
//
//        Employee employee = employeeService.getEmployee(id);
//        model.addAttribute("employee",employee);
//
//        return "employee-info";
//    }
//
//    @RequestMapping("/deleteEmployee")
//    public String deleteEmployee(@RequestParam("empId") int id){
//
//        employeeService.deleteEmployee(id);
//
//        return "redirect:/";
//    }
}
