package com.mrroman.springgames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrroman.springgames.domain.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {

}
