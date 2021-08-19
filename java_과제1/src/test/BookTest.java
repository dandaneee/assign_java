package test;

import book.BookDTO;

public class BookTest {

	public static void main(String[] args) {
		
		BookDTO b1 = new BookDTO( 21424, "Java Basic", "김하나", "Jean.kr" , 15000, "Java 기본 문법");
		BookDTO b2 = new BookDTO( 33455, "JDBC Pro", "김철수", "Jean.kr", 23000, " ");
		BookDTO b3= new BookDTO( 55355, "Servlet/JSP", "박자바", "Jean.kr", 41000, "Model2 기반");
		BookDTO b4= new BookDTO( 35332, "Android App", "홍길동", "Jean.kr", 25000, "Lightweight Framework");
		BookDTO b5= new BookDTO( 35355, "OOAD 분석,설계", "소나무", "Jean.kr", 30000, " ");
		
		System.out.println("**************************도서목록**************************");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}

}
