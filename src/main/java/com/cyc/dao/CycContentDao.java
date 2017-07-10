package com.cyc.dao;

import com.cyc.entity.CycContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by huzuxing on 2017/7/4.
 */
public interface CycContentDao {
    void save(CycContent bean);
    List<CycContent> findContent(@Param("bean") CycContent bean, @Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize);
    int count(@Param("bean") CycContent bean);
    void delete(@Param("id") Integer id);
}
