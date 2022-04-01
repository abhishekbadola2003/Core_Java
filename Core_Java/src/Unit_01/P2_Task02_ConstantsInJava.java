public class P2_Task02_ConstantsInJava{

	public static final double Pi=3.14;

	public static void main(String[] args) 
	{
		System.out.println(Pi);
		main("gjhfgsdkhfgs");

		NewClass obj= new NewClass();
		obj.add(1,2);
		System.out.println(obj.Pi);


	}

	public static void main(String args)
	{
		System.out.println(Pi);

	}

	 void add(int a,int b)
	 {
		 System.out.println(a+b);
		 System.out.println(Pi);

	 }

}

class NewClass
{
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(P2_Task02_ConstantsInJava.Pi);	
	}
}