package into;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methods d =new methods();
		String name = d.getData();
		System.out.println(name);
		methods2 d1 = new methods2();
		d1.getuserData();
		getData2();

	}
	
	public String getData()
	{
		System.out.println("hello world");
		return "vijay raj";
	}
	
	public static String getData2()
	{
		System.out.println("hello world");
		return "vijay raj";
	}

}
