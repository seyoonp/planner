package com.varzac.planner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    @RequestMapping(value="hello")
    public String hello(Model model) {
        model.addAttribute("id", 1);
        model.addAttribute("name", "김현일");
        model.addAttribute("nickname", "킹킹킹");
        model.addAttribute("photo", "https://image.nbkorea.com/NBRB_PC/event/imc/bodega990v3/bodega_bg1.jpg");
        return "hello";
    }
}