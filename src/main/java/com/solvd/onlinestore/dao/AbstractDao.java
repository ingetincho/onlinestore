package com.solvd.onlinestore.dao;

import java.sql.Connection;

import com.solvd.onlinestore.db.ConnectionPool;

public class AbstractDao {
    public Connection getCon(){
        return ConnectionPool.getInstance().getConnection();

    }
}
