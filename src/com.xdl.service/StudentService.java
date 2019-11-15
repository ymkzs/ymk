package com.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.bean.Student;
import com.xdl.mapper.StudentDao;

@Service("adminService")
public class StudentService {
	@Autowired
	private StudentDao admindao;
	
	public Student login(String name,String password) {
		return admindao.findByNameAndPassword(name, password);
	}
	
}
