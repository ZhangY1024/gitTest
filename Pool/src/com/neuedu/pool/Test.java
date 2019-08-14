package com.neuedu.pool;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MyDBPool mp = new MyDBPool();
		Connection conn = mp.getConnection();
		System.out.println(conn);
	}

}
