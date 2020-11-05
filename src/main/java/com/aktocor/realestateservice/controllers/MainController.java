package com.aktocor.realestateservice.controllers;

import com.aktocor.realestateservice.entity.Demo;
import com.aktocor.realestateservice.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private DemoRepository demoRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (
            @RequestParam String name,
            @RequestParam String email
    ) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Demo n = new Demo();
        n.setName(name);
        n.setEmail(email);
        demoRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Demo> getAllUsers() {
        return demoRepository.findAll();
    }

}