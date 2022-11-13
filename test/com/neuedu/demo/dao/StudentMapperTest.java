package com.neuedu.demo.dao;

import com.neuedu.demo.pojo.Student;
import com.neuedu.demo.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentMapperTest {
    private SqlSessionFactory factory= SqlSessionUtil.getSqlSessionFactory();
    @Test
    public void queryAllMessage1(){
        //一级缓存是默认的，sqlsession级别
        SqlSession session=factory.openSession();
        StudentMapper studentMapper=session.getMapper(StudentMapper.class);
        System.out.println("第一次查询");
        List<Student> students= studentMapper.queryAllMessage();
        for(Student s:students){
            System.out.println(s);
        }
        session.clearCache();

        System.out.println("第二次查询");
        students= studentMapper.queryAllMessage();
        for(Student s:students){
            System.out.println(s);
        }
        session.close();
    }

    @Test
    public void queryAllMessage2(){
        //二级缓存mapper级别
        SqlSession session=factory.openSession();
        StudentMapper studentMapper=session.getMapper(StudentMapper.class);
        System.out.println("第一次查询");
        List<Student> students= studentMapper.queryAllMessage();
        for(Student s:students){
            System.out.println(s);
        }
        //执行更新
//        Student student=new Student();
//        student.setStuId(1);
//        student.setStuName("赵六");
//        student.setSex("男");
//        studentMapper.updateMessage(student);
//        session.commit();
//        session.close();
        System.out.println("第二次查询");
        SqlSession session1=factory.openSession();
        StudentMapper studentMapper1=session1.getMapper(StudentMapper.class);
        students= studentMapper1.queryAllMessage();
        for(Student s:students){
            System.out.println(s);
        }
        session1.close();
     }
}