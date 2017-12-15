
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox = new Box();
		mybox.setgaro(10);
		mybox.setsero(20);
		mybox.setheight(50);
		mybox.print();
		System.out.println("이 상자의 부피는" + mybox.getVolume()+"입니다.");
	}

}
