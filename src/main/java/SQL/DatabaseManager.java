/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Cliftonb
 */
public class DatabaseManager {

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/library";
	private static final String user = "root";
	private static final String pass = "Reddam2021";

	/**
	 * Note: the following was added to the pom.xml:
	 * <dependencies>
	 * <dependency>
	 * <groupId>mysql</groupId>
	 * <artifactId>mysql-connector-java</artifactId>
	 * <version>8.0.25</version>
	 * </dependency>
	 * </dependencies>
	 */
	//INSERT, UPDATE or DELETE
	public static void update(String update) throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, pass);

		PreparedStatement statement = conn.prepareStatement(update);
		statement.executeUpdate();
		statement.close();
	}

	//SELECT
	public static void query(String stmt) throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, pass);

		PreparedStatement statement = conn.prepareStatement(stmt);
		ResultSet resultSet = statement.executeQuery();

		processBookRequest(resultSet);

		statement.close();
	}

	//process a SPECIFIC query
	public static void processBookRequest(ResultSet rs) {
		try {
			ResultSetMetaData meta = rs.getMetaData();
			int size = meta.getColumnCount();
			while (rs.next()) {
				int isbn = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				int rating = rs.getInt(4);
				double replacement_cost = rs.getDouble(5);

				System.out.println(isbn + "#" + title + "#" + author + "#" + rating + "#" + replacement_cost);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DatabaseManager dm = new DatabaseManager();
		try {
			//dm.update("INSERT INTO books VALUES(1334, 'Hills have eyes','Peter Peterson', 2, 2.75)");

			dm.query("SELECT * FROM books");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
