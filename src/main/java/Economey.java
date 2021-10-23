
public class Economey extends FLIGHT{

	int avseats;
	int fare;
	String source;
	
	public Economey()
	{
		super(0,0,null,null);
		avseats=0;
		fare=0;
		source=null;
	}
	public Economey(int dte,int m,String pid, String dest,int seats,int fre, String src)
	{
		super(dte,m,pid,dest);
		avseats=seats;
		fare=fre;
		source=src;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
