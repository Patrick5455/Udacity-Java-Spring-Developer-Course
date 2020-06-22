package com.udacity.bootstrap.service;

import com.udacity.bootstrap.Entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.PushBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService{

    @Autowired
    public DogRepository dogRepository;

    public String retrieveDogBreedById(Long id){

        Optional<String> optionalDog = dogRepository.findBreedById(id);
        if (!optionalDog.isPresent()){
            throw new DogNotFoundException();
        }
        else return optionalDog.get();
    }

    // Alternative implementation of the above method
    // NB: to use this alternative implementation,
    // we unwrap the the Optional class from the  method return type of String

//    public String retrieveDogBreedById(Long id) {
//        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
//        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
//        return breed;
//    }



    public List<String> retrieveDogBreeds(){
        return dogRepository.findAllBreed();
    }

    public List<String> retrieveDogNames(){
        return dogRepository.findAllName();
    }

    public List<Dog> retrieveDogs(){
        return (List<Dog>) dogRepository.findAll();
    }





}
