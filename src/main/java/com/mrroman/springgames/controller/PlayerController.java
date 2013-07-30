package com.mrroman.springgames.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mrroman.springgames.domain.Player;

@Controller
@RequestMapping("/player")
public class PlayerController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String addPlayer(Model model) {
		model.addAttribute("player", new Player());
		return "player/edit";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String savePlayer(@Valid @ModelAttribute Player player, BindingResult result) {
		if (result.hasErrors()) {
			return "player/edit";
		} else {
			return "redirect:" + player.getId();
		}
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String editPlayer(@PathVariable Integer id, Model model) {
		model.addAttribute("player", new Player());
		return "player/edit";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String savePlayer(@PathVariable Integer id, @Valid @ModelAttribute Player player, BindingResult result) {
		return "player/edit";
	}
	
}
