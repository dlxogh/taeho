import java.util.Scanner;

public class ex007_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner S = new Scanner(System.in);
         int a,b,c,d;
         int hap;
         
         
         
         System.out.printf("1��° ���ڸ� �Է��ϼ���. : ");
         a= S.nextInt();
         
         System.out.printf("2��° ���ڸ� �Է��ϼ���. : ");
         b= S.nextInt();
         System.out.printf("3��° ���ڸ� �Է��ϼ���. : ");
         c= S.nextInt();
         System.out.printf("4��° ���ڸ� �Է��ϼ���. : ");
         d= S.nextInt();
	  hap = a+b+c+d;
	 System.out.printf("  �հ�==>%d \n",hap);
	}
}