package pl.sda.springdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OffersSiteController {

    @GetMapping("/offers")
    public String offersSite() {
        return "offers";
    }
}
