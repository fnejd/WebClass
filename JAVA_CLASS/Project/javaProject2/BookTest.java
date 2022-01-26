

public class BookTest {
	public static void main(String[] args) {
		
		
		
		System.out.println("도서번호\t도서명\t\t저자\t가격\t발행일\t출판사");
		for(int i=0; i<6; i++) {
			System.out.print("---------");
		}
		System.out.println("");
		
		
		Book book1  = new Book("B001","자바 프로그래밍","홍길동",2021,25000,"멀티출판사");
		Book book2  = new Book("B002","자바스크립트","이몽룡",2020,30000,"서울출판사");
		Book book3  = new Book("B003","HTML/CSS","성춘향",2021,18000,"강남출판사");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		System.out.println();
		
		
		System.out.println("잡지번호\t잡지명\t발행인\t가격\t발행연도\t출판사\t발행월");
		for(int i=0; i<7; i++) {
			System.out.print("--------");
		}
		System.out.println("");
		
		Magazine mag1 = new Magazine("M001","자바 월드","홍길동",2021,25000,"멀티출판사",5);
		Magazine mag2 = new Magazine("M002","웹 월드","이몽룡",2020,30000,"서울출판사",7);
		Magazine mag3 = new Magazine("M003","게임 월드","성춘향",2021,18000,"강남출판사",9);
		
		System.out.println(mag1.toString());
		System.out.println(mag2.toString());
		System.out.println(mag3.toString());
		
		
	}

}

class Book{
	
	String bookNo;
	String bookTitle;
	String bookAuthor;
	int bookYear;
	int bookPrice;
	String bookPublisher;
	
	//생성자
	Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, 
			int bookPrice, String bookPublisher){
		
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;	
	}
	

	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d\t%s", bookNo,bookTitle,bookAuthor,bookPrice,bookYear,bookPublisher);
	}
	
}

class Magazine extends Book{
	
	int month;
	
	//생성자
	Magazine(String no, String title, String author, int year, int price, String publisher, int month){
		super(no, title, author, year, price, publisher);
		this.month = month;
	}
	
	public String toString() {
		
		return super.toString()+ "\t"+month;
	}
	
	
	
}