import java.util.Scanner;

public class ex007_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner S = new Scanner(System.in);
         int a,b,c,d;
         int hap;
         
         
         
         System.out.printf("1번째 숫자를 입력하세요. : ");
         a= S.nextInt();
         
         System.out.printf("2번째 숫자를 입력하세요. : ");
         b= S.nextInt();
         System.out.printf("3번째 숫자를 입력하세요. : ");
         c= S.nextInt();
         System.out.printf("4번째 숫자를 입력하세요. : ");
         d= S.nextInt();
	  hap = a+b+c+d;
	 System.out.printf("  합계==>%d \n",hap);
	}
}