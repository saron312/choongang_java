package Bridge;

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int r, int x, int y) {
		System.out.println("���� ��: ������"+r+", �߽� ("+x+","+y+")");
	}

	@Override
	public void drawRect(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		
	}

}