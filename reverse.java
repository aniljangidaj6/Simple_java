class reverse
{
	public static void main(String[] args)
	{
		String name="Anil";
		String rev="";
		int lang=name.length();
		for(int i=lang-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.print(rev);
	}
}