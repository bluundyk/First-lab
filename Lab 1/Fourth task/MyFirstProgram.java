import myfirstpackage.*;

class MyFirstClass {
	public static void main(String[] s) {
		MyFirstPackage o = new MyFirstPackage();
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