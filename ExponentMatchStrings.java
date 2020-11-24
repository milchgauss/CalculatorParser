import java.util.regex.*;

import java.util.regex.*;
class ExponentMatchStrings{

public void patternMatched(String v){

//Pattern p=Pattern.compile("^[(]{0,1}([0-9]+[.]{0,1}[0-9]+)");
//Pattern p2= Pattern.compile("^\\^([0-9]+[.]{0,1}[0-9]+)\\){0,1}$");

//Putting the two patterns together
Pattern p3=Pattern.compile("^[(]{0,1}([0-9]+.{0,1}[0-9]+)\\^{1}([0-9]+.{0,1}[0-9]+)\\){0,1}$");
Pattern p4=Pattern.compile("^[(]{0,1}([0-9]+)\\^{1}([0-9]+)\\){0,1}$");

//Matcher m= p.matcher(v);
//Matcher m2=p2.matcher(v);
Matcher m3= p3.matcher(v);
Matcher m4= p4.matcher(v);

if(m3.matches()){
System.out.println("\n"+"You have a valid expression! "+v);

double one=Double.parseDouble(m3.group(1));
double two=Double.parseDouble(m3.group(2));

System.out.println("Your power is "+(Math.pow(one,two)));


}
else{
}

if(m4.matches()){
System.out.println("\n"+"You have a valid expression! "+v);
double oneb=Double.parseDouble(m4.group(1));
double twob=Double.parseDouble(m4.group(2));

System.out.println("Your power is "+(Math.pow(oneb,twob)));

}
else{
}

}

public static void main(String[]args){

ExponentMatchStrings f= new ExponentMatchStrings();
	
	f.patternMatched("2.3^3.2");
	f.patternMatched("2222.3^3.2");

	f.patternMatched("(12.3^3.2)");
	
	
	f.patternMatched("2^3");
	f.patternMatched("22^3");
	f.patternMatched("(2^3)");

 

}
}