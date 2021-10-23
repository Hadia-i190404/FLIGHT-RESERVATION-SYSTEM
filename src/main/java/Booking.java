import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Booking {

	int not;
	int seats=0;
	String date;
	String destination;
	String ptype;
	String source;
	public Booking()
	{
		not=0;
		seats=0;
		date=null;
		destination=null;
		ptype=null;
		source=null;
	}
	public Booking(int n)
	{
		not=n;
		seats=0;
		date=null;
		destination=null;
		ptype=null;
		source=null;
	}
	public void chngeseats(String old,String upd,String pt) throws IOException
	{
		String str="B";
		String str1="E";
		String str2="F";
		ptype=pt;
		
		if(ptype.equals(str)==true)
		{
				File filetobemodified=new File("Business.txt");
				String oldsets="";
				BufferedReader br=null;
				FileWriter fr=null;
			try
			{
				br = new BufferedReader(new FileReader(filetobemodified));
				String line=br.readLine();
				
				while(line!=null)
				{
					oldsets=oldsets+line+System.lineSeparator();
					line=br.readLine();
				}
				br.close();
				String newsets=oldsets.replaceAll(old, upd);
				
				fr=new FileWriter(filetobemodified);
				fr.write(newsets);
				fr.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not Found");
			}
		}
			
		if(ptype.equals(str1)==true)
		{
				File filetobemodified=new File("Economey.txt");
				String oldsets="";
				BufferedReader br=null;
				FileWriter fr=null;
			try
			{
				br = new BufferedReader(new FileReader(filetobemodified));
				String line=br.readLine();
					
					while(line!=null)
					{
						oldsets=oldsets+line+System.lineSeparator();
						line=br.readLine();
					}
					br.close();
					String newsets=oldsets.replaceAll(old, upd);
					
					fr=new FileWriter(filetobemodified);
					fr.write(newsets);
					fr.close();
				}
				catch(FileNotFoundException e)
				{
					System.out.println("File not Found");
				}
		}
		if(ptype.equals(str2)==true)
		{
				File filetobemodified=new File("FirstClass.txt");
				String oldsets="";
				BufferedReader br=null;
				FileWriter fr=null;
			try
			{
				br = new BufferedReader(new FileReader(filetobemodified));
				String line=br.readLine();
					
					while(line!=null)
					{
						oldsets=oldsets+line+System.lineSeparator();
						line=br.readLine();
					}
					br.close();
					String newsets=oldsets.replaceAll(old, upd);
					
					fr=new FileWriter(filetobemodified);
					fr.write(newsets);
					fr.close();
				}
				catch(FileNotFoundException e)
				{
					System.out.println("File not Found");
				}
		}
	
	}
	public void reserve() throws IOException
	{
		boolean flag=false;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date for the flight");
		date=sc.next();
		System.out.println("Enter the destination");
		destination=sc.next();
		System.out.println("Enter the plane type");
		ptype=sc.next();
		System.out.println("Enter the city you want to take flight from");
		source=sc.next();
		System.out.println("Enter the number of tickets");
		not=sc.nextInt();
		
		String str="B";
		String str1="E";
		String str2="F";
		if(ptype.equals(str)==true)
		{
			String s1,s2,s3,s4,s5,s6;
			File info=new File("Business.txt");
			FileReader fr=new FileReader(info);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				StringTokenizer tok=new StringTokenizer(s,",");
				s1=tok.nextToken();
				s2=tok.nextToken();
				s3=tok.nextToken();
				s4=tok.nextToken();
				s5=tok.nextToken();
				s6=tok.nextToken();
				if(s1.equals(date)==true && s3.equals(destination)==true && s6.equals(source)==true)
				{
					//System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
					seats=Integer.parseInt(s4);
					flag=true;
				}	//System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
			}
			if(flag==false)
			{
				System.out.println("No such Flight exists");
			}
			if(flag==true && seats<not)
			{
				System.out.println("Can't be reserved, No seats Available");
			}
			if(flag==true && seats>=not)
			{
				Integer i=seats;
				i=i+1;
				System.out.println("Concerned number of seats are available to be booked");
				Booking bk=new Booking();
				bk.chngeseats(String.valueOf(seats),String.valueOf(i),ptype);
				System.out.println("Your Seats are Booked Successfully");
			}
				
		}
		if(ptype.equals(str1)==true)
		{
		//	System.out.println("CHECKING");
			File info=new File("Economey.txt");
			FileReader fr=new FileReader(info);
			BufferedReader br = new BufferedReader(fr);
			String s;
			String s1,s2,s3,s4,s5,s6;
			while((s=br.readLine())!=null)
			{
				StringTokenizer tok=new StringTokenizer(s,",");
				s1=tok.nextToken();
				s2=tok.nextToken();
				s3=tok.nextToken();
				s4=tok.nextToken();
				s5=tok.nextToken();
				s6=tok.nextToken();
			//	System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
				if(s1.equals(date)==true && s3.equals(destination)==true && s6.equals(source)==true)
				{
					//System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
					seats=Integer.parseInt(s4);
					flag=true;
				}	//System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
			}
			if(flag==false)
			{
				System.out.println("No such Flight exists");
			}
			if(flag==true && seats<not)
			{
				System.out.println("Can't be reserved, No seats Available");
			}
			if(flag==true && seats>=not)
			{
				Integer i=seats;
				i=i+1;
				System.out.println("Concerned number of seats are available to be booked");
				Booking bk=new Booking();
				bk.chngeseats(String.valueOf(seats),String.valueOf(i),ptype);
				System.out.println("Your Seats are Booked Successfully");
			}
			
		}
		if(ptype.equals(str2)==true)
		{
		//	System.out.println("CHECKING");
			File info=new File("FirstClass.txt");
			FileReader fr=new FileReader(info);
			BufferedReader br = new BufferedReader(fr);
			String s;
			String s1,s2,s3,s4,s5,s6;
			while((s=br.readLine())!=null)
			{
				StringTokenizer tok=new StringTokenizer(s,",");
				s1=tok.nextToken();
				s2=tok.nextToken();
				s3=tok.nextToken();
				s4=tok.nextToken();
				s5=tok.nextToken();
				s6=tok.nextToken();
				//System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
				if(s1.equals(date)==true && s3.equals(destination)==true && s6.equals(source)==true)
				{
					//System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
					seats=Integer.parseInt(s4);
					flag=true;
				}	//System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
			}
			if(flag==false)
			{
				System.out.println("No such Flight exists");
			}
			if(flag==true && seats<not)
			{
				System.out.println("Can't be reserved, No seats Available");
			}
			if(flag==true && seats>=not)
			{
				Integer i=seats;
				i=i+1;
				System.out.println("Concerned number of seats are available to be booked");
				Booking bk=new Booking();
				bk.chngeseats(String.valueOf(seats),String.valueOf(i),ptype);
				System.out.println("Your Seats are Booked Successfully");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Booking bk=new Booking();
		try
		{
			bk.reserve();
		}
		catch(IOException ioe)
		{
			
		}
	}

}
