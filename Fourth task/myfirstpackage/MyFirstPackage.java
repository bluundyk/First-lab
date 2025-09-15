package myfirstpackage;

public class MyFirstPackage {
	private int first;
	private int second;
	public MyFirstPackage() {
		first = 0;
		second = 0;
	}
	public int GetFirst() {
		return first;
	}
	public int GetSecond() {
		return second;
	}
	public void SetFirst(int first) {
		this.first = first;
	}
	public void SetSecond(int second) {
		this.second = second;
	}
	public int operation() {
		return (first - second);
	}
}