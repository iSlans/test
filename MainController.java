/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.serverApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sandro
 */
@Controller
@RequestMapping(path = "/drivers")
public class MainController {

	@Autowired
	private DriverRepository driverRepository;

	@GetMapping(path = "/all")
	public @ResponseBody
	Iterable<Driver> getAllUsers() {
		return driverRepository.findAll();
	}
}
