package arrays;

public class PositiveAtEvenNegativeAtOdd {
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void reorderArray(int[] arr) {
		int pos = 0;
		int neg = 1;
		while(true) {
			while(pos < arr.length && arr[pos] >= 0)
				pos += 2;
			while(neg < arr.length && arr[neg] < 0)
				neg += 2;
			if(pos < arr.length && neg < arr.length)
				this.swap(arr, pos, neg);
			else
				break;
		}
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		PositiveAtEvenNegativeAtOdd p = new PositiveAtEvenNegativeAtOdd();
		int[] arr = new int[] {1,-3,5,6,-3,6,7,-4,9,10};
		p.reorderArray(arr);
	}
	
}
