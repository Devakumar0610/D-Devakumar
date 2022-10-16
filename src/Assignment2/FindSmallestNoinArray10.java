package Assignment2;

public class FindSmallestNoinArray10 {

	public static void main(String[] args) {
	int a[]= {5,2,-1,4,-2,-3,7,8};
    int mini=0;
    for(int i=0; i<a.length; i++)
    {
    if(mini>a[i])
    {
    mini=a[i];	
    }
    }
    System.out.println(mini);

	}

}
