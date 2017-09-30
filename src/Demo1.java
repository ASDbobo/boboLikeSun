
public class Demo1 {
	public static void main(String[] args) {
		int dd = test1(5);
		System.out.println(dd);
	}

	private static int test1(int rSquare) {
		if(rSquare >= 1 && rSquare <= 2000000000){
			int sum = 0;
			for (int i = -rSquare; i <= rSquare; i++) {
				for (int j = -rSquare; j <= rSquare; j++) {
					int length = i * i+j * j;
					if(length == rSquare){
						sum++;
					}
				}
			}
			return sum;
		}else{
			return 0;
		}
	}
}
