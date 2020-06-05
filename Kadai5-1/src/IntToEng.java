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
		String[] c = ten();
		String d = "hundred"; 
		if(n == 1) return a[1];
		if(n == 2) return a[2];
		if(n == 3) return a[3];
		if(n == 4) return a[4];
		if(n == 5) return a[5];
		if(n == 6) return a[6];
		if(n == 7) return a[7];
		if(n == 8) return a[8];
		if(n == 9) return a[9];
		if(n == 10) return b[1];
		if(n == 11) return c[1];
		if(n == 12) return c[2];
		if(n == 13) return c[3];
		if(n == 14) return c[4];
		if(n == 15) return c[5];
		if(n == 16) return c[6];
		if(n == 17) return c[7];
		if(n == 18) return c[8];
		if(n == 19) return c[9];
		if(n == 20) return b[2];
		if(n == 21) return b[2]+" "+a[1];
		if(n == 22) return b[2]+" "+a[2];
		if(n == 23) return b[2]+" "+a[3];
		if(n == 24) return b[2]+" "+a[4];
		if(n == 25) return b[2]+" "+a[5];
		if(n == 26) return b[2]+" "+a[6];
		if(n == 27) return b[2]+" "+a[7];
		if(n == 28) return b[2]+" "+a[8];
		if(n == 29) return b[2]+" "+a[9];
		if(n == 30) return b[3];
		if(n == 31) return b[3]+" "+a[1];
		if(n == 32) return b[3]+" "+a[2];
		if(n == 33) return b[3]+" "+a[3];
		if(n == 34) return b[3]+" "+a[4];
		if(n == 35) return b[3]+" "+a[5];
		if(n == 36) return b[3]+" "+a[6];
		if(n == 37) return b[3]+" "+a[7];
		if(n == 38) return b[3]+" "+a[8];
		if(n == 39) return b[3]+" "+a[9];
		if(n == 40) return b[4];
		if(n == 41) return b[4]+" "+a[1];
		if(n == 42) return b[4]+" "+a[2];
		if(n == 43) return b[4]+" "+a[3];
		if(n == 44) return b[4]+" "+a[4];
		if(n == 45) return b[4]+" "+a[5];
		if(n == 46) return b[4]+" "+a[6];
		if(n == 47) return b[4]+" "+a[7];
		if(n == 48) return b[4]+" "+a[8];
		if(n == 49) return b[4]+" "+a[9];
		if(n == 50) return b[5];
		if(n == 51) return b[5]+" "+a[1];
		if(n == 52) return b[5]+" "+a[2];
		if(n == 53) return b[5]+" "+a[3];
		if(n == 54) return b[5]+" "+a[4];
		if(n == 55) return b[5]+" "+a[5];
		if(n == 56) return b[5]+" "+a[6];
		if(n == 57) return b[5]+" "+a[7];
		if(n == 58) return b[5]+" "+a[8];
		if(n == 59) return b[5]+" "+a[9];
		if(n == 60) return b[6];
		if(n == 61) return b[6]+" "+a[1];
		if(n == 62) return b[6]+" "+a[2];
		if(n == 63) return b[6]+" "+a[3];
		if(n == 64) return b[6]+" "+a[4];
		if(n == 65) return b[6]+" "+a[5];
		if(n == 66) return b[6]+" "+a[6];
		if(n == 67) return b[6]+" "+a[7];
		if(n == 68) return b[6]+" "+a[8];
		if(n == 69) return b[6]+" "+a[9];
		if(n == 70) return b[7];
		if(n == 71) return b[7]+" "+a[1];
		if(n == 72) return b[7]+" "+a[2];
		if(n == 73) return b[7]+" "+a[3];
		if(n == 74) return b[7]+" "+a[4];
		if(n == 75) return b[7]+" "+a[5];
		if(n == 76) return b[7]+" "+a[6];
		if(n == 77) return b[7]+" "+a[7];
		if(n == 78) return b[7]+" "+a[8];
		if(n == 79) return b[7]+" "+a[9];
		if(n == 80) return b[8];
		if(n == 81) return b[8]+" "+a[1];
		if(n == 82) return b[8]+" "+a[2];
		if(n == 83) return b[8]+" "+a[3];
		if(n == 84) return b[8]+" "+a[4];
		if(n == 85) return b[8]+" "+a[5];
		if(n == 86) return b[8]+" "+a[6];
		if(n == 87) return b[8]+" "+a[7];
		if(n == 88) return b[8]+" "+a[8];
		if(n == 89) return b[8]+" "+a[9];
		if(n == 90) return b[9];
		if(n == 91) return b[9]+" "+a[1];
		if(n == 92) return b[9]+" "+a[2];
		if(n == 93) return b[9]+" "+a[3];
		if(n == 94) return b[9]+" "+a[4];
		if(n == 95) return b[9]+" "+a[5];
		if(n == 96) return b[9]+" "+a[6];
		if(n == 97) return b[9]+" "+a[7];
		if(n == 98) return b[9]+" "+a[8];
		if(n == 99) return b[9]+" "+a[9];
		if(n == 100) return d;
		if(n == 101) return d+" "+a[1];
		if(n == 102) return d+" "+a[2];
		if(n == 103) return d+" "+a[3];
		if(n == 104) return d+" "+a[4];
		if(n == 105) return d+" "+a[5];
		if(n == 106) return d+" "+a[6];
		if(n == 107) return d+" "+a[7];
		if(n == 108) return d+" "+a[8];
		if(n == 109) return d+" "+a[9];
		if(n == 110) return d + b[1];
		if(n == 111) return d+" "+c[1];
		if(n == 112) return d+" "+c[2];
		if(n == 113) return d+" "+c[3];
		if(n == 114) return d+" "+c[4];
		if(n == 115) return d+" "+c[5];
		if(n == 116) return d+" "+c[6];
		if(n == 117) return d+" "+c[7];
		if(n == 118) return d+" "+c[8];
		if(n == 119) return d+" "+c[9];
		if(n == 120) return d + b[2];
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
        a[1] = "ten"; 
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
	
	static String[] ten() { //10のやつ
		String[] a = new String[10];
		a[0] = "zero"; //わかりやすくするため
        a[1] = "eleven"; 
        a[2] = "twelve";
        a[3] = "thirteen";
        a[4] = "fourteen";
        a[5] = "fifteen";
        a[6] = "sixteen";
        a[7] = "seventeen";
        a[8] = "eighteen";
        a[9] = "nineteen";
        return a;
	}

}
