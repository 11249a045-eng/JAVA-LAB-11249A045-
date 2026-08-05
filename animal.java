class animal{
final void sound(){
System.out.println("animals make sound");
}
}
class dog extends animal{
void display(){
System.out.println("dog is domestic animal");
}
public static void main(String[] args)
{
dog d=new dog();
d.sound();
d.display();
}
}