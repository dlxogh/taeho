
public class ex33 {

	public static void main(String[] args) {
		
		System.out.println("main�Ҽ� ȣ�� ���� !");
		
		int res = sum(1,2); 
		
		System.out.println("sum�Ҽ� ���� ��� : " + res);
				
				System.out.println("main�Ҽ� ȣ�� ��!!");
	}
	public static int sum(int ii, int i2) {
		
		System.out.println("sum�Ҽ� ȣ�� ����!!");
		
		int sum = 0;
		
		for (int i=1; i<=i2; i++)
			sum+=1;
		
		System.out.println("sum ȣ�� ��!!");
		
		return sum;
			
	}

}
                             