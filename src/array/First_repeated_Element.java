package array;

public class First_repeated_Element {

	public static void main(String[] args) {
		
char name[]= {'d','a','v','i','d'};
		
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
		 
		 if(count==2)
		 {
			 System.out.println("first-repeated char" +" = " + ch);
			 break;
		 }

	}

   }
}


	

