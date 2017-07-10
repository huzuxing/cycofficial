package com.cyc.action.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huzuxing on 2017/6/22.
 */
@Controller
public class IndexAct {
    private static final String INDEX_PATH = "front/index";
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return INDEX_PATH;
    }

}
