package ifelse;
import java.util.Scanner;
class tinhdiemtrunbienh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int year;
		String address;
		double diemhk1, diemhk2, diemtrungbinh;
		String ketQuaXepLoai;
		
		for (int i=1; i<6; i++) {
			System.out.println(i);
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào tên sinh viên: " );
        name = scanner.nextLine();
        System.out.println("Nhập năm sinh: " );
        year = Integer.parseInt(scanner.nextLine());//Khắc phục lỗi trôi lệnh
        System.out.println("Địa chỉ: " );
        address = scanner.nextLine();
        System.out.println("Nhập điểm TB hk1:" );
        diemhk1 = scanner.nextDouble();
        System.out.println("Nhập điểm TB hk2: ");
        diemhk2= scanner.nextDouble();
        diemtrungbinh = ((diemhk1 + diemhk2*2.0)/3);
        
        if (diemtrungbinh >= 8.5) {
            ketQuaXepLoai = "Loại A";
        } else if ((diemtrungbinh >= 7) && (diemtrungbinh < 8.5)) {
            ketQuaXepLoai = "Loại B";
        } else if ((diemtrungbinh >= 5.5) && (diemtrungbinh < 7)) {
            ketQuaXepLoai = "Loại C";
        } else if ((diemtrungbinh > 4) && (diemtrungbinh< 5.5)) {
            ketQuaXepLoai = "Loại D";
        } else  {
            ketQuaXepLoai = "Loại F";
        }
        
        System.out.println("Họ tên sinh viên: " + name);
        System.out.println("Năm sinh :  " + year);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Điểm Tb cả năm : " + diemtrungbinh);
        System.out.println("Kết quả xếp loại môn học của sinh viên là " + ketQuaXepLoai);
		}		
	}
	}
