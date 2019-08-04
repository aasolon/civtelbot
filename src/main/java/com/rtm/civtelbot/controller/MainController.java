package com.rtm.civtelbot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    // https://civtelbot.herokuapp.com/process-game-info
    @RequestMapping("/process-game-info")
    public String processGameInfo() {
        return "asd 1";
    }
}
