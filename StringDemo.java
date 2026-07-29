public class StringDemo{
public static void main(String[] args){
String str="java programming";
System.out.println("original string:"+str);
System.out.println("length:"+str.length());
System.out.println("uppercase:"+str.toUpperCase());
System.out.println("lowercase:"+str.toLowerCase());
System.out.println("substring:"+str.substring(5,16));
System.out.println("contain 'java':"+str.contains("java"));
}
}