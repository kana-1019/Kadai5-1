import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));

	}
	static String translateEng(int n) {
		String[] a = unit();
		String[] b = tens();
		if(n == 1) return a[1];
		if(n == 2) return a[2];
		if(n == 3) return a[3];
		if(n == 4) return a[4];
		if(n == 5) return a[5];
		if(n == 6) return a[6];
		if(n == 7) return a[7];
		if(n == 8) return a[8];
		if(n == 9) return a[9];
		if(n == 10) return "ten";
        return "";
    }
	
	static String[] unit() { //1の位
		String[] a = new String[10];
		a[0] = "zero"; //わかりやすくするため
        a[1] = "one";
        a[2] = "two";
        a[3] = "three";
        a[4] = "four";
        a[5] = "five";
        a[6] = "six";
        a[7] = "seven";
        a[8] = "eight";
        a[9] = "nine";
        return a;
	}
	
	static String[] tens() { //10の位
		String[] a = new String[10];
		a[0] = "zero"; //わかりやすくするため
        a[1] = "ten"; //わかりやすくするため
        a[2] = "twenty";
        a[3] = "thirty";
        a[4] = "fourty";
        a[5] = "fifty";
        a[6] = "sixty";
        a[7] = "seventy";
        a[8] = "eighty";
        a[9] = "ninety";
        return a;
	}


}
