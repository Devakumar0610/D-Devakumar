package array;

public class First_Non_repeated_character {
	

	public static void main(String[] args) {
		
		char name[]= {'v','e','e','r','a'};
		
		for(int i=0; i<name.length; i++)
		{
		 char ch=name[i];
		 
		 int count=0;
		 for(int j=0; j<name.length; j++)
		 {
		  if(name[j]==ch)
		  {
			  count++;
		  }
		 }
		 
		 if(count==1)
		 {
			 System.out.println("first Non-repeated char" +" = " + ch);
			 break;
		 }

	}

	}}
