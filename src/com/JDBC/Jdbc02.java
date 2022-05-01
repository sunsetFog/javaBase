package com.JDBC;

import com.JDBC.utils.JdbcConnect;

import java.sql.*;

//import com.JDBC.utils.JdbcConnect;
public class Jdbc02 {
    public static void main(String[] args)throws Exception{
//        JdbcConnect yyy = new JdbcConnect();
        Connection connection = JdbcConnect.connect05();
        System.out.println("---连接0---"+connection);



        String sql = "select * from goods";
        // 注入SQL，有风险，开发不用
//        Statement statement = connection.createStatement();
        // 预处理
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//          对象才能使用赋值，那executeQuery(别带spl参数了)
//        preparedStatement.setInt(1,100);
//        preparedStatement.setString(2, "红花");
//        preparedStatement.setDate(3, null);

        /*
            preparedStatement执行指定的SQL语句
            executeQuery(sql): 执行select语句，返回ResultSet对象
            executeUpdate(sql): 执行dml（update, insert, delete），返回行数
            execute(sql)
            ResultSet结果集
            next()向下移动
            previous()向上移动
            getXxx(列的索引或列名) 返回值
            getObject(列的索引或列名)  返回对象

        */
        ResultSet resultSet = preparedStatement.executeQuery(sql);

        while (resultSet.next()) {// 让光标向下移动，没有了则返回false
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            Date date = resultSet.getDate(3);
            System.out.println(id + "\t" + name + "\t" + date);
        }

        JdbcConnect.close(connection, preparedStatement, resultSet);
    }
}
