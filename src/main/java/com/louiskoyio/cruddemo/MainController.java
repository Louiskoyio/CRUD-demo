package com.louiskoyio.cruddemo;


import com.louiskoyio.cruddemo.player.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    PlayerRepository playerRepository;

    @GetMapping("")
    public String showHomepage() {
        return "index";
    }
}
