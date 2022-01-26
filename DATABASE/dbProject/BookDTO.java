package dbProject;

public class BookDTO {
	
	private String bookNo;
	private String bookTitle;
	private String bookAuthor;
	private int bookYear;
	private int bookPrice;
	private String bookPublisher;
	
	
	BookDTO(){}
	
	//getter
	public String getBookNo() {
		return this.bookNo;
	}
	//setter
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	
	//getter
	public String getBookTitle() {
		return this.bookTitle;
	}
	//setter
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	//getter
	public String getBookAuthor() {
		return this.bookAuthor;
	}
	//setter
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	//getter
	public int getBookYear() {
		return this.bookYear;
	}
	//setter
	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	
	//getter
	public int getBookPrice() {
		return this.bookPrice;
	}
	//setter
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//getter
	public String getBookPublisher() {
		return this.bookPublisher;
	}
	//setter
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	

}
