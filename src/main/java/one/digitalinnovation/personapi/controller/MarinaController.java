package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MarinaController {

    @GetMapping
    public String mmm(){
        return "Marina Te Amo!!!!!!";
    }
}
