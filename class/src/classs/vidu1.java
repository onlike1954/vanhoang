package classs;

import java.util.Scanner;

public class vidu1 implements Figure 
{
	public double chieudai;
	public double chieurong;
	public vidu1()
	{
		chieudai = chieudai;
		chieurong =chieurong;	
	}

	@Override
	public double calS() 
	{
		// TODO Auto-generated method stub
		return this.chieudai*this.chieurong;
	}

	@Override
	public double calP()
	{
		// TODO Auto-generated method stub
		return (this.chieudai+this.chieurong)*2;
	}
	public void output()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chieu dai: ");
	    chieudai = scanner.nextDouble();
	    System.out.println("Nhập chieu rong: ");
	    chieurong = scanner.nextDouble();
		System.out.println("Diện tích chữ nhật là:" +calS());
		System.out.println("Chu vi hình chữ nhật là:" +calP());
	}
	
	
	public static void main(String[] args)
	{	
		vidu1 hinhcn = new vidu1();
		hinhcn.output();
	}

}

