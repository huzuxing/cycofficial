package com.cyc.action.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huzuxing on 2017/6/22.
 */
@Controller
public class SolutionsAct {

    private static final String SOLUTIONS = "front/solutions/solutions";

    @RequestMapping(value = "/solutions", method = RequestMethod.GET)
    public String solutions() {

        return SOLUTIONS;
    }
}
