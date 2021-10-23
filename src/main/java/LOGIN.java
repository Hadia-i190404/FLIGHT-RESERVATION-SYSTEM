import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class LOGIN {

	private String username; 
	private String password;
	
	public LOGIN()
	{
		username=null;
		password=null;
	}
	public LOGIN(String name, String pass)
	{
		username=name;
		password=pass;
	}
	public void Filewrite() throws IOException
	{
		File info=new File("LOGINS.txt");
		FileWriter wfile=new FileWriter(info,true);
		wfile.write(username+","+password+",");
		wfile.close();
	}
	public void signup()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Username to Sign Up");
		username=s.next();
		System.out.println("Enter Password");
		password=s.next();
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
		File info=new File("LOGINS.txt");
		String [] word=null;
		FileReader fr=new FileReader(info);
		BufferedReader br = new BufferedReader(fr);
		String s; boolean chck=false; 
		String str=username;
		String str1=password;
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
			signup();
		}
		if (chck==true)
		{
			System.out.println("Login Successful");
		}
	}
	public void Login()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Username to Log In");
		username=sc.next();
		System.out.println("Enter Password");
		password=sc.next();
		try 
		{
			Fileread();
		}
		catch(IOException ioe)
		{
			
		}
		
	}
	public static void main(String[] args) 
	{
		
			
	}

}
