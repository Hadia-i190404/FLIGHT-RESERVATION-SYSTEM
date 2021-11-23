import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Admin {

	String username;
	String pass;
	String name;
	String CNIC;
	String phnno;
	public Admin()
	{
		username=null;
		pass=null;
		name=null;
		CNIC=null;
		phnno=null;
	}
	public Admin(String name, String pass,String nme, String CN, String phn)
	{
		username=name;
		pass=pass;
		name=nme;
		CNIC=CN;
		phnno=phn;
	}
	
	public void Filewrite() throws IOException
	{
		File info=new File("ADMIN.txt");
		FileWriter wfile=new FileWriter(info,true);
		wfile.write(username+","+pass+",");
		wfile.close();
	}
	public void signup() throws UsernameTest
	{
		List<String> user=Arrays.asList("/","-","_");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Username to Sign Up");
		username=s.next();
		if(username.contains((CharSequence) user))
		{
			throw new UsernameTest("Invalid Special characters");
		}
		System.out.println("Enter Password");
		pass=s.next();
		try
		{
			Filewrite();
		}
		catch (IOException ioe)
		{
			
		}
		System.out.println("Sign up Successful");
	}
	public void Fileread() throws IOException
	{
		File info=new File("ADMIN.txt");
		String [] word=null;
		FileReader fr=new FileReader(info);
		BufferedReader br = new BufferedReader(fr);
		String s; boolean chck=false; 
		String str=username;
		String str1=pass;
		while((s=br.readLine())!=null)
		{
			word=s.split(",");
			for(String wor : word)
			{
				if(wor.equals(str))
				{
					chck=true;
				}
			}
		}
		if (chck==false)
		{
			System.out.println("YOU NEED TO SIGN UP");
			try
			{
			signup();
			}
			catch(UsernameTest t)
			{
				
			}
		}
		if (chck==true)
		{
			System.out.println("Login Successful");
		}
	}
	public void Login() throws UsernameTest
	{
		Scanner sc= new Scanner(System.in);
			List<String> user=Arrays.asList("/","-","_");
		System.out.println("Enter Username to Log In");
		username=sc.next();
	/*	if(username.contains((CharSequence) user))
		{
			throw new UsernameTest("Invalid Special characters");
		}*/
		System.out.println("Enter Password");
		pass=sc.next();
		try 
		{
			Fileread();
		}
		catch(IOException ioe)
		{
			
		}
		
	}
	public void Info()
	{
		System.out.println("Enter your name");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter your CNIC");
		CNIC=sc.next();
		System.out.println("Enter your phone number");
		phnno=sc.next();
	}
	public void addition() throws IOException
	{
		Scanner sc= new Scanner(System.in);
		String s1,s2,s3,s4,s5,s6,s7;
		System.out.println("In which class do you wangt to add the flight details");
		s1=sc.next();
		System.out.println("Entert the date");
		s2=sc.next();
		System.out.println("Enter the plane id");
		s3=sc.next();
		if(s3==null)
		{
			throw new IllegalArgumentException("PlaneID can't be black");
		}
		else
		{
			if(s3.length()<4)
			{
				throw new IllegalArgumentException("PlaneID is too short");
			}
			else if(s3.length()>4)
			{
				throw new IllegalArgumentException("PlaneID too lengthy");
			}
		}
		System.out.println("Enter your destination");
		s4=sc.next();
		System.out.println("Enter number of seats");
		s5=sc.next();
		System.out.println("Enter the fare");
		s6=sc.next();
		System.out.println("Enter the source");
		s7=sc.next();
		if(s1.equals("B")==true)
		{
			File info=new File("Business.txt");
			FileWriter wfile=new FileWriter(info,true);
			wfile.write(s2+","+s3+","+s4+","+s5+","+s6+","+s7+"\n");
			wfile.close();
		}
		if(s1.equals("E")==true)
		{
			File info=new File("Economey.txt");
			FileWriter wfile=new FileWriter(info,true);
			wfile.write(s2+","+s3+","+s4+","+s5+","+s6+","+s7+"\n");
			wfile.close();
		}
		if(s1.equals("F")==true)
		{
			File info=new File("FirstClass.txt");
			FileWriter wfile=new FileWriter(info,true);
			wfile.write(s2+","+s3+","+s4+","+s5+","+s6+","+s7+"\n");
			wfile.close();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin ad=new Admin();
		try
		{
			ad.addition();
		}
		catch( IOException ioe)
		{
			
		}
	}

}
