public class ElectronicShop {
	public int getMoneySpent(int[] keyboards, int[] drives, int b) {

		int max = -1;
		for (int idx1 = 0; idx1 < keyboards.length; idx1++) {
			for (int idx2 = 0; idx2 < drives.length; idx2++) {
				if (keyboards[idx1] + drives[idx2] <= b && max < keyboards[idx1] + drives[idx2])
					max = keyboards[idx1] + drives[idx2];
			}
		}
		return max;
	}
}
