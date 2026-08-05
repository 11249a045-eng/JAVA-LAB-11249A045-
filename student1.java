class student1{
String name;
static int count=0;
student1(String name){
this.name=name;
count++;
}
void display(){
System.out.println("student name:"+name);
}
public static void main(String[] args){
student1 s1=new student1("Shreyas");
student1 s2=new student1("Madhu");
student1 s3=new student1("Preethi");
s1.display();
s2.display();
s3.display();
System.out.println("total students:"+student1.count);
}
}