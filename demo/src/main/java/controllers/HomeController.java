package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form")
    public String displayForm() {
        return "form";
    }

    @GetMapping("/recipes")
    public String displayRecipes() {
        return "recipes";
    }

}
