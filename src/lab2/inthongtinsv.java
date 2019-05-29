package lab2;
import java.util.Scanner;
class inthongtinsv {
	public static void main(String[] args) {
		String name;
        int year;
        String address;
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên của sinh viên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh của sinh viên: ");
        year = Integer.parseInt(scanner.nextLine());//khắc phuc hiện tượng trôi lệnh
        System.out.println("Nhập vào địa chỉ của sinh viên: ");
        address = scanner.nextLine();
         
        System.out.println("Họ tên của sinh viên: " + name);
        System.out.println("Tuổi của sinh viên =  " + year);
        System.out.println("Địa chỉ của sinh viên: " + address);

	}

}
