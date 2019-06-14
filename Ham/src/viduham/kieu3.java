package viduham;

public class kieu3 {
	public static float findmax(float a, float b, float c)
	{
		float max;		
		if (a >= b)
		{
            if (a >= c)
            {
                max = a;
            } else
            {
                max = c;
            }
        } else if (b >= c)
        {
            max = b;
        } else 
        {
            max = c;
        }
		System.out.println("sô lơn nhất là:" + max);
		return max; 
		
		
	}

	public static void main(String[] args)
	{
		findmax(5, 7, 8);
		
	
	}
	

}
