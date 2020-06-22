package com.udacity.bootstrap.service;

import com.udacity.bootstrap.Entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DogService  {

    public String retrieveDogBreedById(Long id);
    public List<String> retrieveDogBreeds();
    public List<String> retrieveDogNames();
    public List<Dog> retrieveDogs();
}
