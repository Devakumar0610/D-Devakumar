package Statics;

public class State {
String name;
static String country;


	public static void main(String[] args) {
	country="india";
	State tn=new State();
	tn.name="Tamilnadu";
	State kr=new State();
	kr.name="kerala";
	System.out.println(country);
	System.out.println(tn.name);
	System.out.println(kr.name);
	}

}
