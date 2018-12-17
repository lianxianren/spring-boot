package com.baizhi.service;

import com.baizhi.entity.Province;
import com.baizhi.mapper.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceMapper provinceMapper;

    @Override
    public List<Province> getAll() {
        List<Province> list = provinceMapper.selectAll();
        return list;
    }
}
