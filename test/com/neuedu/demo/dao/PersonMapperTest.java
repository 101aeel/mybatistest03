package com.neuedu.demo.dao;

import com.neuedu.demo.pojo.Emp;
import com.neuedu.demo.pojo.Person;
import com.neuedu.demo.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import static org.junit.Assert.*;


public class PersonMapperTest {
    private SqlSessionFactory factory= SqlSessionUtil.getSqlSessionFactory();
    @Test
    public void queryMessageById(){
        SqlSession session=factory.openSession();
        PersonMapper personMapper=session.getMapper(PersonMapper.class);
        Person person=personMapper.queryMessageById(2);
        System.out.println(person);
    }



}