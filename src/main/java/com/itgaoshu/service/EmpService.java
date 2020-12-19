package com.itgaoshu.service;

import com.itgaoshu.bean.Emp;

import java.util.List;

/**
 * @author 曹小花
 * @Title: EmpService
 * @Description: SpringCloudAlibaba课程
 * @date 2020/12/17 0017 15:28
 */
public interface EmpService {
        public List<Emp> selectEmpList();
}
