package javaAccessModifier1;

public class PuneCity 
{
	
	//private int busNo = 3456;//private - same class

	//int busNo = 3456;//default - same package 
	
	//protected int busNo = 3456;//inherited - level
	
	public int busNo = 3456;
	
	public void getMyBus()
	{
		System.out.println(busNo);
	}
	
}
