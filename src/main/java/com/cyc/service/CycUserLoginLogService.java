package com.cyc.service;

import com.cyc.entity.CycUserLoginLog;

/**
 * Created by huzuxing on 2017/7/4.
 */
public interface CycUserLoginLogService {
    void save(Integer id, String ip, Integer cate);
}
