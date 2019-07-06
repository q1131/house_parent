package com.kgc.house.controller;

import com.kgc.house.entity.Emp;
import com.kgc.house.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test/")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("getAll")
    @ResponseBody
    public List<Emp> getAll(){
        return empService.getEmpAndDept();
    }
}
