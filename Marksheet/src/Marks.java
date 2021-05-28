
public class Marks {
	public void grade(int Math,int English,int Urdu,int Programming,int SE)
	{
		int sum = Math+English+Urdu+Programming+SE;
		double per = (sum*100)/500;
		System.out.println("\n\t\tEnglish     |"+English);
		System.out.println("\n\t\tUrdu        |"+Urdu);
		System.out.println("\n\t\tProgramming |"+Programming);
		System.out.println("\n\t\tMath        |"+Math);
		System.out.println("\n\t\tSE          |"+SE);
		System.out.println("\n\t\tPercentage  |"+per);
		if(per<50)
		{
			System.out.println("\n\t\t\t\tGrade       |F");
		}
		else if(per<60)
		{
			System.out.println("\n\t\t\t\tGrade       |C");
		}
		else if(per<70)
		{
			System.out.println("\n\t\t\t\tGrade       |B");
		}
		else if(per<80)
		{
			System.out.println("\n\t\t\t\tGrade       |A");
		}
		else
		{
			System.out.println("\n\t\t\t\tGrade       |A+");
		}
		if(per>=90)
		{
			System.out.println("\n\t\t\t\tCGPA   \t  | 4.0 ");
		}
		else if(per>=85)
		{
			System.out.println("\n\t\t\t\tCGPA   \t  | 3.8 ");
		}
		else if(per>=80)
		{
			System.out.println("\n\t\t\t\tCGPA   \t  | 3.6 ");
		}
		else if(per>=75)
		{
			System.out.println("\n\t\t\t\tCGPA \t    | 3.4 ");
		}
		else if(per>=70)
		{
			System.out.println("\n\t\t\t\tCGPA     \t| 3.0 ");
		}
		else if(per>=65)
		{
			System.out.println("\n\t\t\t\tCGPA \t    | 2.8 ");
		}
		else if(per>=60)
		{
			System.out.println("\n\t\t\t\tCGPA \t    | 2.5 ");
		}
		else if(per>50)
		{
			System.out.println("\n\t\t\t\tCGPA \t    | 2.0 ");
		}
		else
		{
			System.out.println("\n\t\t\t\tCGPA \t    | -- ");
		}
	}

}
