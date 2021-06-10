package com.company.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StarshipRestController {

    @GetMapping("/ship")
    public String getModelShip() {
        return "A441";
    }
}
