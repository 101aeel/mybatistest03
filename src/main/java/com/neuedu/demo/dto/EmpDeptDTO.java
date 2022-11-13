package com.neuedu.demo.dto;

import lombok.Data;

import java.util.Date;


@Data
public class EmpDeptDTO {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;
    private String dname;
    private String loc;
    private Integer type;
}
