package com.example.demo.Controller;

import com.example.demo.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    @GetMapping("register")
    public String userRegistrationPage(Model model) {
        //empty user form model object to sotre data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);
        return "register-form";
    }

    //registracijos formoje issaugojimas
    @PostMapping("register/save")
    public String submitForm(Model model,
                             @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}
