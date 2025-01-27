package com.orm.banking_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orm.banking_app.dto.Response;
import com.orm.banking_app.dto.UserRequest;
import com.orm.banking_app.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping()
    public Response createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

}
