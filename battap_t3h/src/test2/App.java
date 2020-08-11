package test2;

public class App {

	public static void main(String[] args) {
		
		/*Loaive: Cao Cap :10000
				  Thuong Gia:5000
				  Trung Cap:2000*/
		information information = new information("Trung Cap","Cao truong giang","nam",7,19,"Ha Noi",3,2000);
		System.out.println(information);
		information.payableMoney();
		
		
	}  

}
