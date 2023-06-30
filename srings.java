package into;

public class srings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "silambarasan gopi kishor";
		//String[] stringarray=s.split(" ");
		//System.out.println(stringarray[0]);
		//System.out.println(stringarray[1]);
		//System.out.println(stringarray[2]);
		int i;
		String s = "silambarasan gopi kishor";
		String[] bro = s.split("gopi");
		System.out.println(bro[0]);
		System.out.println(bro[1].trim());
		//for (i=0;i<s.length();i++ )
		for (i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}
