package com.durham.cs.esnlilabeller.service.impl;

import com.durham.cs.esnlilabeller.mapper.EsnliTrainMapper;
import com.durham.cs.esnlilabeller.model.EsnliTrainEntity;
import com.durham.cs.esnlilabeller.service.EsnliTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EsnliTrainServiceImpl implements EsnliTrainService {

    private EsnliTrainMapper esnliTrainMapper;

    @Autowired
    public void setEsnliTrainMapper(EsnliTrainMapper esnliTrainMapper) {
        this.esnliTrainMapper = esnliTrainMapper;
    }

    @Override
    public EsnliTrainEntity getById(Long id) {
        return esnliTrainMapper.selectById(id);
    }
}
