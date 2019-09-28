class Pyramids3{ 
public static void main(String[]args){
	int x=1;
for(int i=1;i<=5;i++){
for(int z=5;z>i;z--){
System.out.print(" ");
}//end of z
for(int j=1;j<=x;j++){
System.out.print("*");
}//end of j
System.out.println();
x+=2;
}//end if i
}
}