package decision_making;

public class EPmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int unit = 200;
    if(unit<=100 && unit>0)
    {
     
     System.out.println("0");
    }
    if(unit>100 && unit<=200)
    {
     double rem =(unit-100)* 1.5;
     double cost = rem + 100;
     System.out.println(cost);
    }
	}

}
