package com.company.control;

import com.company.model.Starship;
import com.company.model.exceptions.StarshipNotFoundException;
import com.company.model.exceptions.StarshipNotFoundStackTrace;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class StarshipRestController {

    private List<Starship> starships;

    @PostConstruct
    public void loadStarshipsData() {
        starships = new ArrayList<>();

        starships.add(new Starship(1,"A441",15,0,true));
        starships.add(new Starship(2,"A442",20,5,true));
        starships.add(new Starship(3,"A445",15,10,true));

    }

    @GetMapping("/ship")
    public String getModelShip() {
        return "A441";
    }

    @GetMapping("/ships")
    public List<Starship> getStarships() {

        return starships;
    }

    @RequestMapping("/ships/get-ship-by-id/{starshipId}")
    public Starship getStarshipById(@PathVariable int starshipId) {

        if (starshipId >= starships.size() || starshipId < 0) {
            throw new StarshipNotFoundException("Starship is not found - " + starshipId);
        }
        return starships.get(starshipId);
    }
}
