package chuoivsmang;

import java.util.Scanner;

public class noichuoi 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String chuoi1, chuoi2;
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Nhập chuỗi 1 ");
		 chuoi1 = scanner.nextLine();
		 System.out.println("Nhập chuỗi 2");
		 chuoi2 = scanner.nextLine();
		 
		 String ketquachuoi = chuoi1.concat(chuoi2);
		 System.out.println(ketquachuoi);
		 scanner.close();
	}
}