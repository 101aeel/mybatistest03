package com.neuedu.demo.dao;

import com.neuedu.demo.dto.EmpDeptDTO;
import com.neuedu.demo.pojo.Dept;
import com.neuedu.demo.pojo.Emp;
import com.neuedu.demo.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class EmpMapperTest {
    private SqlSessionFactory factory= SqlSessionUtil.getSqlSessionFactory();
    @Test
    public void queryEmpAndDeptByEmpno(){
        SqlSession session=factory.openSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=empMapper.queryEmpAndDeptByEmpno(7788);
        System.out.println(emp);
    }

    @Test
    public void queryAllEmp(){
        SqlSession session=factory.openSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        List<Emp> empList=empMapper.queryAllEmp();
        for(Emp e:empList){
            System.out.println(e);
        }
    }

    @Test
    public void queryAllMessage(){
        SqlSession session=factory.openSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        List<EmpDeptDTO> empDeptDTOS=empMapper.queryAllMessage();
        for(EmpDeptDTO e:empDeptDTOS){
            System.out.println(e);
        }
    }

    @Test
    public void querEmpAndDeptById(){
        SqlSession session=factory.openSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        EmpDeptDTO emp=empMapper.querEmpAndDeptById(7931);
        System.out.println(emp);
    }


}