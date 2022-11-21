package string;

public class splitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String name1="siva kesavan maduri ";
//		
////		System.out.println(name1.substring(5));
////		System.out.println(name1.substring(5,12));
//		String[] name=name1.split(" ");
//		
//		for(String names:name)
//		{
//			System.out.println(names);
//		}
//	}
//
//}

//String date="21/11/2022";
//String[] name=date.split("/");
//
//for(String s:name)
//{
//	System.out.println(s);
//}
//}}
		
		
		String date="21/11/2022";
		  splitTheDate(date,'/');
		  }
		splitTheDate(String input,char sp)
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)!=sp)
			{
			System.out.println(input.charAt(i));
		}
		}}