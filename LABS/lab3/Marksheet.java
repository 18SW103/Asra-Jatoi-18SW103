import java.util.Scanner;
class Marksheet{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Marks obtained in C++:");
int s1=sc.nextInt();
System.out.print("Enter the Marks obtained in Data Structures:");
int s2=sc.nextInt();
System.out.print("Enter the Marks obtained in Operating Systems:");
int s3=sc.nextInt();

int total;
float percentage;
total=s1+s2+s3;
percentage=total/3;

System.out.print("Total="+total);
System.out.print("Percentage"+percentage);

if(percentage>90)
{
System.out.print("Grade:A");
}
if(percentage<90 || percentage>80)
{
System.out.print("Grade:B");
}
if(percentage<80 || percentage>70)
{
System.out.print("Grade:C");
}
if(percentage<70 || percentage>60)
{
System.out.print("Grade:D");
}
if(percentage<60)
{
System.out.print("Grade:Fail");
}
}
}