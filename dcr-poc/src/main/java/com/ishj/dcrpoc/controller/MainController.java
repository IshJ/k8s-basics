package com.ishj.dcrpoc.controller;

import com.ishj.dcrpoc.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/users/admin")
     public String getAdminName(){
        User user = new User("ish", "admin");
        return user.name();
    }
}
