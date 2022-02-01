package com.solvd.onlinestore.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import java.sql.*;


public class ConnectionPool {

    private static final Logger log = Logger.getLogger(ConnectionPool.class);

    private static final String JBDC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
    private static final String JBDC_USER = "root";
    private static final String JBDC_PASSWORD = "admin";

    private static ConnectionPool connectionPool;
    private static int connectionCounter = 0;


    private static final int MAX_CONNECTIONS = 5;
    private static List<Connection> connections = new ArrayList<>(MAX_CONNECTIONS);

    public ConnectionPool() {
    }

    public static ConnectionPool getInstance() {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
        }
        
        return connectionPool;
    }

    public Connection getConnection(){
        
        Connection con=null;
        
        try {
            con= DriverManager.getConnection(JBDC_URL,JBDC_USER,JBDC_PASSWORD);
        } catch (SQLException e) {
            log.info("Can't connect");
            e.printStackTrace();
        } 
    
        return con;
    }
    
    public void close(ResultSet rs) throws SQLException{
        rs.close();
    }

    public void close (PreparedStatement st) throws SQLException{
        st.close();
    }

    public void close(Connection con) throws SQLException{
        con.close();
    }
    


}