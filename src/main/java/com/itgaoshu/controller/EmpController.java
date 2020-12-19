package com.itgaoshu.controller;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 曹小花
 * @Title: EmpController
 * @Description: SpringCloudAlibaba课程
 * @date 2020/12/17 0017 15:32
 */
@Controller
public class EmpController {
    @Resource
    private EmpService empService;
    @RequestMapping("selectEmpList.do")
    public String selectEmpList(Model model){
        List<Emp> emps = empService.selectEmpList();
        model.addAttribute("emps",emps);
        return "list2";
    }
}
