package com.cyc.action.admin;

import com.cyc.action.BaseAct;
import com.cyc.common.Pager;
import com.cyc.common.ResponseBean;
import com.cyc.entity.CycContent;
import com.cyc.service.CycContentService;
import com.cyc.utls.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by huzuxing on 2017/7/4.
 */
@Controller
public class ContentAct extends BaseAct{

    private static final String NEWS = "admin/content/content";

    private static final String DETAIL = "admin/content/detail";

    @RequestMapping(value = "/admin/content", method = RequestMethod.GET)
    public String content(String query, Integer pageNo, Integer pageSize, ModelMap modelMap) {
        Pager<CycContent> pager = new Pager<>(validatePageNo(pageNo), validatePageSize(pageSize));
        CycContent bean = null;
        if (!StringUtils.isNullOrEmpty(query)) {
            bean = new CycContent();
            bean.setTitle(query);
        }
        List<CycContent> list = cycContentService.getNews(bean, validatePageNo(pageNo), validatePageSize(pageSize));
        int totalCount = cycContentService.count(bean);
        pager.setList(list);
        pager.setTotalCount(totalCount);
        modelMap.put("pager", pager);
        return NEWS;
    }

    @RequestMapping(value = "/admin/content/detail", method = RequestMethod.GET)
    public String detail() {

        return DETAIL;
    }

    @RequestMapping(value = "/admin/content/save", method = RequestMethod.POST)
    public String save(CycContent bean) {
        cycContentService.save(bean);
        return "redirect:/admin/content";
    }

    @ResponseBody
    @RequestMapping(value = "/admin/content/delete", method = RequestMethod.POST)
    public ResponseBean delete(Integer id) {
        ResponseBean bean = new ResponseBean();
        if (null == id) {
            bean.setCode(1001);
        }
        cycContentService.delete(id);
        bean.setCode(200);
        return bean;
    }

    @Resource
    private CycContentService cycContentService;
}
