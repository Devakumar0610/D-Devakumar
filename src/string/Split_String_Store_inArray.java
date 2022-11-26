package string;

public class Split_String_Store_inArray {

	public static void main(String[] args) {
		
		String a = "Arun Mani Siva John Deva";
		String key =" ";
		int count=1;
		for(int i=0; i<a.length(); i++)
		{
		 if(a.charAt(i)==key.charAt(0))
		 {
			 count++;
		 }
		}
		
		//System.out.println(count);
		String b[]=new String[count];
		
		String Temp= " ";
		int j=0;
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)==key.charAt(0))
			{
				b[j]=Temp;
				Temp=" ";
				j++;
				continue;
			}
				
		Temp = Temp +a.charAt(i);		
				
			}
			b[j]=Temp;
			
			for(String s:b) {
				System.out.println(s);
			}
		}
		}


