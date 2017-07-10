package com.cyc.action.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huzuxing on 2017/6/22.
 */
@Controller
public class CasesAct {

    private static final String CASES = "front/cases/cases";

    @RequestMapping(value = "/cases", method = RequestMethod.GET)
    public String cases() {

        return CASES;
    }
}
