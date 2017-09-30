
public class Demo2 {
	public static void main(String[] args) {
		int a = test1(1,2,3,7,5);
		System.out.println(a);
	}

	private static int test1(int a, int b, int c, int d, int e) {
		for (int i = 1; ; i++) {
			int a1 = i % a;
			int b1 = i % b;
			int c1 = i % c;
			int d1 = i % d;
			int e1 = i % e;
			if(a1 == 0 && b1 == 0 && c1 == 0){
				return i;
			}
			if(a1 == 0 && b1 == 0 && d1 == 0){
				return i;
			}
			if(a1 == 0 && b1 == 0 && e1 == 0){
				return i;
			}
			if(a1 == 0 && c1 == 0 && d1 == 0){
				return i;
			}
			if(a1 == 0 && c1 == 0 && e1 == 0){
				return i;
			}
			if(a1 == 0 && d1 == 0 && e1 == 0){
				return i;
			}
			if(b1 == 0 && c1 == 0 && d1 == 0){
				return i;
			}
			if(b1 == 0 && c1 == 0 && e1 == 0){
				return i;
			}
			if(b1 == 0 && d1 == 0 && e1 == 0){
				return i;
			}
			if(a1 == 0 && b1 == 0 && d1 == 0){
				return i;
			}
			
		}
	}
}
