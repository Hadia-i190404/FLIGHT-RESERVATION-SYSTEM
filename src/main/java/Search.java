import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Search {

	String date;
	String destination;
	String ptype;
	String source;
	public Search()
	{
		date=null;
		destination=null;
		ptype=null;
		source=null;
	}
	public Search(String dte, String dest, String type, String srce)
	{
		date=dte;
		destination=dest;
		ptype=type;
		source=srce;
	}
	public void Find() throws IOException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date for the flight");
		date=sc.next();
		System.out.println("Enter the destination");
		destination=sc.next();
		System.out.println("Enter the plane type");
		ptype=sc.next();
		System.out.println("Enter the city you want to take flight from");
		source=sc.next();
		
		
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
				if(s1.equals(date)==true && s3.equals(destination) && s6.equals(source))
				{
					System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
				}
				
				//System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
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
				if(s1.equals(date)==true && s3.equals(destination) && s6.equals(source))
				{
					System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
				}
				
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
				if(s1.equals(date)==true && s3.equals(destination) && s6.equals(source))
				{
					System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
				}
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Search se=new Search();
			try {
			se.Find();
			}
			catch (IOException ioe)
			{
				
			}
	}

}
