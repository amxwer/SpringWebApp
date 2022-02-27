package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class RegController {
    @Autowired
    private UsersRepository usersRepository;



    @GetMapping("/account")
    public String account(Model model) {
        model.addAttribute("title","registration");
        return "RegSuccess";
    }
    @GetMapping("/blog/signup")
    public String account1(Model model){
        model.addAttribute("title","authorization");
        return "login";
    }


    @GetMapping("/blog/register")
    public String register(Model model) {
        model.addAttribute("title", "register");
        return "register";

    }

    @PostMapping("/blog/register")
    public String postReg(@RequestParam String password,
                          @RequestParam String mail, Model model) {
        UsersPost usersPost = new UsersPost(password, mail);
        usersRepository.save(usersPost);
        return "redirect:/account";


    }
}



