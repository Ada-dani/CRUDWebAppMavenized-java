package com.e1100755.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.e1100755.model.Laite;
import com.e1100755.service.LaiteService;

@Controller

public class LaiteController {
	@Autowired
	
	private LaiteService laiteService;
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Laite laite = new Laite();
		map.put("laite", laite);
		map.put("laiteList", laiteService.getKaikkiLaite());
		return "laite";
	}

	@RequestMapping(value="/laite.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Laite laite, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Laite laiteResult = new Laite();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			laiteService.add(laite);
			laiteResult = laite;
			break;
		case "edit":
			laiteService.edit(laite);
			laiteResult = laite;
			break;
		case "delete":
			laiteService.delete(laite.getLaiteId());
			laiteResult = new Laite();
			break;
		case "search":
			Laite searchedLaite = laiteService.getLaite(laite.getLaiteId());
			laiteResult = searchedLaite!=null ? searchedLaite : new Laite();
			break;
		}
		map.put("laite", laiteResult);
		map.put("laiteList", laiteService.getKaikkiLaite());
		return "laite";
	}
}