package com.mrroman.springgames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mrroman.springgames.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

	
}
