package classs;

import java.util.Scanner;

class vidu2 implements Figure {
	public double AB;
	public double BC;
	public double AC;
	public double h;
	public vidu2()
	{
		AB=AB;
		BC=BC;
		AC=AC;
		h=h;	
	}

	@Override
	public double calS() {
		// TODO Auto-generated method stub
		return (this.BC/2)*this.h;
	}

	@Override
	public double calP() {
		// TODO Auto-generated method stub
		return this.AB+this.AC+this.BC;
	}
	public void output()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh AB: ");
	    AB = scanner.nextDouble();
	    System.out.println("Nhập cạnh BC: ");
	    BC = scanner.nextDouble();
	    System.out.println("Nhập cạnh AC: ");
	    AC = scanner.nextDouble();
	    System.out.println("Nhập chiều cao h: ");
	    h = scanner.nextDouble();
	    scanner.close();
		System.out.println("Diện tích tam giác là:" +calS());
		System.out.println("Chu vi hình tam giác là:" +calP());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		vidu2 hinhcn = new vidu2();
		hinhcn.output();
	}

}
