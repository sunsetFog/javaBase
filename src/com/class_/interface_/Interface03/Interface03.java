package com.class_.interface_.Interface03;

public class Interface03 {
    public static void main(String[] args) {

        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}
