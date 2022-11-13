package com.neuedu.demo.dao;

import com.neuedu.demo.dto.EmpDeptDTO;
import com.neuedu.demo.pojo.Dept;
import com.neuedu.demo.pojo.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface EmpMapper {
    public Emp queryEmpAndDeptByEmpno(Integer empno);

    public List<Emp> queryAllEmp();
    //使用DTO
    public List<EmpDeptDTO> queryAllMessage();

    @Select("select * from emp e,dept d where e.deptno=d.deptno and empno=#{empno} ")
    public EmpDeptDTO querEmpAndDeptById(Integer empno);



}
