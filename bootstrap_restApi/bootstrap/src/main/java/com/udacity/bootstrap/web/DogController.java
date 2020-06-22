package com.udacity.bootstrap.web;

import com.udacity.bootstrap.Entity.Dog;
import com.udacity.bootstrap.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    public DogService dogService;

    @Autowired // setter injection is better than field injection
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> retrieveDogs(){

        List<Dog> dogList = dogService.retrieveDogs();

        return new ResponseEntity<List<Dog>>(dogList, HttpStatus.OK);
    }





}
