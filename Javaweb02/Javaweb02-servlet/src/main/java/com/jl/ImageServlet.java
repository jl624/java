package com.jl;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Create with IntelliJ IDAE
 *
 * @Author: JINLEI
 * @Description: 验证码功能
 * @Date: 2022/3/6
 * @Time: 16:00
 **/
public class ImageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //让浏览器自动刷新三秒一次
        resp.setHeader("refresh","3");

        //在内存中创建一个图片
        BufferedImage bufferedImage = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
        //设置图片的背景颜色
        g.setColor(Color.white);
        g.fillRect(0,0,80,20);

        //给图片写数据
        g.setColor(Color.BLUE);
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(makeNum(),0,20);

        //告诉浏览器这个请求用图片的方式打开
        resp.setContentType("image/jpg");
        //网站存在缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");

        //把图片写给浏览器
        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());

    }
    //生成随机数
    private String makeNum(){
        Random random = new Random();
        String i = String.valueOf(random.nextInt(99999999)) ;
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < 7-i.length(); j++) {
            sb.append("0");
        }
        i = sb.toString() +i;
        return i;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
