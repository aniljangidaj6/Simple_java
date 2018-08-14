import java.util.Scanner;

class swap2
{
	public static void main(String args[])
	{	
		Scanner in=new Scanner(System.in);
		System.out.println("swapping x");
		int x=in.nextInt();
		System.out.println("swapping y");
		int y=in.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping"+x+""+y);
	}
}
