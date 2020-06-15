
public class ex33 {

	public static void main(String[] args) {
		
		System.out.println("main할수 호출 시작 !");
		
		int res = sum(1,2); 
		
		System.out.println("sum할수 실행 결과 : " + res);
				
				System.out.println("main할수 호출 끝!!");
	}
	public static int sum(int ii, int i2) {
		
		System.out.println("sum할수 호출 사적!!");
		
		int sum = 0;
		
		for (int i=1; i<=i2; i++)
			sum+=1;
		
		System.out.println("sum 호출 끝!!");
		
		return sum;
			
	}

}
                             