class employee{
final int id;
String name;
employee (int id,String name)
{
this.id=id;
this.name=name;
}
void display(){
System.out.println("employee id:"+id);
System.out.println("employee name:"+name);
}
public static void main(String[] args){
employee e1=new employee(101,"kavya");
e1.display();
}
}