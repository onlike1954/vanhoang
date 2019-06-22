package classs;
import java.util.Scanner;
import java.text.DecimalFormat;

public class vidu3 implements Figure 
{
	public double bankinh;
	public static final float PI = 3.14f;
	public vidu3()
	{
		bankinh=bankinh;
	}

	@Override
	public double calS() 
	{
		return ((this.bankinh)*this.bankinh)*PI;
	}

	@Override
	public double calP()
	{
		return this.bankinh*2*PI;
	}

	@Override
	public void output()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào bán kính : ");
	    bankinh = scanner.nextDouble();
	    System.out.println("Diện tích hình tròn là:" +calS());
		System.out.println("Chu vi hình trònlà:" +calP());
	}
	public static void main(String[] args)
	{	
		vidu3 hinh = new vidu3();
		hinh.output();
	}

		

}
