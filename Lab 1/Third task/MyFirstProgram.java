class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass();
		System.out.println(o.operation());
		for (int i = 1; i <= 8; i++) {
 			for (int j = 1; j <= 8; j++) {
     				o.SetFirst(i);
     				o.SetSecond(j);
     				System.out.print(o.operation());
     				System.out.print(" ");
 			}
 		System.out.println();
		}
	}
}

class MySecondClass {
	private int first;
	private int second;
	MySecondClass() {
		first = 0;
		second = 0;
	}
	int GetFirst() {
		return first;
	}
	int GetSecond() {
		return second;
	}
	void SetFirst(int first) {
		this.first = first;
	}
	void SetSecond(int second) {
		this.second = second;
	}
	int operation() {
		return (first - second);
	}
}