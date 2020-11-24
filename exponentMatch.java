import java.util.regex.*;

class exponentMatch{

public void patternMatched(String v){

Pattern p=Pattern.compile("^[(]{0,1}([0-9]+[.]{1}[0-9]+)");
//Pattern p2= Pattern.compile("^[\^]{1}[0-9]+[.]{1}[0-9]");

Matcher m= p.matcher(v);

if(m.matches()){
System.out.println(v+ "Matches! first");

System.out.println("The number without brackets is:"+m.group(1));
double g= Double.parseDouble(m.group(1));
System.out.println("Times two is:"+ g*2);

}

else{

System.out.println(v+" Does not match!");
}

}
public static void main(String[]args){

exponentMatch f= new exponentMatch();
	f.patternMatched("1.2");
	f.patternMatched("(1.2");
	f.patternMatched("(1223.4");

}
}