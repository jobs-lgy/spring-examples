package com.javachen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javachen.model.Idea;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {

}
