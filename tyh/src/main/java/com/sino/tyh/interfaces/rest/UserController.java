package com.sino.tyh.interfaces.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/go")
public  class UserController {
@RequestMapping("/index")

	public String goToIndex() {
	System.out.println("sssss");
		return"index.html";
	}

}
