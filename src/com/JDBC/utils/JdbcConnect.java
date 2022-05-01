package com.JDBC.utils;

//import java.sql.Driver;
// 引入驱动包
import com.mysql.jdbc.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcConnect {
    private static String user; // 用户名
    private static String password; // 密码
    private static String url; // url
    private static String driver; // 驱动名

    // 在static代码块去初始化
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\mysql.properties"));

            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            System.out.println("---static初始化---" + user);
        } catch (Throwable e) { // 默认Throwable、IOException、SQLException
            // 编译异常转运行异常
            // 捕获改异常或默认处理该异常
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws Exception {
        connect01();
        connect02();
        connect03();
        connect04();
        connect05();
    }
    // 方式一
    public static Connection connect01() throws Exception {
        // 注册驱动
        Driver driver = new Driver(); // 创建driver对象

        // 2.得到链接  jdbc:mysql:// 协议     localhost主机    3306端口   db_news数据库
        String url = "jdbc:mysql://localhost:3306/db_news";
        // 将用户名和密码放入到Properties对象
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root123456");

        Connection connection = driver.connect(url, properties);
        System.out.println("---方式一链接---" + connection);
        return connection;
    }
    // 方式二
    public static Connection connect02() throws Exception {
        // 映射加载Driver类，动态加载，更加灵活，减少依赖性
        Class<?> lei01 = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)lei01.newInstance();

        String url = "jdbc:mysql://localhost:3306/db_news";
        // 将用户名和密码放入到Properties对象
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root123456");

        Connection connection = driver.connect(url, properties);
        System.out.println("---方式二链接---" + connection);
        return connection;
    }
    // 方式3  使用DriverManager驱动管理类 替代  driver 进行统一管理,更好的扩展性,清晰
    public static Connection connect03() throws Exception {
        // 映射加载Driver类，动态加载，更加灵活，减少依赖性
        Class<?> lei01 = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)lei01.newInstance();

        String url = "jdbc:mysql://localhost:3306/db_news";
        String user = "root";
        String password = "root123456";

        DriverManager.registerDriver(driver);//注册Driver驱动
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("---方式三链接---" + connection);
        return connection;
    }
    // 方式4 推荐使用   底层已注册加载driver
    public static Connection connect04() throws Exception {
        // 映射加载Driver类，动态加载，更加灵活，减少依赖性
        Class.forName("com.mysql.jdbc.Driver");// 可以不写，建议写

        String url = "jdbc:mysql://localhost:3306/db_news";
        String user = "root";
        String password = "root123456";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("---方式四链接---" + connection);
        return connection;
    }
    // 方式5 推荐使用 在方式4的基础上改进，增加配置文件，让连接mysql更加灵活
    public static Connection connect05() throws Exception {
        /*
            抛出所有异常
            throws Exception
            抛出指定异常
            throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException, FileNotFoundException, IOException

        */
        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("---方式五链接---" + connection);
        return connection;
    }
    // 关闭连接
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if(connection!=null) {
                System.out.println("关闭Connection成功");
                connection.close();
            }
            if(preparedStatement!=null) {
                System.out.println("关闭PreparedStatement成功");
                preparedStatement.close();
            }
            if(resultSet!=null) {
                System.out.println("关闭ResultSet成功");
                resultSet.close();
            }
        } catch (SQLException e) {
            System.out.println("关闭失败");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
