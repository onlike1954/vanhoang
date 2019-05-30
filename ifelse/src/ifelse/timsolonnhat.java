package ifelse;

import java.util.Scanner;

public class timsolonnhat
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int A, B, C, solonnhat;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
        A = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        B = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        C = scanner.nextInt();
        if (A >= B) {
            if (A >= C) {
                solonnhat = A;
            } else {
                solonnhat = C;
            }
        } else if (B >= C) {
            solonnhat = B;
        } else {
            solonnhat = C;
        }
         
        System.out.println("Số lớn nhất trong 3 số " + A + ", " + B + 
                        " và " + C + " là " + solonnhat);
		scanner.close();
	}
	
}
