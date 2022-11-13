package com.neuedu.demo.dao;

import com.neuedu.demo.pojo.Dept;

public interface DeptMapper {
    public Dept queryDeptAndEmpsByDeptno(Integer deptno);
}
