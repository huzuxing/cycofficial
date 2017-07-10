package com.cyc.service.impl;

import com.cyc.dao.CycUserDao;
import com.cyc.entity.CycUser;
import com.cyc.service.CycUserService;
import com.cyc.utls.EncryptUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by huzuxing on 2017/7/4.
 */
@Service("cycUserService")
public class CycUserServiceImpl implements CycUserService {

    @Resource
    private CycUserDao cycUserDao;

    @Override
    public CycUser login(String username, String password) {
        CycUser bean = new CycUser();
        bean.setUsername(username);
        bean.setPassword(EncryptUtils.encodePassword(password));
        return cycUserDao.findOne(bean);

    }
}
