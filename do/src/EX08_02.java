import java.util.Scanner;

public class EX08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		int[] aa =new int[4];
		int hap = 0,i;
		
		for (i =0; i<=3; i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
			aa[i] = S.nextInt();
		}
		hap = aa [0] +aa[1] +aa[2] +aa[3];
		System.out.printf("합계==> %d\n",hap);
		}
		
}
		
		
		
		



