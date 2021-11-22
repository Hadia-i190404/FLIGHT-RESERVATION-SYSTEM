import java.util.Scanner;

public class Passenger {

	public String name;
	public int age;				
	public String gender;
	public String city;
	public int passno;
	public String pltyp;
	public String destination;
	
	public Passenger()
	{
		name=null;
		age=0;
		gender=null;
		city=null;
		passno=0;
		pltyp=null;
		destination=null;
	}
	public void pasdet() throws PIDError
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name(firstname only)");
		name=s.next();
		System.out.println("Enter your age");
		age=s.nextInt();
		System.out.println("Enter your Gender (F or M)");
		gender=s.next();
		System.out.println("Enter your city");
		city=s.next();
		System.out.println("Enter your passport no");
		passno=s.nextInt();
		String lngth=String.valueOf(passno);
		if (lngth.length()>4)
		{
			throw new PIDError("Invalid, 4 digit PIN");
		}
		if (lngth.length()<4)
		{
			throw new PIDError("Invalid, 4 digit PIN");
		}
		System.out.println("Enter the plane type you want");
		System.out.println("E for Economey, B for Business, F for First Class");
		pltyp=s.next();
		System.out.println("Enter destination");
		destination=s.next();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
