package test;

import java.util.ArrayList;

import vo.BookDTO;

public class BookTest {

	public static void main(String[] args) {
		
			BookDTO dto = new bookDTO();
			
			BookDTO b1 = new BookDTO( 21424, "Java Basic", "김하나", "Jean.kr" , 15000, "Java 기본 문법");
			BookDTO b2 = new BookDTO( 33455, "JDBC Pro", "김철수", "Jean.kr", 23000, " ");
			BookDTO b3= new BookDTO( 55355, "Servlet/JSP", "박자바", "Jean.kr", 41000, "Model2 기반");
			BookDTO b4= new BookDTO( 35332, "Android App", "홍길동", "Jean.kr", 25000, "Lightweight Framework");
			BookDTO b5= new BookDTO( 35355, "OOAD 분석,설계", "소나무", "Jean.kr", 30000, " ");			
			int rows =dao.insertEmp(empVO);
			System.out.println(rows + " 개의 행 삽입");
		
			
			ArrayList<BookDTO> list = DTO.getBook(); //연결 -rs-list-연결해제
			// list 조회
			for(BookDTO vo : list) {
			//	System.out.println(vo.id); // 각각의 사번 출력 VO 가 public선언이 안돼있으므로 출력 불가
				System.out.println(vo/*.toString()*/); //사번-이름-직급-...-입사일
			
			
        }
		
	}

}
