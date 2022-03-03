package com.jl.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create with IntelliJ IDAE
 *
 * @Author: JINLEI
 * @Description:
 *  * 请求重定向的特点：
 *  *      1、浏览器地址栏会发生改变
 *  *      2、两次请求
 *  *      3、不共享Request域中的数据
 *  *      4、不能访问WEB-INF下的资源
 *  *      5、可以访问工程外的资源
 *  推荐使用的重定向方法：
 *          resp.sendRedirect("http://localhost:8080/1_servlet/response2");
 * @Date: 2021/12/2
 * @Time: 9:32
 **/
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游 response1");

        req.setAttribute("key1","value1");

        //设置响应状态码302.表示重定向（已搬迁）
        //resp.setStatus(302);

        //设置响应头，说明新的地址在哪里
        //resp.setHeader("Location","http://localhost:8080/1_servlet/response2");

        resp.sendRedirect("http://localhost:8080/1_servlet/response2");
    }
}
