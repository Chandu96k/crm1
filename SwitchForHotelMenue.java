import java.util.Scanner;
class  SwitchForHotelMenue
{
	public static void main (String []args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("******MENU******");
		System.out.println("1.Veg   2.Non veg");
		System.out.println("Enter your option");
		int opt=sc.nextInt();

		switch (opt)
        {
			case 1:
				System.out.println("1.Mix Veg Thali");
			    System.out.println("2.kolhapuri special");
				System.out.println("3.Malvani Special");

			   System.out.println("select your option");
			   int ord = sc.nextInt();

			   switch(ord)
			{
				case 1:
				{
					System.out.println("You have to pay Rs.150");
					break;
				}
				case 2:
				{
					System.out.println("you have to pay Rs.220");
					break;
				}
				case 3:
				{
					System.out.println("You have to pay Rs.200");
					break;
				}
			}
			break;
			case 2 :
			{
				System.out.println("1.chikan kabbab");
			    System.out.println("2.chicken biryani");
				System.out.println("3.chokan chilli");

			   System.out.println("select your option");
			   int ord2 = sc.nextInt();
			   switch (ord2)
			   {
			   case 1:
				   {
					System.out.println("You have to pay Rs.300");
				   }
			   case 2:
				   {
					System.out.println("you have to pay Rs.500");

				   }
				   case 3:
				   {
					
				   }
			   
			   }
				
			}
        }
	
	}
}
