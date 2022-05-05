import java.util.ArrayList;

public class Test2 {
	private ArrayList<Character> character;
	private int[] count;

	public void solve(ArrayList<Character> m) {
		this.count = new int[this.character.size()];
		for (int i = 0; i < this.character.size(); i++) { //count occurrence of each element of character
			this.count[i]=0;
			for (int j = 0; j < m.size(); j++) {
				if(Character.compare(this.character.get(i),m.get(j))==0) {
					this.count[i]++;
				}

			}
		}
		int result=this.factorial(m.size());  //iterative permutation
		for(int i=0;i<this.character.size();i++) {
			result=result/this.factorial(this.count[i]);
		}
		System.out.println(result);

	}

	public void countCharacter(ArrayList<Character> m) { // get difference element in m
		this.character = new ArrayList<>();
		for (int i = 0; i < m.size(); i++) {
			if (this.character.size() == 0) {
				this.character.add(m.get(i));
				continue;
			}
			for (int j = 0; j < this.character.size(); j++) {
				if (Character.compare(m.get(i), this.character.get(j)) == 0) {
					break;
				}
				if (j == this.character.size() - 1)
					this.character.add(m.get(i));
			}

		}

	}
	public int factorial(int m) { //calculate fatorial
		if(m==1) return 1;
		return m*factorial(m-1);
	}

	public static void main(String args[]) {
		Test2 test2 = new Test2();
		ArrayList<Character> test = new ArrayList<>();
		test.add('a');
		test.add('b');
		test.add('c');
		test.add('b');
		test2.countCharacter(test);
		test2.solve(test);
	}

}
