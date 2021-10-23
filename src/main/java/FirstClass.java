
public class FirstClass extends FLIGHT {
	
	int asts;
	int fare;
	String source;

	public FirstClass()
	{
		super(0,0,null,null);
		asts=0;
		fare=0;
		source=null;
	}
	public FirstClass(int dte,int m,String pid, String dest,int seats,int fre, String src)
	{
		super(dte,m,pid,dest);
		asts=seats;
		fare=fre;
		source=src;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
