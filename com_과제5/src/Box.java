
public class Box {
	private int garo;
	private int sero;
	private int height;
	private int volume;

	public int getgaro() {
		return garo;
	}

	public void setgaro(int g) {
		garo = g;
	}

	public int getsero() {
		return sero;
	}

	public void setsero(int s) {
		sero = s;
	}

	public int getheight() {
		return height;
	}

	public void setheight(int h) {
		height = h;
	}

	public int getVolume() {
		volume = height * garo * sero;
		return volume;
	}
	public void print() {
		System.out.println("가로,세로,부피 : " +garo+","+sero+","+height);
	}

}
