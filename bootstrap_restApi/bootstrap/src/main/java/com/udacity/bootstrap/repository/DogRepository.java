package com.udacity.bootstrap.repository;


import com.udacity.bootstrap.Entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DogRepository extends JpaRepository<Dog,Long> {

    @Query("select d.id, d.breed from Dog d where d.id=:id")
    Optional<String> findBreedById(Long id);

    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreed();

    @Query("select d.id, d.name from Dog d")
    List<String> findAllName();
}
