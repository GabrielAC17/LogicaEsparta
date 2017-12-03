package model;

public class Solution {

	public Solution() {
		super();
		
	}
	
	public int solution(int[] a) throws Exception {
		if (a.length > 1000000 || a.length < 1) {
			throw new Exception("Invalid Array Length!");
		}
		if (a.length % 2 == 0) {
			throw new Exception("Array can't be a even size!");
		}
		
		int[] aCopy = a.clone();
		
		while (aCopy.length > 1) {
			int selected = aCopy[0];
			for (int i = 1; i < aCopy.length; i++) {
				if (aCopy[i] == selected) {
					System.arraycopy(aCopy, (i+1), aCopy, i, (aCopy.length - i - 1));
					System.arraycopy(aCopy, 1, aCopy, 0, aCopy.length-1);
					int[] tempArray = new int[aCopy.length-2];
					System.arraycopy(aCopy, 0, tempArray, 0, aCopy.length-2);
					aCopy = tempArray;
					break;
				}
			}
		}
		if (aCopy.length == 1)
			return aCopy[0];
		else
			return 0;
	}
}
