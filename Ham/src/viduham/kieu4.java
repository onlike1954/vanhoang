package viduham;

import java.util.Random;

public class kieu4 {
	public static  float getRandomnumber()
	{
		float result ;
		Random r = new Random();
		result = r.nextFloat();
		System.out.println("Số vừa được sinh ra là " + result);
		return result;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// random số ngẫu nhiên
		float x, y;
		x = getRandomnumber();
		y= getRandomnumber();
	}

}
