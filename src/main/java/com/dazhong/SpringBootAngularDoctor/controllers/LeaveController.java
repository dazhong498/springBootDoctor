package com.dazhong.SpringBootAngularDoctor.controllers;

import com.dazhong.SpringBootAngularDoctor.models.Leave;
import com.dazhong.SpringBootAngularDoctor.services.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @RequestMapping(value = "/applyLeave", method = RequestMethod.POST)
    public Leave applyLeave(@RequestBody Leave leave){
        leave.setStatus("Pending");
        leaveService.applyLeave(leave);
        return leave;
    }
}
