package javaAccessModifier2;

import javaAccessModifier1.PuneCity;

public class OtherState extends PuneCity
{
	
	public void getBus()
	{
		System.out.println(busNo);//The field A1.age is not visible
	}

}
