package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;

public class Library extends Librarian{

/*	private String url = "jdbc:mysql://leia.skip.chalmers.se:3306/team1?autoReconnect=true&useSSL=false";
*	private String username = "teamone";
*	private String password = "HSaaD5vtp3K6QERq";
*	private Connection conn;
*
*	public Connection login() throws SQLException {
*		try {
*			conn = DriverManager.getConnection(url, username, password);
*		} catch (Exception E) {
*			return null;
*		}
*		return conn;
*		// throw new SQLException("ERROR");
*	} // This need to be improved.
*/

	public ResultSet sortTitle(Connection conn) throws SQLException {
		// SORT BY TITLE CODE TO TEST
		try {
			login();

			String sqlSortTitle = "SELECT* FROM book ORDER BY book_title;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortTitle);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.print(e);
			return null;
		}

	}

	public ResultSet sortTitleDesc(Connection conn) throws SQLException {
		// SORT BY TITLE DESC CODE TO TEST
		try {
			login();

			String sqlSortTitleDesc = "SELECT * FROM book ORDER BY book_title DESC;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortTitleDesc);
			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}

	}

	public ResultSet sortSurname(Connection conn) throws SQLException {
		// SORT BY SURNAME CODE TO TEST
		try {
			login();

			String sqlSortSurname = "SELECT * FROM book ORDER BY book_surname;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortSurname);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortSurnameDes(Connection conn) throws SQLException {
		// SORT BY SURNAME DESC CODE TO TEST
		try {
			login();

			String sqlSortSurnameDesc = "SELECT * FROM book ORDER BY book_surname DESC;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortSurnameDesc);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortFirstName(Connection conn) throws SQLException {
		// SORT BY FIRSTNAME CODE TO TEST
		try {
			login();

			String sqlSortFirstname = "SELECT * FROM book ORDER BY book_firstname;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortFirstname);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortFirstNameDesc(Connection conn) throws SQLException {
		// SORT BY FIRSTNAME DESC CODE TO TEST
		try {
			login();

			String sqlSortFirstnameDesc = "SELECT * FROM book ORDER BY book_firstname DESC;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortFirstnameDesc);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortGenre(Connection conn) throws SQLException {
		// SORT BY GENRE CODE TO TEST

		try {
			login();

			String sqlSortGenre = "SELECT * FROM book ORDER BY book_genre;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortGenre);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortGenreDesc(Connection conn) throws SQLException {
		// SORT BY GENRE DESC CODE TO TEST;
		try {
			login();

			String sqlSortGenreDesc = "SELECT * FROM book ORDER BY book_genre DESC;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortGenreDesc);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortPublisher(Connection conn) throws SQLException {
		// SORT BY PUBLISHER CODE TO TEST
		try {
			login();

			String sqlSortPublisher = "SELECT * FROM book ORDER BY book_publisher;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortPublisher);

			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortPublisherDesc(Connection conn) throws SQLException {
		// SORT BY PUBLISHER DESC CODE TO TEST
		try {
			login();

			String sqlSortPublisherDesc = "SELECT * FROM book ORDER BY bok_publisher DESC;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortPublisherDesc);
			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortShelf(Connection conn) throws SQLException {
		// SORT BY SHELF CODE TO TEST
		try {
			login();

			String sqlSortShelf = "SELECT * FROM book ORDER BY book_shelf_number;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortShelf);
			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet sortShelfDesc(Connection conn) throws SQLException {
		// SORT BY SHELF DESC CODE TO TEST
		try {
			login();

			String sqlSortShelfDesc = "SELECT * FROM book ORDER BY book_shelf_number DESC;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sqlSortShelfDesc);
			conn.close();
			return result;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet searchBookPublisher(Connection conn) throws SQLException{
		// SEARCH BOOK BY PUBLISHER
		try {
			login();
			
			String searchPublisher = "SELECT * FROM book WHERE book_publisher = ?;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(searchPublisher);
			conn.close();
			return result;
		}catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public ResultSet searchBookGenre(Connection conn) throws SQLException {
		// SEARCH BOOK BY GENRE 
		try {
			login();
			
			String searchGenre = "SELECT * FROM book WHERE book_genre = ?;";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(searchGenre);
			conn.close();
			return result;
			}catch (SQLException e) {
				System.out.println(e);
				return null;
			}
	}
}
