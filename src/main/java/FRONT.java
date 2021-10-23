import java.io.IOException;
import java.util.Scanner;

public class FRONT {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LOGIN obj=new LOGIN();
		obj.Login();
		Passenger psngr=new Passenger();
		psngr.pasdet();
		Scanner s= new Scanner(System.in);
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
	}

}
