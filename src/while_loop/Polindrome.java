package while_loop;

public class Polindrome {
	public static void main(String[] arg) {
		int num=7654;           //757
        int h=num;
        int reverse=0;
        while (num>0)
        {
         int remainder= num%10;//7
         num=num/10;//75
         reverse= reverse*10+remainder;//7
        }
        System.out.println(reverse);
        if(h==reverse)
        {
         System.out.println("Given number is palindrome");
        }
        else
        {
         System.out.println("Not a palindrome number");


	}

}
}