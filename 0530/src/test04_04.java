
public class test04_04 {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����.");
		}
	}
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left > (Integer.MAX_VALUE - right)) {
				System.out.println("1");
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}else { //right<=0�� ���
			if(left<(Integer.MIN_VALUE - right)) {
				System.out.println("2");
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}
}