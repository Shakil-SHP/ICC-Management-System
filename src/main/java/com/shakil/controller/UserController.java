package com.shakil.controller;

import com.shakil.model.User;
import com.shakil.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessageSource messageSource;


    @GetMapping("/all")
    public String allUsers(Model model){
        model.addAttribute("users", userService.allUsers());
        return "users/all";

    }

    @GetMapping("/add")
    public String addUserGet(Model model){
        model.addAttribute("user",new User());
        return "users/addUser";
    }

    public String addUserPost(@ModelAttribute(name = "user") @Valid User user, BindingResult bindingResult, Model model){

        String errorMsg = "";

        if(bindingResult.hasErrors()){
            model.addAttribute("errorMsg", bindingResult.getAllErrors());
            return "users/addUser";
        }

        userService.addUser(user);
        return "redirect: /users/all";
    }




}
