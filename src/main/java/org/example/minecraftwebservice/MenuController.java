package org.example.minecraftwebservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuController {

    @GetMapping("/")
    public String menu(Model model){
        model.addAttribute("serverIp",TextService.ip);
        return "server_info";

    }


    @GetMapping("/rules")
    public String rules(Model model){
        model.addAttribute("rules", TextService.rules);
        model.addAttribute("serverIp",TextService.ip);
        return "server_rules";
    }


    @GetMapping("/team")
    public String admin_info(Model model){

        model.addAttribute("serverIp",TextService.ip);
        model.addAttribute("developers",TextService.developers());
        return "server_team";
    }

    @GetMapping("/news/add")
    public String showAddNewsForm(Model model) {
        return "add-news"; // имя шаблона
    }


    @GetMapping("/howtoplay")
    public String instructions(Model model){
        model.addAttribute("serverIp",TextService.ip);
        model.addAttribute("serverName","Neo-Planet");
        return "how_to_play";
    }


}
