package com.theironyard.charlotte.BigCatCRUD.controllers;

import com.theironyard.charlotte.BigCatCRUD.models.BigCat;
import com.theironyard.charlotte.BigCatCRUD.repositories.BigCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BigCatController {

    @Autowired
    BigCatRepository bigcatRepo;

    @GetMapping("/")
//    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homePage(Model model){
        model.addAttribute("feline", bigcatRepo.findAll());
        return "index";
    }

    @PostMapping("/add_bigcat")
    public String addBigCat(BigCat bigcat){
        bigcatRepo.save(bigcat);
        return "redirect:/";
    }

    @PostMapping("/deleteBigCat")
    public String deleteBigCat(Integer id){
        bigcatRepo.delete(id);
        return "redirect:/";
    }
}
