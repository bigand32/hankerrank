import java.util.Arrays;

public class BeautifulQuadruples {
	public int solve(int one, int two, int three, int four) {
		int count = 0;
		int arr[] = { one, two, three, four };
		Arrays.sort(arr);
		one = arr[0];
		two = arr[1];
		three = arr[2];
		four = arr[3];
		for (int first = 1; first <= one; first++) {
			for (int second = first; second <= two; second++) {
				for (int third = second; third <= three; third++) {
					for (int fourth = third; fourth <= four; fourth++) {
						int n = first ^ second ^ third ^ fourth;
						if (n > 0) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}

}
