package com.cyc.service;

import com.cyc.entity.CycUser;

/**
 * Created by huzuxing on 2017/7/4.
 */
public interface CycUserService {
    CycUser login(String username, String password);
}
