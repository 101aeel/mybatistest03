package com.neuedu.demo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer stuId;
    private String stuName;
    private String sex;
}
