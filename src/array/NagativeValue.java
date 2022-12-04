package array;

public class NagativeValue {

	public static void main(String[] args) {
		NagativeValue s= new NagativeValue();
		     s.Negative_value_print();
	}

	private void Negative_value_print() {
	  int a[]= {1,2,-3,-4,5,6,-7,8};
	  int count =0;
	  for(int i=0; i<a.length; i++)
	  {
		  if(a[i]<0)
		  {
			  count++;
		  }  
	  }
	  int b[] = new int [count];
	  int j=0;
	  for(int i=0; i<a.length; i++)
	  {
		  if(a[i]<0)
		  {
			  b[j]=a[i];
			  j++;
		  }
	  }
	  for(int i=0; i<b.length; i++)
	  {
		  System.out.println(b[i]);
	  }
	}

}
