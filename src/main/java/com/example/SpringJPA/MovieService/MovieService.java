package com.example.SpringJPA.MovieService;

import com.example.SpringJPA.Model.Movie;
import com.example.SpringJPA.MovieRepository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepo movieRepo;

    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }
    public  void addMovies(Movie movie){
         movieRepo.save(movie);
    }
}
