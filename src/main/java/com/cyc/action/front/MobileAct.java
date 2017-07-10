package com.cyc.action.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huzuxing on 2017/6/22.
 */
@Controller
public class MobileAct {

    private static final String MOBILE = "front/mobile/mobile";

    @RequestMapping(value = "/mobile", method = RequestMethod.GET)
    public String mobile() {

        return MOBILE;
    }
}
