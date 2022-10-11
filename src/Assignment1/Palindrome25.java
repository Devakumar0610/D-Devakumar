package Assignment1;

public class Palindrome25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=15437;
    int h=num;
    int reverse=0;
    while(num>0)
    {
        int reminder=num%10;
    	reverse=reverse*10+reminder;
    	num=num/10;
    }
    System.out.println(reverse);
    if(h==reverse)	
    {
    	System.out.println("Given number of Palindrom");
    }
    else
    {
    	System.out.println("Not a Palindrom");
    }
	}

}
