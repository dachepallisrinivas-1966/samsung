package com.samsung.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/friends")
@Scope("session")
public class FriendsController {
	
	List<String> friends;
	
	/*
	 * http://loclahost:8081/friends
	 */
	@GetMapping
	public ModelAndView defaultAction() {
		return new ModelAndView("friends/friends-page","friends",friends);
	}

	/*
	 * http://loclahost:8081/friends/add
	 */
	@GetMapping("/add")
	public ModelAndView addFriendAction(@RequestParam("fnm") String friend) {
		if(friends==null) {
			friends = new ArrayList<>();
		}
		friends.add(friend);
		return new ModelAndView("friends/friends-page","friends",friends);
	}
	

	/*
	 * http://loclahost:8081/friends/remove
	 */
	@GetMapping("/remove")
	public ModelAndView removeFriendAction(@RequestParam("fnm")String friend) {		
		friends.remove(friend);
		return new ModelAndView("friends/friends-page","friends",friends);
	}
}
