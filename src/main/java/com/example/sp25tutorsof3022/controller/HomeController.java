package com.example.sp25tutorsof3022.controller;

import com.example.sp25tutorsof3022.model.Account;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller// tra ve 1 trang html
public class HomeController {

    @GetMapping("/home")
    public String home(Model model, @ModelAttribute("account") Account account) {
        return "/index.html";
        // nên để đuôi html để phân biệt với dường dẫn
    }

    // khac j4 o controller => html khong thay doi
//    @PostMapping("/login")
//    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
//        // request.getParameter
//        if (email.equals("")) {
//            model.addAttribute("email", "Email obligatorio");
//            return "/index.html";
//        } else if (password.equals("")) {
//            model.addAttribute("password", "Email obligatorio");
//            return "/index.html";
//        } else {
//            return "/home.html";
//        }
//    }

    // dung spring form modelattribute <=> ca 2 ben contrller va html deu phai co
    // controller ModelAttribute , html th:object (2 name phai giong nhau) => lien quan den doi tuong

    // su dung spring form

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("account") Account account, Errors errors) {
        System.out.println(account);
        if (errors.hasErrors()) {
            return "/index.html";
        }
        return "home.html";
    }
}
