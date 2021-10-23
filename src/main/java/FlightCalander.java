import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FlightCalander {

	private String ptype;
	private String dte;
	private int pid;
	private String dest;
	private int avsts;
	private int fare;
	private String source;
	public FlightCalander()
	{
		ptype=null;
		dte=null;
		pid=0;
		dest=null;
		avsts=0;
		fare=0;
		source=null;
	}
	public FlightCalander(String plt)
	{
		ptype=plt;
		dte=null;
		pid=0;
		dest=null;
		avsts=0;
		fare=0;
		source=null;
	}
	public void FileReading()throws IOException
	{
		String str="B";
		String str1="E";
		String str2="F";
		if(ptype.equals(str)==true)
		{
			
			File info=new File("Business.txt");
			FileReader fr=new FileReader(info);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				StringTokenizer tok=new StringTokenizer(s,",");
				dte=tok.nextToken();
				pid=Integer.parseInt(tok.nextToken());
				dest=tok.nextToken();
				avsts=Integer.parseInt(tok.nextToken());
				fare=Integer.parseInt(tok.nextToken());
				source=tok.nextToken();
				System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
			}
		}
		if(ptype.equals(str1)==true)
		{
		//	System.out.println("CHECKING");
			File info=new File("Economey.txt");
			FileReader fr=new FileReader(info);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				StringTokenizer tok=new StringTokenizer(s,",");
				dte=tok.nextToken();
				pid=Integer.parseInt(tok.nextToken());
				dest=tok.nextToken();
				avsts=Integer.parseInt(tok.nextToken());
				fare=Integer.parseInt(tok.nextToken());
				source=tok.nextToken();
				System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
			}
		}
		if(ptype.equals(str2)==true)
		{
		//	System.out.println("CHECKING");
			File info=new File("FirstClass.txt");
			FileReader fr=new FileReader(info);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				StringTokenizer tok=new StringTokenizer(s,",");
				dte=tok.nextToken();
				pid=Integer.parseInt(tok.nextToken());
				dest=tok.nextToken();
				avsts=Integer.parseInt(tok.nextToken());
				fare=Integer.parseInt(tok.nextToken());
				source=tok.nextToken();
				System.out.println(dte+" "+pid+" "+dest+" "+avsts+" "+fare+" "+source);
			}
		}
	}
	public void Display (String plt)
	{
		ptype=plt;
		//System.out.println(ptype);
		String str="B";
		FlightCalander fc=new FlightCalander(plt);
		try {
		fc.FileReading();
		}
		catch (IOException ioe)
		{
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
