package com.company.control;

import com.company.model.Starship;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class StarshipRestController {

    @GetMapping("/ship")
    public String getModelShip() {
        return "A441";
    }

    @GetMapping("/ships")
    public List<Starship> getStarships() {
        List<Starship> starships = new ArrayList<>();

        starships.add(new Starship(1,"A441",15,0,true));
        starships.add(new Starship(2,"A442",20,5,true));
        starships.add(new Starship(3,"A445",15,10,true));

        return starships;
    }
}
