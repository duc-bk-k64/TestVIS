import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test1 {
	private int n;
	private ArrayList<Integer> array;

	@SuppressWarnings("resource")
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		this.n = scanner.nextInt();
		this.array = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			this.array.add(scanner.nextInt());
		}
	}

	public void sort() {
		Collections.sort(this.array, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int v1 = Integer.valueOf(o1);
				int v2 = Integer.valueOf(o2);
				if (v1 > v2)
					return 1;
				else if (v1 < v2)
					return -1;
				else
					return 0;
			}
		});
	}

	public void solve() {
		int result = -999; // a denote result
		int cost = 0;
		for (int i = 0; i < this.array.size() - 1; i++) {
			cost = this.array.get(i + 1) - this.array.get(i);
			if (cost >= 2) {
				result = this.array.get(i) + 1;
			}
		}
		if (result == -999) {
			result = this.array.get(this.array.size() - 1) + 1;
		}
		for (int i = 0; i < this.array.size(); i++) {
			System.out.print(this.array.get(i) + " ");
		}
		System.out.println();
		System.out.print(result);
	}

	public static void main(String args[]) {
		Test1 test1 = new Test1();
		test1.input();
		// test1.print();
		test1.sort();
		test1.solve();
		;
	}

}
