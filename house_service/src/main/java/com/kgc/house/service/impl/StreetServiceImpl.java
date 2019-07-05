package com.kgc.house.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.house.entity.Street;
import com.kgc.house.entity.StreetExample;
import com.kgc.house.mapper.StreetMapper;
import com.kgc.house.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {
    @Autowired
    private StreetMapper streetMapper;

    public PageInfo<Street> selectByExample(Integer page,Integer rows) {
        PageHelper.startPage(page,rows);
        StreetExample example=new StreetExample();
        return new PageInfo<Street>(streetMapper.selectByExample(example));
    }


    public int insertSelective(Street record) {
        return streetMapper.insertSelective(record);
    }


    public int deleltStreetByDid(Integer id) {
        return streetMapper.deleltStreetByDid(id);
    }

    public int deleteByPrimaryKey(Integer id){
        return streetMapper.deleteByPrimaryKey(id);
    }


    public int delMore(Integer[] ids) {
        return streetMapper.deleteMoreType(ids);
    }


    public PageInfo<Street> selectByDid(Integer did,Integer page,Integer rows) {
        PageHelper.startPage(page,rows);
        List<Street> list = streetMapper.selectByDid(did);
        return new PageInfo<Street>(list);
    }


    public List<Street> selectById(Integer id) {
        return streetMapper.selectByDid(id);
    }
}
