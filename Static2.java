

public class Static2 {
int m=30;
Static int n=20;
Static int add(int a, int b) {
	return a+b;
}
public static void main(String[] args) {
	int c = Static2.add(5, 4);
	System.out.println(c);
	Static2 refer=new Static2();
	System.out.println(refer,m);
	System.out.println(n);
	

}
}
