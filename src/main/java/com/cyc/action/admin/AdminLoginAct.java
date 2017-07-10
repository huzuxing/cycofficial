package com.cyc.action.admin;

import com.cyc.common.ResponseBean;
import com.cyc.entity.CycUser;
import com.cyc.service.CycUserLoginLogService;
import com.cyc.service.CycUserService;
import com.cyc.utls.IpUtils;
import com.cyc.utls.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by huzuxing on 2017/7/4.
 */
@Controller
public class AdminLoginAct {
    @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
    public String login() {
        return "admin/login";
    }

    @ResponseBody
    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public ResponseBean sublogin(HttpServletRequest request, String username, String password) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password)) {
            responseBean.setCode(1001);
            responseBean.setMsg("username or password must not be null");
        }
        else {
            CycUser user = cycUserService.login(username, password);
            if (null != user) {
                cycUserLoginLogService.save(user.getId(), IpUtils.getRealIp(request), 1);
                responseBean.setCode(200);
                request.getSession().setAttribute("user", user);
            }
            else {
                responseBean.setCode(1002);
                responseBean.setMsg("username or password error");
            }
        }
        return responseBean;
    }

    @Resource
    private CycUserService cycUserService;
    @Resource
    private CycUserLoginLogService cycUserLoginLogService;
}
