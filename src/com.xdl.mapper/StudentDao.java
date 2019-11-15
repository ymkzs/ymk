package com.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import com.xdl.bean.Student;

public interface StudentDao {
	
	Student findByNameAndPassword(@Param("username")String name,@Param("password")String password);

}
