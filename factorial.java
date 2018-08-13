import java.util.Scanner;
class factorial
{
	public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			int i,fact=1;  
			int num=in.nextInt();
		  for(i=1;i<=num;i++){    
			  fact=fact*i;
					}System.out.println(""+num+""+fact);
		}
}