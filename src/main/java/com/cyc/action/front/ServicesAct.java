package com.cyc.action.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huzuxing on 2017/6/22.
 */
@Controller
public class ServicesAct {

    private static final String SERVICES = "front/services/services";

    @RequestMapping(value = "/services", method = RequestMethod.GET)
    public String services() {

        return SERVICES;
    }
}
