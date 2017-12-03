package model;

public class Solution2 {
	
	public Solution2() {
		super();
	}
	
	public int solution(int[] a) throws Exception {
		for(int test:a) {
			if (test < -1000000 || test > 1000000) {
				throw new Exception("Invalid array values!");
			}
		}
		if (a.length > 100000) {
			throw new Exception("Exceeded Length!");
		}
		
		int[] aCopy = a.clone();
		int y = 0;
		
		while ((y+1) <= aCopy.length) {
			int selected = aCopy[y];
			for (int i = 1; i < aCopy.length; i++) {
				if (aCopy[i] == selected) {
					System.arraycopy(aCopy, (i+1), aCopy, i, (aCopy.length - i - 1));
					int[] tempArray = new int[aCopy.length-1];
					System.arraycopy(aCopy, 0, tempArray, 0, aCopy.length-1);
					aCopy = tempArray;
					break;
				}
			}
			y++;
		}
		
		return aCopy.length;
	}
}
