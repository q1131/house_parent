package com.kgc.house.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.house.entity.District;
import com.kgc.house.entity.DistrictExample;
import com.kgc.house.mapper.DistrictMapper;
import com.kgc.house.mapper.StreetMapper;
import com.kgc.house.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;
    @Autowired
    private StreetMapper streetMapper;


    public PageInfo<District> getDistrictByPage(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        DistrictExample example=new DistrictExample();
        List<District> list=districtMapper.selectByExample(example);
        return new PageInfo<District>(list);
    }


    public int addDistrict(District district) {
        return districtMapper.insertSelective(district);
    }


    public int updateDistrict(District district) {
        return districtMapper.updateByPrimaryKeySelective(district);
    }

    @Transactional
    public int deleteDistrict(Integer id) {
        streetMapper.deleltStreetByDid(id);
        return districtMapper.deleteByPrimaryKey(id);
    }


    public int deleteMoreDistrict(Integer[] ids) {
        return districtMapper.deleteMoreDistrict(ids);
    }


    public List<District> getAllDistrict(DistrictExample districtExample) {
        return districtMapper.selectByExample(districtExample);
    }
}
