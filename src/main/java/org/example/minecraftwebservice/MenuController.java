package org.example.minecraftwebservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/")
    public String menu(Model model){
        model.addAttribute("serverIp", "199:99:919212:13");
        return "server_info";


    }
}
