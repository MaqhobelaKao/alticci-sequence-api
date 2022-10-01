package com.kao.alticci.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kao.alticci.services.AlticciService;

@RestController
@RequestMapping("/alticci")
public class AlticciController {
	@Autowired
	AlticciService alticciService;
	
	
    @GetMapping("/{n}")
    public int getNthNumber(@PathVariable("n") int term){
    	return alticciService.getElementFromCacheOrGenerateIt(term);
    }
}
