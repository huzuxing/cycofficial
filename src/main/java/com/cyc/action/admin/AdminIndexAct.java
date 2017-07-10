package com.cyc.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huzuxing on 2017/7/4.
 */
@Controller
public class AdminIndexAct {

    @RequestMapping(value = "/admin/index", method = RequestMethod.GET)
    public String index() {
        return "admin/index";
    }
    @RequestMapping(value = "/admin/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "admin/welcome";
    }
}
