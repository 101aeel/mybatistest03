package com.neuedu.demo.dao;

import com.neuedu.demo.pojo.Student;

import java.util.List;


public interface StudentMapper {
    public List<Student> queryAllMessage();

    public int updateMessage(Student student);
}
