

public class ProductTest {
	public static void main(String[] args) {
		
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사\t");
		
		
		for(int i=0; i<5; i++) {
			System.out.print("--------");
		}
		System.out.println("");
		
		Product pro1 = new Product("001","노트북",1200000,2021,"삼성");
		Product pro2 = new Product("002","모니터",300000,2021,"LG");
		Product pro3 = new Product("003","마우스",30000,2020,"로지텍");
		
		System.out.println(pro1.toString());
		System.out.println(pro2.toString());
		System.out.println(pro3.toString());
		
		
	}

}

class Product{
	
	String proNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	Product(String proNo, String prdName, int prdPrice, int prdYear, String prdMaker){
		this.proNo = proNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}
	
	public String toString() {
		
		return String.format("%s\t%s\t%d\t%d\t%s",proNo,prdName,prdPrice,prdYear,prdMaker);
	}

	
}
