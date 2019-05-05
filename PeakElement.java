package arrays;

public class PeakElement {

	public PeakElement() {

	}

	public int getPeakElement(int array[]) {
		int start = 0, end = array.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if ((mid == 0 || array[mid - 1] <= array[mid])
					&& (mid == array.length - 1 || array[mid] >= array[mid + 1])) {
				return array[mid];
			} else if (mid > 0 && array[mid - 1] > array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return 0;

	}

	public static void main(String[] args) {
		int a[] = { 5, 6, 3, 4, 4, 4 };
		PeakElement pe = new PeakElement();
		System.out.println(pe.getPeakElement(a));

	}

}
