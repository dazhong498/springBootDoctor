package com.dazhong.SpringBootAngularDoctor.controllers;

import com.dazhong.SpringBootAngularDoctor.models.Admin;
import com.dazhong.SpringBootAngularDoctor.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "loginAdmin", method = RequestMethod.POST)
    public Admin loginAdmin(@RequestParam("userName") String userName, @RequestParam("password") String password){
        return adminService.adminLogin(userName, password);
    }
}
