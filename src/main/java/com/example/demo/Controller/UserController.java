package com.example.demo.Controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user=new User("Marius","m@mail.com","Ädmin", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //selekcija
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user=new User("Marius","m@mail.com","Ädmin", "male");
        model.addAttribute("user", user);
        return "selection-expression";
    }
    //message expression
    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }
    //link expression
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";
    }
    // fragments  : footer & header
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }
    @GetMapping("/users")
    public String users(Model model){
        User user1 = new User("Admin", "dd@email.com", "admin", "Male");
        User user2 = new User("gggg", "dd@email.com", "admin", "female");
        User user3 = new User("zzzzz", "dd@email.com", "admin", "Male");
        User user4 = new User("zzzzz", "dd@email.com", "admin", "female");
        List<User> users =new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        model.addAttribute("users",users);
        return "users";
    }

}
