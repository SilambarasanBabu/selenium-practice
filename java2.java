package into;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class java2 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,22};
        for ( i=0;i<arr2.length;i++ )
{
	    if (arr2[i] %2 == 0)
	    	
	    {
	    	System.out.println(arr2[i]);
	    	break;
	    }
	    else
	    {
	    	System.out.println(arr2[i]+ "is not mul 2");
	    }
}
	ArrayList<String> a = new ArrayList<String>();
	a.add("silambu");
	a.add("gopi");
	a.add("kishor");
	a.add("loki");
	System.out.println(a.get(2));
	for(i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println("*****************");
	for(String value :a)
	{
		System.out.println(value);
	}
	System.out.println(a.contains("gopi"));
	
	String[] name = {"alp","bet","cat"};
	List<String> Name = Arrays.asList(name);
	System.out.println(Name.get(1));
	}

}
