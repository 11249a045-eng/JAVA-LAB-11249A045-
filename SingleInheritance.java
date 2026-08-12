class animal{
void eat(){
System.out.println("animal eats food");
}
}
class dog extends animal{
void bark(){
System.out.println("dog barks");
}
}
public class SingleInheritance{
public static void main(String[] args)
{
dog d=new dog();
d.eat();
d.bark();
}
}
