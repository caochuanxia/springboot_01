package com.itgaoshu.service.impl;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.mapper.EmpMapper;
import com.itgaoshu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 曹小花
 * @Title: EmpServiceImpl
 * @Description: SpringCloudAlibaba课程
 * @date 2020/12/17 0017 15:29
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;

    //此注解使用value属性值指定在缓存中的名称空间(key),将此方法中查询的数据存储到该名称空间指定的缓存中
    @Cacheable("selectEmpList")
    public List<Emp> selectEmpList() {
        System.out.println("当第一次查询员工列表时会输出这句话,第二次就不会出现这句话了");
        return empMapper.selectAll();
    }
}
