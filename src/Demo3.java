import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		int[] seq = {1,7,7,8,3,6,7,2};
		int aa = test(seq);
		System.out.println(aa);
	}

	private static int test(int[] seq) {
		int[] arr =new int[seq.length];
		for (int i = 0; i < seq.length-1; i++) {
			int x = seq[i];
			int y = seq[i+1];
			int length = 2;
			if(x > y){
				
				for (int j = i+1; j < seq.length-1; j++) {
					if(seq[j] > seq[j+1]){
						length++;
					}else{
						break;
					}
				}
			}else if(x < y){
				
				for (int j = i+1; j < seq.length-1; j++) {
					if(seq[j] < seq[j+1]){
						length++;
					}else{
						break;
					}
				}
			}
			arr[i]=length;
		}
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
}
