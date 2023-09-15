package com.example.faiyaj.watchlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.faiyaj.watchlist.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
