package com.neuedu.demo.dao;

import com.neuedu.demo.pojo.Dept;
import com.neuedu.demo.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeptMapperTest {
    private SqlSessionFactory factory= SqlSessionUtil.getSqlSessionFactory();
    @Test
    public void queryDeptAndEmpsByDeptno(){
        SqlSession session=factory.openSession();
        DeptMapper deptMapper=session.getMapper(DeptMapper.class);
        Dept dept=deptMapper.queryDeptAndEmpsByDeptno(10);
        dept.getEmpList();
    }

}