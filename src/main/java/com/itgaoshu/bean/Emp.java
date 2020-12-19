package com.itgaoshu.bean;

/**
 * @author 曹小花
 * @Title: Emp
 * @Description: SpringCloudAlibaba课程
 * @date 2020/12/17 0017 15:23
 */

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 1.实体类实现序列化接口
 * 2.属性类型改为包装类类型
 * 3.在类上使用@Table注解指定此实体类对应的表
 * 4.在唯一属性上使用@Id注解关联表中的主键
 * 5.如果属性名和表中字段名不一致的情况下需要在属性上使用@Column注解进行关联
 */
@Table(name="emp")
public class Emp implements Serializable {
    @Id
    private Integer empno;
    private String ename;
    private Double salary;
    private String hiredate;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
