package chuoivsmang;
import java.util.Scanner;
public class manghaichieu
{

	public static void main(String[] args)
	{
		int m, n, sum = 0;
	    float averageNumber;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào số dòng của ma trận: ");
	    m = scanner.nextInt();
	    System.out.println("Nhập vào số cột của ma trận: ");
	    n = scanner.nextInt();
	         
	    int A[][] = new int[m][n];
	         
	    System.out.println("Nhập các phần tử cho ma trận: ");
	    for (int i = 0; i < n; i++)
	    {
	        for (int j = 0; j < n; j++)
	        {
	            System.out.print("A[" + i + "]["+ j + "] = ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	     
	    System.out.println("Mảng vừa nhập: ");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	        
	        System.out.println("\n");   
	    } 
	    
	    
	    for (int i = 0; i < m; i++)
	    {
	        int min = A[0][0];
	        for (int j = 0; j < n; j++)
	        {
	            if (A[i][j] < min)
	            {
	                min = A[i][j];
	            }
	        }
	        sum += min;
	    }
	    averageNumber = (float) sum / m;
	       
	    System.out.println("Giá trị trung bình "
	        + "của các phần tử nhỏ nhất trên mỗi cột = " + averageNumber);
	    
	    scanner.close();
	}
}

