package com.mrroman.springgames.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mrroman.springgames.domain.Discipline;

@Controller
@RequestMapping("/discipline")
public class DisciplineController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String addDiscipline(Model model) {
		model.addAttribute("discipline", new Discipline());
		return "discipline/edit";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String saveDiscipline(@Valid @ModelAttribute Discipline Discipline, BindingResult result) {
		if (result.hasErrors()) {
			return "discipline/edit";
		} else {
			return "redirect:" + Discipline.getId();
		}
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String editDiscipline(@PathVariable Integer id, Model model) {
		model.addAttribute("discipline", new Discipline());
		return "discipline/edit";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String saveDiscipline(@PathVariable Integer id, @Valid @ModelAttribute Discipline Discipline, BindingResult result) {
		return "discipline/edit";
	}

}
