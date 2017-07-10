package com.cyc.service.impl;

import com.cyc.dao.CycUserDao;
import com.cyc.dao.CycUserLoginLogDao;
import com.cyc.entity.CycUser;
import com.cyc.entity.CycUserLoginLog;
import com.cyc.service.CycUserLoginLogService;
import com.cyc.service.CycUserService;
import com.cyc.utls.EncryptUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by huzuxing on 2017/7/4.
 */
@Service("cycUserLoginLoService")
public class CycUserLoginLogServiceImpl implements CycUserLoginLogService {

    @Resource
    private CycUserLoginLogDao cycUserLoginLogDao;


    @Override
    public void save(Integer id, String ip, Integer cate) {
        CycUserLoginLog bean = new CycUserLoginLog();
        bean.setId(id);
        bean.setCate(cate);
        bean.setLoginIp(ip);
        cycUserLoginLogDao.save(bean);
    }
}
