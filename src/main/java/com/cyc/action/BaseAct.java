package com.cyc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by huzuxing on 2017/7/8.
 */
public class BaseAct {

    protected Integer validatePageNo(Integer pageNo) {
        return null == pageNo ? 1 : pageNo;
    }
    protected Integer validatePageSize(Integer pageSize) {
        return null == pageSize ? 10 : pageSize;
    }

    protected String dateFormat(String format, Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }
}
