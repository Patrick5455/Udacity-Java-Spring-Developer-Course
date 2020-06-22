package com.udacity.bootstrap.service;

import com.udacity.bootstrap.Entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.PushBuilder;
import java.util.List;

@Service
public class DogServiceImpl implements DogService{

    @Autowired
    public DogRepository dogRepository;

    public String retrieveDogBreedById(Long id){
        return dogRepository.findBreedById(id);
    }

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
