import java.util.Scanner;

public class ex_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0;
		 int b=0;
		 Scanner scan = new Scanner(System.in);
		 
		 a= scan.nextInt();
		 b= scan.nextInt();
		 
		 if(a>b) {System.out.println(">");}
		 else if(a==b) {System.out.println("==");}
		 else {System.out.println("<");}
		 

	}

}
