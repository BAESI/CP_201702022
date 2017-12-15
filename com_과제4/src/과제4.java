import java.util.Random;

public class 과제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(System.currentTimeMillis());
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				num1 = rand.nextInt(45) + 1;
				break;
			case 1:
				while (true) {
					num2 = rand.nextInt(45) + 1;
					if (num1 != num2)
						break;
				}
				break;
			case 2:
				while (true) {
					num3 = rand.nextInt(45) + 1;
					if (num1 != num3)
						if (num2 != num3)
							break;
				}
				break;
			case 3:
				while (true) {
					num4 = rand.nextInt(45) + 1;
					if (num1 != num4)
						if (num2 != num4)
							if (num3 != num4)
								break;
				}
				break;
			case 4:
				while (true) {
					num5 = rand.nextInt(45) + 1;
					if (num1 != num5)
						if (num2 != num5)
							if (num3 != num5)
								if (num4 != num5)
									break;
				}
				break;
			case 5:
				while (true) {
					num6 = rand.nextInt(45) + 1;
					if (num1 != num6)
						if (num2 != num6)
							if (num3 != num6)
								if (num4 != num6)
									if (num5 != num6)
										break;
				}
				break;
			}
		}

		System.out.println("<로또 생성 프로그램>");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);

	}
}
