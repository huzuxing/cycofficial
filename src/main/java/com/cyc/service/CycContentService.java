package com.cyc.service;

import com.cyc.entity.CycContent;

import java.util.List;

/**
 * Created by huzuxing on 2017/7/4.
 */
public interface CycContentService {
    void save(CycContent bean);
    List<CycContent> getNews(CycContent bean, Integer pageNo, Integer pageSize);
    int count(CycContent bean);
    void delete(Integer id);
}
