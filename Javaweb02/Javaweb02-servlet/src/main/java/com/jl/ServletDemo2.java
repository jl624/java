package com.jl;

import javax.servlet.RequestDispatcher;
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
 * @Description: 请求转发
 * @Date: 2022/3/6
 * @Time: 15:38
 **/
public class ServletDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        System.out.println("进入了方法");
//        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/gp");//转发的请求路径
//        requestDispatcher.forward(req,resp); //调用forward实现请求转发

        context.getRequestDispatcher("/gp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
