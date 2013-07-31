package com.mrroman.springgames.service;

import java.util.Collection;
import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrroman.springgames.domain.Player;
import com.mrroman.springgames.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	@Transactional
	public Player save(Player player) {
		Collection<Player> list = playerRepository.findByNameAndSurname(player.getName(), player.getSurname());
		if (list.isEmpty()) {
			return playerRepository.save(player);
		} else {
			throw new ValidationException("Player already exists");
		}
	}
}
