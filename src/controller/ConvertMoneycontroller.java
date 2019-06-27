package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneycontroller {
    @GetMapping("/convert")
    public String convert(@RequestParam float usd, Model model){
        model.addAttribute("usd",usd);
        return "index";
    }

}
