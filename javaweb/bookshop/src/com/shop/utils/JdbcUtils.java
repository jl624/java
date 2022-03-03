package com.shop.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Create with IntelliJ IDAE
 *
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/12/4
 * @Time: 18:01
 **/
public class JdbcUtils {


    private static DruidDataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            //读取jdbc.properties属性配置文件
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //从流中加载数据
            properties.load(inputStream);
            //创建数据库连接池
            dataSource = (DruidDataSource)DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接池的连接
     * @return 如果返回null，说明获取链接失败
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = dataSource.getConnection();
        return connection;
    }

    /**
     * 关闭连接，放回数据库连接池
     * @param connection
     */
    public static void close(Connection connection) throws SQLException {
        if (connection != null){
            connection.close();
        }
    }
}
