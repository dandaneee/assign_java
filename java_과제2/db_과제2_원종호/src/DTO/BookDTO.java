package DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import vo.BookDTO;

public class BookDTO {
	public int insertEmp(BookDTO dto) {
		int rows = 0;
		Connection con = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection
		("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr", "hr");
		System.out.println("���Ἲ��");
		
		//������ ����
		 String sql = "insert into book values(" + dto.getIsbn() + ", '" + dto.getTitle() + "', '" 
					+ dto.getAuthor()  + "' , '" + dto.getPublisher() + "' ," +  dto.getPrice() + ",'" +dto.getDesc())+ '; "
		//insert into book values(isbn, 'title', 'author' , 'publisher', price, 'desc', 'date') 
		
			Statement st = con.createStatement();
					rows = st.executeUpdate(sql);
		con.close(); // ��������
		System.out.println("�������� ����");
		
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� Ŭ���� ��ġ Ȯ���ϼ���");
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally {
			try {
			if(con.isClosed()==false) {
				con.close();
				System.out.println("finally�������� ����");
			}//if end
			} //try end
				catch(SQLException e) { }
		} //finally end
		
		
		
		return rows;
	}
		
	}//main end

public 	ArrayList<BookDTO> getBookDTO(){
	ArrayList<BookDTO> list = new ArrayList <BookDTO>();

	Connection con = null; 
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection
	("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr", "hr");
	System.out.println("���Ἲ��");
	 String sql = "select isbn, title, author, publisher, price, desc, publish_date  from book"
	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql); 
	System.out.println(rs.toString());
	 while (rs.next()) { 
		  int isbn = rs.getInt("isbn");
		  String title =rs.getString("title");
		  String author =rs.getString("author");
		  String publisher = rs.getString("publisher");
		  int price = rs.getint("price");
		  String desc =rs.getString("desc");
		  
		  BookDTO dto =new BookDTO(isbn, title, author, publisher, price, desc); 
		  list.add(dto);
	  		}
	 
	con.close(); //������ �������
	System.out.println("�������� ����");
	
	} catch (ClassNotFoundException e) {
		System.out.println("����̹� Ŭ���� ��ġ Ȯ���ϼ���");
	} catch (SQLException e) { 
		e.printStackTrace();
	} finally {
		try {
		if(con.isClosed()==false) {
			con.close();
			System.out.println("finally�������� ����");
		}//if end
		} //try end
			catch(SQLException e) { }
	} //finally end
	
	
	
	return list;
}
}
