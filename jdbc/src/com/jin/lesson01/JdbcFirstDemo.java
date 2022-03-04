package com.jin.lesson01;

import java.sql.*;

/**
 * Create with IntelliJ IDAE
 *
 * @Author: JINLEI
 * @Description: JDBC
 * @Date: 2022/3/4
 * @Time: 19:47
 **/
public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1、加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2、用户信息和url
        String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "root";
        //3、连接成功，数据库对象
        Connection connection = DriverManager.getConnection(url,username,password);
        //4、执行SQL的对象
        Statement statement = connection.createStatement();
        //5、执行SQL的对象去执行SQL，查看返回结果
        String sql = "SELECT * FROM category";
        ResultSet resultSet = statement.executeQuery(sql);//返回的结果集,封装了我们查询的出来的结果
        while (resultSet.next()){
            System.out.println("cid"+ resultSet.getObject("cid"));
            System.out.println("category"+ resultSet.getObject("category"));
        }
        //6、释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
