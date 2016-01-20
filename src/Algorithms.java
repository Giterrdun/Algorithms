
public class Algorithms {

	public static void main(String[] args) {
		int[] cards = { 2, 12, 9, 10, 12, 4, 6 };
		System.out.println(max(cards));
		System.out.println(sort(cards));
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int x : a) {
			if (x > max) {
				max = x;
			}
		}

		return max;

	}
	
	public static int sort(int[] a) {
		
		for (int i=0; i<a.length; i++) {
		int minIndex = i;
		for(int j=i+1; j<a.length; j++) {
			if(a[j] < a[minIndex]){
			mindIndex = j;	
			}
			}
		int temp = a[i];
		a[i] = a[minIndex];
		a[minIndex] = temp;
	}
	}
	
	
 
}
