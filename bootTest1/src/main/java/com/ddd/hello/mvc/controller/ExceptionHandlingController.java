package com.ddd.hello.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/error")
@Controller
public class ExceptionHandlingController {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String error(HttpServletRequest req, HttpServletResponse res,
			Exception e) throws IOException {
		return "Exception : " + e.getMessage();
	}
}
