package test;

import java.util.ArrayList;

import vo.BookDTO;

public class BookTest {

	public static void main(String[] args) {
		
			BookDTO dto = new bookDTO();
			
			BookDTO b1 = new BookDTO( 21424, "Java Basic", "���ϳ�", "Jean.kr" , 15000, "Java �⺻ ����");
			BookDTO b2 = new BookDTO( 33455, "JDBC Pro", "��ö��", "Jean.kr", 23000, " ");
			BookDTO b3= new BookDTO( 55355, "Servlet/JSP", "���ڹ�", "Jean.kr", 41000, "Model2 ���");
			BookDTO b4= new BookDTO( 35332, "Android App", "ȫ�浿", "Jean.kr", 25000, "Lightweight Framework");
			BookDTO b5= new BookDTO( 35355, "OOAD �м�,����", "�ҳ���", "Jean.kr", 30000, " ");			
			int rows =dao.insertEmp(empVO);
			System.out.println(rows + " ���� �� ����");
		
			
			ArrayList<BookDTO> list = DTO.getBook(); //���� -rs-list-��������
			// list ��ȸ
			for(BookDTO vo : list) {
			//	System.out.println(vo.id); // ������ ��� ��� VO �� public������ �ȵ������Ƿ� ��� �Ұ�
				System.out.println(vo/*.toString()*/); //���-�̸�-����-...-�Ի���
			
			
        }
		
	}

}
