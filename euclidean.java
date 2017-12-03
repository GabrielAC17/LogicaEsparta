package model;

public class Solution3 {
	
	public Solution3() {
		super();
	}
	
	public int solution(int N, int M) {
		int[] choc = new int[N];
		for(int i = 0; i < choc.length; i++) {
			choc[i] = 1;
		}
		
		int selectedChocolate = 0;
		
		while (choc[selectedChocolate] == 1) {
			choc[selectedChocolate] = 0;
			selectedChocolate = (selectedChocolate + M) % N;
			
			if (selectedChocolate > N-1) {
				selectedChocolate -= N;
			}
		}
		
		int numberOfEaten = 0;
		for (int c : choc) {
			if (c == 0)
				numberOfEaten++;
		}
		
		return numberOfEaten;
	}
}
