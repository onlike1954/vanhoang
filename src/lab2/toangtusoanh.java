package lab2;
import java.util.Scanner;
public class toangtusoanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        a = scanner.nextInt();
        System.out.println("Nhập b : ");
        b = scanner.nextInt();
        System.out.println("Kết quả của so sánh bằng " + a + " và " + 
                b + " là " + (a == b));
        System.out.println("Kết quả của so sánh không bằng " + a + " và " + 
                b + " là " + (a != b));
        System.out.println("Kết quả của so sánh lớn hơn " + a + " và " + 
                b + " là " + (a > b));
        System.out.println("Kết quả của so sánh lớn hơn hoặc bằng " +a + " và " + 
                b + " là " + (a >= b));
        System.out.println("Kết quả của so sánh nhỏ hơn " + a + " và " + 
                b + " là " + (a < b));
        System.out.println("Kết quả của so sánh nhỏ hơn hoặc bằng " + a + " và " + 
                b + " là " + (a <= b));

	}

}
