package com.jl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDAE
 *
 * @Author: JINLEI
 * @Description: servlet
 * @Date: 2022/3/6
 * @Time: 15:04
 **/
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello");
//      this.getInitParameter()  初始化参数
//      this.getServletConfig()   Servlet配置

        // this.getServletContext()  Servlet上下文
        ServletContext context = this.getServletContext();
        String username = "金额里";
        context.setAttribute("username",username);//将一个数据保存在ServletContext中，名字为 username  值为 username

    }
}
