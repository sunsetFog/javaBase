package com.JDBC;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.Statement;
import java.util.Properties;
// 引入驱动包
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.*;
// 简单版，不是动态
public class Jdbc01 {
    public static void main(String[] args)throws Exception{
        // 驱动包加入项目
        // 注册驱动
        Driver driver = new Driver(); // 创建driver对象

        // 2.得到链接  jdbc:mysql:// 协议     localhost主机    3306端口   db_news数据库
        String url = "jdbc:mysql://localhost:3306/db_news";
        // 将用户名和密码放入到Properties对象
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root123456");

        Connection connection = driver.connect(url, properties);

        // 3.执行sql
        String sql = "insert into goods values(134, 'nannan', '2021-12-12')";
        // Statement执行mysql语句
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);// 1 成功   0 失败

        System.out.println(rows > 0 ? "成功" : "失败");

        // 4.关闭连接资源
        statement.close();
        connection.close();

    }
}
