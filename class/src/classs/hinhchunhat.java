package classs;

import java.util.Scanner;

public class hinhchunhat extends Figure
{
	public double chieudai;
	public double chieurong;
	public hinhchunhat()
	{
	chieudai = chieudai;
	chieurong =chieurong;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập chieu dai: ");
    chieudai = scanner.nextDouble();
    System.out.println("Nhập chieu rong: ");
    chieurong = scanner.nextDouble();
    super.S=this.chieudai *this.chieurong;
    super.P=(this.chieudai +this.chieurong)*2; 
    scanner.close();
    }
	
	
	
	/*public void printhinhchunhat() {
		System.out.println("dien tich hinh chu nhat la: " +this.S);
		System.out.println("chu vi hinh chu nhat la: " +this.P);
		
	}
	
	public static void main(String[] args)
	{

		hinhchunhat hinh = new hinhchunhat();
		hinh.printhinhchunhat();
	}*/
	public static void main(String[] args)
	{	
		hinhchunhat hinh = new hinhchunhat();
		hinh.output();

	}

	
}
