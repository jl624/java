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
 * @Date: 2021/12/2
 * @Time: 9:32
 **/
public class Response2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getAttribute("key1"));
        resp.getWriter().write("response2 是 result!");
    }
}
