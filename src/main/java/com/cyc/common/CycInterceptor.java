package com.cyc.common;

import com.cyc.entity.CycUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by huzuxing on 2017/6/29.
 */
public class CycInterceptor implements HandlerInterceptor {

    private final static String ADMIN_LOGIN_URL = "/admin/login";

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String base = httpServletRequest.getSession().getServletContext().getContextPath();
        httpServletRequest.setAttribute("base", base);
        String requestUri = httpServletRequest.getRequestURI();
        CycUser user = (CycUser) httpServletRequest.getSession().getAttribute("user");
        if (ADMIN_LOGIN_URL.equals(requestUri)) {
            if (null != user) {
                httpServletResponse.sendRedirect("index");
                return false;
            }
            return true;
        }
        if (requestUri.startsWith("/admin/")) {
            if (null == user) {
                httpServletResponse.sendRedirect("login");
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
