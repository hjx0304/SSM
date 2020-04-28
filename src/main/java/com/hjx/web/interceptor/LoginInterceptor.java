package com.hjx.web.interceptor;

import com.hjx.entity.Account;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Account loginAccount = (Account) request.getSession().getAttribute("loginAccount");
        if (loginAccount == null) {
            request.setAttribute("errorMsg", "请重新登陆!!");
            request.getRequestDispatcher("/WEB-INF/pages/account/login.jsp").forward(request, response);
            return false;
        } else {
            return true;
        }


    }
}
