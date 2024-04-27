package baithi;

public class Bai1 {

	public static long F(int n) {

		if (n <= 2)

			return 1;
		else {
			return F(n - 2) + F(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-gennerated method stub

		int n = 8;
		Long F = F(n);
		System.out.println(F);
	}

}
