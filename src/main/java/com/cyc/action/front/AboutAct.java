package com.cyc.action.front;

import com.cyc.entity.CycVisitor;
import com.cyc.service.CycVisitorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by huzuxing on 2017/6/22.
 */
@Controller
public class AboutAct {

    private static final String ABOUT = "front/about";

    private static final String CONTACT = "front/contact";

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {

        return ABOUT;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact() {

        return CONTACT;
    }

    @ResponseBody
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public CycVisitor saveCycVisitor(CycVisitor bean) {
        return cycVisitorService.save(bean);
    }

    @Resource
    private CycVisitorService cycVisitorService;
}
