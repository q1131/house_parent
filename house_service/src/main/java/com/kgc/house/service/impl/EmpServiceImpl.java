package com.kgc.house.service.impl;

import com.kgc.house.entity.Emp;
import com.kgc.house.entity.EmpExample;
import com.kgc.house.mapper.EmpMapper;
import com.kgc.house.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    public List<Emp> getEmpAndDept() {
        return empMapper.selectByExample(new EmpExample());
    }
}
