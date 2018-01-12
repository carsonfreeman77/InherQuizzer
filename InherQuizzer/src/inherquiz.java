import java.util.Scanner;

public class inherquiz {
	
	public static void main(String[] args) {
		System.out.println("Hi and welcome to the quiz!");
		System.out.println();
		Scanner q = new Scanner(System.in);
		System.out.println("How many questions would you like? (max of 6)");
		int qNum = q.nextInt();
		int counter = 0;
		for(int i = 0; i < qNum; i++)
		{
			
				System.out.println("If the code runs:");
				System.out.println();
				randomMethod(qNum);
				randomRunner(qNum);
				Scanner a = new Scanner(System.in);
				System.out.println();
				System.out.println("What will the result be?");
				System.out.println("A) Vroom!!!!!");
				System.out.println("B) I have 4 wheels!");
				System.out.println("C) vrAAAm vrAAAm");
				System.out.println("D) I use handlebars!");
				System.out.println("E) Code will not execute");
				String ans = a.nextLine();
				if(ans.equals("A"))
				{
					counter++;
					System.out.println();
					System.out.println("Correct!");
				}
				
				else if(ans.equals("B"))
				{
					counter++;
					System.out.println();
					System.out.println("Correct!");
				}
				
				else if(ans.equals("C"))
				{
					counter++;
					System.out.println();
					System.out.println("Correct!");
				}
				
				else if(ans.equals("D"))
				{
					counter++;
					System.out.println();
					System.out.println("Correct!");
				}
				
				else if(ans.equals("E"))
				{
					counter++;
					System.out.println();
					System.out.println("Correct!");
				}
				else
				{
					System.out.println();
					System.out.println("Wrong!!!");
				}
				
		}
		
		System.out.println();
		System.out.println("You got " + counter + " out of " + qNum + " correct!!");

	}
	public static void randomMethod(int qNum)
	{
	 int random1 = (int)(Math.random() * qNum + 1);
	 switch(random1)
	 {
	 case 1:
		 System.out.println("Vehicle v = new Vehicle");
		 break;
	 case 2:
		 System.out.println("Vehicle v = new Motorcycle");
		 break;
	 case 3:
		 System.out.println("Motorcycle v = new Vehicle");
		 break;
	 case 4:
		 System.out.println("Motorcycle v = new Motorcycle");
		 break;
		
	 }
	}
	public static void randomRunner(int qNum) 
		{
		int random2 = (int)(Math.random() * qNum + 1);
		switch(random2)
		 {
		 case 1:
			 System.out.println("v.Sound()");
			 break;
		 case 2:
			 System.out.println("v.Wheels()");
			 break;
		 case 3:
			 System.out.println("v.Sound()");
			 break;
		 case 4:
			 System.out.println("v.Steering()");
			 break;
		}
	

}
}
