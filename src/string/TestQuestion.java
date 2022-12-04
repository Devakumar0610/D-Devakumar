package string;



public class TestQuestion {

	public static void main(String[] args) {
		String s1="";
		String s="-    ------India----    --Country----    -";
		char [] cg = s.toCharArray();
	for(int i=0;i<cg.length;i++)
	{
		if(cg[i]!=45&&cg[i]!=32) {
			s1=s1+cg[i];
		}
	}
	System.out.println(s1);
	}

}
