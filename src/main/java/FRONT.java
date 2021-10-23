import java.io.IOException;
import java.util.Scanner;

public class FRONT {
	
	public static void main(String[] args) {
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
				try
				{
					ad.addition();
				}
				catch( IOException ioe)
				{
					
				}
			}
		}
		LOGIN obj=new LOGIN();
		obj.Login();
		Passenger psngr=new Passenger();
		psngr.pasdet();
		
		String plt;
		System.out.println("Enter the type/class of Plane's schedule you want to see");
		System.out.println("E for Economey, B for Business, F fro FirstClass");
		System.out.println("Enter No if you don't want to see");
		plt=s.next();
		if(plt.equals("no")==false)
		{
			FlightCalander fc=new FlightCalander(plt);
			fc.Display(plt);
		}
		Search se=new Search();
		try {
		se.Find();
		}
		catch (IOException ioe)
		{
			
		} 
		Booking bk=new Booking();
		try
		{
			String str;
			bk.reserve();
			System.out.println("Enter no if you don't want to cancel the tickets");
			str=s.next();
			if(str.equals("no"))
			{
				bk.cancellation();
			}
		}
		catch(IOException ioe)
		{
			
		}
	}

}
