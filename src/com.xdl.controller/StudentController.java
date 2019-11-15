package com.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xdl.bean.Student;
import com.xdl.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/tologin.do")
	public String tologin() {
		return "login";
	}
	
	@RequestMapping("/login.do")
	public String login(String username, String password, HttpServletRequest request) {
		System.out.println(username);
		Student admin = studentService.login(username, password);
		if (admin !=null) {
			return "main";
		}
		request.setAttribute("msg", "登录失败");
		return "login";
	}

}
