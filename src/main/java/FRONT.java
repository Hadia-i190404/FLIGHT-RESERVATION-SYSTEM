import java.io.IOException;
import java.util.Scanner;

public class FRONT {
	
	public static void main(String[] args) throws PIDError,IOException,UsernameTest,PTYPEException{
		// TODO Auto-generated method stub
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1 if you need to log in as Admin, Enter 2 if as user");
		n=s.nextInt();
		if(n==1)
		{
			Admin ad=new Admin();
			ad.Login();
			int n1;
			System.out.println("Enter 1 if you want to add flights");
			n1=s.nextInt();
			if(n1==1)
			{
				ad.Info();
				ad.addition();
			}
		}
		else if (n==2)
		{
			LOGIN obj=new LOGIN();
			obj.Login();
		
			int input;
		System.out.println("Enter 1 if you want to search specific Flight Details\nEnter 2 for adding your details as passenger\nEnter 3 for checking Flight Calender\nEnter 4 for flight reservation\nEnter 5 for ");
		input=s.nextInt();
		if(input==1)
		{
			Search se=new Search();
			
			se.Find();
			 
		}
		if(input==2)
		{
			Passenger psngr=new Passenger();
			psngr.pasdet();
		}
		if(input==3)
		{
			String plt;
			System.out.println("Enter the type/class of Plane's schedule you want to see");
			System.out.println("E for Economey, B for Business, F fro FirstClass");
			plt=s.next();
			FlightCalander fc=new FlightCalander(plt);
			fc.Display(plt);
		}
		if(input==4)
		{
			Booking bk=new Booking();	
				bk.reserve();
		}
		if(input==5)
		{
			Booking bk=new Booking();
				bk.cancellation();
			
		}
		
	}
	}
}
