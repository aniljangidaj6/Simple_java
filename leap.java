import java.util.Scanner;
class leap
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("");
		int n=s.nextInt();
		if(n%4==0)
		{
			System.out.println("leap year");
		}else{
			System.out.println("not leap year");
		}
		
	}
}