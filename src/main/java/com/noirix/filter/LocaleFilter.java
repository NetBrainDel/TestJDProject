package com.noirix.filter;

import org.apache.commons.lang3.StringUtils;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LocaleFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    System.out.println("Locale Filter");

        HttpServletRequest castedRequest = (HttpServletRequest) request;
        String Language = castedRequest.getHeader("Language");
        if (StringUtils.isNotBlank(Language)) { //for future JWT Token Auth
            System.out.println("Header was found with payload: " + Language);



       } else {
            System.out.println("Header was not found!");
        }
        chain.doFilter(request, response);
    }
}
