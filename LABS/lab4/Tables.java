import java.util.Scanner;
class Tables{ 
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
System.out.print("Enter the table number: ");
int table = sc.nextInt();
System.out.print("upto:");
int upto = sc.nextInt();
for(int i=1;i<=upto;i++){
	System.out.println(table+"X"+i+"="+i*table);
}//end of for loop	
}
}
© 2019 GitHub, Inc.