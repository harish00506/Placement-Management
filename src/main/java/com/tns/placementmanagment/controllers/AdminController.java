package com.tns.placementmanagment.controllers;

import com.tns.placementmanagment.entities.Admin;
import com.tns.placementmanagment.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

    @Autowired
    public AdminService adminService;

    @GetMapping
    public List<Admin> getAdmins(){
        return adminService.getAdmin();
    }

    @PostMapping
    public Admin createAdmin(@RequestBody Admin admin){
        return adminService.createAdmin(admin);
    }

    @PutMapping
    public Admin updateAdmin(@RequestBody Admin admin){
        return adminService.updateAdmin(admin);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAdmin(@PathVariable(name = "id") Long id){
        adminService.deleteAdmin(id);
    }

}
