package classs;
import java.util.Scanner;
import java.text.DecimalFormat;

public class hinhtron extends Figure
{
	public double bankinh;
	public static final float PI = 3.14f;
	public hinhtron()
	{
		bankinh=bankinh;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào bán kính : ");
	    bankinh = scanner.nextDouble();
	    super.S=((this.bankinh)*this.bankinh)*PI;
	    super.P=this.bankinh*2*PI; 
	    scanner.close();
	}
	/*public void printhinhtron() {
		System.out.println("Diện tích hình tròn la: " +this.S);
		System.out.println("Chu vi hình tròn là: " +this.P);
		
	}
	public static void main(String[] args)
	{

		hinhtron hinh = new hinhtron();
		hinh.printhinhtron();
	}*/
	public static void main(String[] args)
	{	
		hinhtron hinh = new hinhtron();
		hinh.output();

		
	}

}
