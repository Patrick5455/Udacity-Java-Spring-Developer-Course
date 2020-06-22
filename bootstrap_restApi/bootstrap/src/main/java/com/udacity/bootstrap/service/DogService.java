package com.udacity.bootstrap.service;

import com.udacity.bootstrap.Entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DogService  {

   public List retrieveDogBreed();
   public List retrieveDogBreedById(Integer id);
   public List retrieveDogNames();









}
