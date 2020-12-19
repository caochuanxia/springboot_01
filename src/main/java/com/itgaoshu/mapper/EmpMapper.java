package com.itgaoshu.mapper;

import com.itgaoshu.bean.Emp;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author 曹小花
 * @Title: EmpMapper
 * @Description: SpringCloudAlibaba课程
 * @date 2020/12/17 0017 15:26
 */
//自定义的Mapper接口继承自tk.mybatis.mapper.common.Mapper<T>,泛型为当前接口操作的表对应的实体类
//@Mapper
public interface EmpMapper extends Mapper<Emp> {
    /*@Select("select * from emp")
    public List<Emp> selectEmpList();*/
    
}
