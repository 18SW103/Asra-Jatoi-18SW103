import java.util.Scanner;
class Sum{ 
public static void main(String[]args){
	int x=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++){
		x+=i;
	}//end of for
System.out.println("sum of N integers is:"+x);
}
}