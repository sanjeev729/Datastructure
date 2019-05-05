package string;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
	public static void main(String[] args) {
		String str = "ABDD";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permuteUtil(str);
	}

	/**
	 * permutation function
	 * 
	 * @param str
	 *            string to calculate permutation for
	 * @param l
	 *            starting index
	 * @param r
	 *            end index
	 */
	private void permute(String str, int l, int r, Set<String> unique) {
		if (l == r && !unique.contains(str)) {
			System.out.println(str);// extra n times for printing therefore
			unique.add(str);
		}                                                // O(N*N!)
		else {
			for (int i = l; i <= r; i++) // n times T(N)=n*(O(1)+T(N-1) +O(1))==
											// N*N-1*N-2*N-3......1 = N!
			{
				str = swap(str, l, i);
				permute(str, l + 1, r, unique);
				str = swap(str, l, i);
			}
		}
	}

	public Set permuteUtil(String str) {
		int len = str.length();
		Set<String> unique = new HashSet<>();
		permute(str, 0, len - 1, unique);
		return unique;

	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a
	 *            string value
	 * @param i
	 *            position 1
	 * @param j
	 *            position 2
	 * @return swapped string
	 */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}