package com.cyc.dao;

import com.cyc.entity.CycUser;

/**
 * Created by huzuxing on 2017/7/4.
 */
public interface CycUserDao {
    CycUser findOne(CycUser bean);
    void save(CycUser bean);
}
