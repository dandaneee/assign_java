package test;

import book.BookDTO;

public class BookTest {

	public static void main(String[] args) {
		
		BookDTO b1 = new BookDTO( 21424, "Java Basic", "���ϳ�", "Jean.kr" , 15000, "Java �⺻ ����");
		BookDTO b2 = new BookDTO( 33455, "JDBC Pro", "��ö��", "Jean.kr", 23000, " ");
		BookDTO b3= new BookDTO( 55355, "Servlet/JSP", "���ڹ�", "Jean.kr", 41000, "Model2 ���");
		BookDTO b4= new BookDTO( 35332, "Android App", "ȫ�浿", "Jean.kr", 25000, "Lightweight Framework");
		BookDTO b5= new BookDTO( 35355, "OOAD �м�,����", "�ҳ���", "Jean.kr", 30000, " ");
		
		System.out.println("**************************�������**************************");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}

}
