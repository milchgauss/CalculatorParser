import java.util.regex.*;

import java.util.regex.*;
class ExponentMatchStrings{

public void patternMatched(String v){

// Attempted to make this into one expression as .{0,1}, but strings were invalidated when there were no decimals.
// Excluded this and made several patterns: Will fix this later!

Pattern p3=Pattern.compile("^[(]{0,1}([0-9]+.{0,1}[0-9]+)\\^{1}([0-9]+.{0,1}[0-9]+)\\){0,1}$");
Pattern p3a=Pattern.compile("^[(]{0,1}([0-9]+.{0,1}[0-9]+)\\^{1}([0-9]+)\\){0,1}$");
Pattern p3b=Pattern.compile("^[(]{0,1}([0-9]+)\\^{1}([0-9]+.{0,1}[0-9]+)\\){0,1}$");
Pattern p4=Pattern.compile("^[(]{0,1}([0-9]+)\\^{1}([0-9]+)\\){0,1}$");

Matcher m3= p3.matcher(v);
Matcher m3a= p3a.matcher(v);
Matcher m3b= p3b.matcher(v);
Matcher m4= p4.matcher(v);

if(m3.matches()){
System.out.println("\n"+"You have a valid expression! "+v);

double one=Double.parseDouble(m3.group(1));
double two=Double.parseDouble(m3.group(2));

System.out.println("Evaluation is: "+(Math.pow(one,two)));

}
else if(m3a.matches()){
System.out.println("\n"+"You have a valid expression! "+v);

double onec=Double.parseDouble(m3a.group(1));
double twod=Double.parseDouble(m3a.group(2));

System.out.println("Evaluation is: "+(Math.pow(onec,twod)));

}
else if(m3b.matches()){
System.out.println("\n"+"You have a valid expression! "+v);

double onee=Double.parseDouble(m3b.group(1));
double twof=Double.parseDouble(m3b.group(2));
System.out.println("Evaluation is: "+(Math.pow(onee,twof)));

}
 
else if(m4.matches()){
System.out.println("\n"+"You have a valid expression! "+v);
double oneb=Double.parseDouble(m4.group(1));
double twob=Double.parseDouble(m4.group(2));

System.out.println("Evaluation is: "+(Math.pow(oneb,twob)));
}

else{
System.out.println("Nothing matches! "+ v);
}

}

public static void main(String[]args){

ExponentMatchStrings f= new ExponentMatchStrings();
	

	f.patternMatched("(12.2^3)");
	f.patternMatched("12.2^3");
	f.patternMatched("(2.2^3)"); 
	f.patternMatched("2.2^3");

	f.patternMatched("12.2^3.2");
	f.patternMatched("(12.2^3.2)");
	f.patternMatched("2^3");
	f.patternMatched("(2^3)");
 
 

}
}