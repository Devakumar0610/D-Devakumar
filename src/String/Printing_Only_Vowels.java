package String;

public class Printing_Only_Vowels {

	public static void main(String[] args) 
	 {
	  String a ="Sivakesavan";
	  int count=0;
	  for(int i=0; i<a.length(); i++)
	  {
		char b = a.charAt(i);
		if(b =='a'||b=='e'||b=='i'||b=='o'||b=='u')
		{
			count++;
		}
	  }
	  System.out.println("The Numberof Vowels the sting" + count);

	}

}
