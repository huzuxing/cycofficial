package com.cyc.service.impl;

import com.cyc.dao.CycVisitorDao;
import com.cyc.entity.CycVisitor;
import com.cyc.service.CycVisitorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by huzuxing on 2017/6/27.
 */
@Service("cycVisitorService")
public class CycVisitorServiceImpl implements CycVisitorService {

    @Resource
    private CycVisitorDao cycVisitorDao;

    @Override
    public CycVisitor save(CycVisitor bean) {
        cycVisitorDao.save(bean);
        return bean;
    }
}
