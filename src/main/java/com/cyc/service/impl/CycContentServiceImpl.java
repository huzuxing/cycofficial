package com.cyc.service.impl;

import com.cyc.dao.CycContentDao;
import com.cyc.entity.CycContent;
import com.cyc.service.CycContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by huzuxing on 2017/7/4.
 */
@Service("cycContentService")
public class CycContentServiceImpl implements CycContentService {
    @Resource
    private CycContentDao cycContentDao;

    @Override
    public void save(CycContent bean) {
        cycContentDao.save(bean);
    }

    @Override
    public List<CycContent> getNews(CycContent bean, Integer pageNo, Integer pageSize) {
        return cycContentDao.findContent(bean, (pageNo - 1) * pageSize, pageSize);
    }

    @Override
    public int count(CycContent bean) {
        return 0;
    }

    @Override
    public void delete(Integer id) {
        cycContentDao.delete(id);
    }


}
