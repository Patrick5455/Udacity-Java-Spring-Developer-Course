package com.udacity.bootstrap.web;

import com.udacity.bootstrap.Entity.Dog;
import com.udacity.bootstrap.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>>retrieveDogBreeds(){

        List<String> dogBreedsList = dogService.retrieveDogBreeds();

        return new ResponseEntity<List<String>>(dogBreedsList, HttpStatus.OK);
    }

    @GetMapping("dogs/names")
    public ResponseEntity<List<String>> retrieveDogNames(){
        List<String> dogNamesList = dogService.retrieveDogNames();
        return new ResponseEntity<List<String>>(dogNamesList, HttpStatus.OK);
    }

    @GetMapping("{id}/breed")
    public ResponseEntity<String> retrieveDogBreedById(
            @PathVariable("id") Long id){
        String breed = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }







}
