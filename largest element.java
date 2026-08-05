import java.util.scanner;
class largest element{
public static void main(String[] args){
scanner sc=new scanner(System.in);
System.out.println("enter number of elements:");
int n=sc.nextint();
int []arr=new int[n];
System.out.println("enter number of elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextint();
}
int largest=arr[0];
for (int i=1;i<n;i++){
if(arr[i]>largest)
largest=arr[i];
}
System.out.println("largest element=" +largest);
}
}