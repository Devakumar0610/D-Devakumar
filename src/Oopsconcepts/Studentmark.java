package Oopsconcepts;

public class Studentmark {
	
	int T;
	int E;
	int M;
	int S;
	int Ss;
	void cal ()
	{
		System.out.println(T+E+M+S+Ss);
		
	}

	public static void main(String[] args) 
	{
	 Studentmark s1 = new Studentmark();	
                 s1.T =99;
	             s1.E=81;
	             s1.M=89;
	             s1.S=90;
	             s1.Ss=100;
	             s1.cal();
	             Studentmark s2 = new Studentmark();	
                 s2.T =67;
	             s2.E=90;
	             s2.M=45;
	             s2.S=67;
	             s2.Ss=76;
	             s2.cal();
	}

}
