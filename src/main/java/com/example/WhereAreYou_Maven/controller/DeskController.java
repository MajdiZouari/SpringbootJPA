package com.example.WhereAreYou_Maven.controller;

import com.example.WhereAreYou_Maven.model.Desk;
import com.example.WhereAreYou_Maven.repository.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desk")
public class DeskController {

    @Autowired
    private DeskRepository deskRepository;

    @GetMapping("/add")
    public ResponseEntity<Desk> addDesk(){
        Desk desk = new Desk();
        desk.setDskNumber(32);
        deskRepository.save(desk);
        return new ResponseEntity<Desk>(desk, HttpStatus.OK);
    }

}
