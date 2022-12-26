package com.example.SpringJPA.MovieRepository;

import com.example.SpringJPA.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Here we dont need to write @Repo because JPA already have it
public interface MovieRepo extends JpaRepository<Movie,String> {
    
}
//for using 1st time we have to write "create" and afer that we have to write "update" in application.properties