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
		if(n == 100) return a[1]+d;
		if(n == 101) return a[1]+d+" "+a[1];
		if(n == 102) return a[1]+d+" "+a[2];
		if(n == 103) return a[1]+d+" "+a[3];
		if(n == 104) return a[1]+d+" "+a[4];
		if(n == 105) return a[1]+d+" "+a[5];
		if(n == 106) return a[1]+d+" "+a[6];
		if(n == 107) return a[1]+d+" "+a[7];
		if(n == 108) return a[1]+d+" "+a[8];
		if(n == 109) return a[1]+d+" "+a[9];
		if(n == 110) return a[1]+d + b[1];
		if(n == 111) return a[1]+d+" "+c[1];
		if(n == 112) return a[1]+d+" "+c[2];
		if(n == 113) return a[1]+d+" "+c[3];
		if(n == 114) return a[1]+d+" "+c[4];
		if(n == 115) return a[1]+d+" "+c[5];
		if(n == 116) return a[1]+d+" "+c[6];
		if(n == 117) return a[1]+d+" "+c[7];
		if(n == 118) return a[1]+d+" "+c[8];
		if(n == 119) return a[1]+d+" "+c[9];
		if(n == 120) return a[1]+d + b[2];
		if(n == 121) return a[1]+d+" "+b[2]+" "+a[1];
		if(n == 122) return a[1]+d+" "+b[2]+" "+a[2];
		if(n == 123) return a[1]+d+" "+b[2]+" "+a[3];
		if(n == 124) return a[1]+d+" "+b[2]+" "+a[4];
		if(n == 125) return a[1]+d+" "+b[2]+" "+a[5];
		if(n == 126) return a[1]+d+" "+b[2]+" "+a[6];
		if(n == 127) return a[1]+d+" "+b[2]+" "+a[7];
		if(n == 128) return a[1]+d+" "+b[2]+" "+a[8];
		if(n == 129) return a[1]+d+" "+b[2]+" "+a[9];
		if(n == 130) return a[1]+d + b[3];
		if(n == 131) return a[1]+d+" "+b[3]+" "+a[1];
		if(n == 132) return a[1]+d+" "+b[3]+" "+a[2];
		if(n == 133) return a[1]+d+" "+b[3]+" "+a[3];
		if(n == 134) return a[1]+d+" "+b[3]+" "+a[4];
		if(n == 135) return a[1]+d+" "+b[3]+" "+a[5];
		if(n == 136) return a[1]+d+" "+b[3]+" "+a[6];
		if(n == 137) return a[1]+d+" "+b[3]+" "+a[7];
		if(n == 138) return a[1]+d+" "+b[3]+" "+a[8];
		if(n == 139) return a[1]+d+" "+b[3]+" "+a[9];
		if(n == 140) return a[1]+d + b[4];
		if(n == 141) return a[1]+d+" "+b[4]+" "+a[1];
		if(n == 142) return a[1]+d+" "+b[4]+" "+a[2];
		if(n == 143) return a[1]+d+" "+b[4]+" "+a[3];
		if(n == 144) return a[1]+d+" "+b[4]+" "+a[4];
		if(n == 145) return a[1]+d+" "+b[4]+" "+a[5];
		if(n == 146) return a[1]+d+" "+b[4]+" "+a[6];
		if(n == 147) return a[1]+d+" "+b[4]+" "+a[7];
		if(n == 148) return a[1]+d+" "+b[4]+" "+a[8];
		if(n == 149) return a[1]+d+" "+b[4]+" "+a[9];
		if(n == 150) return a[1]+d + b[5];
		if(n == 151) return a[1]+d+" "+b[5]+" "+a[1];
		if(n == 152) return a[1]+d+" "+b[5]+" "+a[2];
		if(n == 153) return a[1]+d+" "+b[5]+" "+a[3];
		if(n == 154) return a[1]+d+" "+b[5]+" "+a[4];
		if(n == 155) return a[1]+d+" "+b[5]+" "+a[5];
		if(n == 156) return a[1]+d+" "+b[5]+" "+a[6];
		if(n == 157) return a[1]+d+" "+b[5]+" "+a[7];
		if(n == 158) return a[1]+d+" "+b[5]+" "+a[8];
		if(n == 159) return a[1]+d+" "+b[5]+" "+a[9];
		if(n == 160) return a[1]+d + b[6];
		if(n == 161) return a[1]+d+" "+b[6]+" "+a[1];
		if(n == 162) return a[1]+d+" "+b[6]+" "+a[2];
		if(n == 163) return a[1]+d+" "+b[6]+" "+a[3];
		if(n == 164) return a[1]+d+" "+b[6]+" "+a[4];
		if(n == 165) return a[1]+d+" "+b[6]+" "+a[5];
		if(n == 166) return a[1]+d+" "+b[6]+" "+a[6];
		if(n == 167) return a[1]+d+" "+b[6]+" "+a[7];
		if(n == 168) return a[1]+d+" "+b[6]+" "+a[8];
		if(n == 169) return a[1]+d+" "+b[6]+" "+a[9];
		if(n == 170) return a[1]+d + b[7];
		if(n == 171) return a[1]+d+" "+b[7]+" "+a[1];
		if(n == 172) return a[1]+d+" "+b[7]+" "+a[2];
		if(n == 173) return a[1]+d+" "+b[7]+" "+a[3];
		if(n == 174) return a[1]+d+" "+b[7]+" "+a[4];
		if(n == 175) return a[1]+d+" "+b[7]+" "+a[5];
		if(n == 176) return a[1]+d+" "+b[7]+" "+a[6];
		if(n == 177) return a[1]+d+" "+b[7]+" "+a[7];
		if(n == 178) return a[1]+d+" "+b[7]+" "+a[8];
		if(n == 179) return a[1]+d+" "+b[7]+" "+a[9];
		if(n == 180) return a[1]+d + b[8];
		if(n == 181) return a[1]+d+" "+b[8]+" "+a[1];
		if(n == 182) return a[1]+d+" "+b[8]+" "+a[2];
		if(n == 183) return a[1]+d+" "+b[8]+" "+a[3];
		if(n == 184) return a[1]+d+" "+b[8]+" "+a[4];
		if(n == 185) return a[1]+d+" "+b[8]+" "+a[5];
		if(n == 186) return a[1]+d+" "+b[8]+" "+a[6];
		if(n == 187) return a[1]+d+" "+b[8]+" "+a[7];
		if(n == 188) return a[1]+d+" "+b[8]+" "+a[8];
		if(n == 189) return a[1]+d+" "+b[8]+" "+a[9];
		if(n == 190) return a[1]+d + b[9];
		if(n == 191) return a[1]+d+" "+b[9]+" "+a[1];
		if(n == 192) return a[1]+d+" "+b[9]+" "+a[2];
		if(n == 193) return a[1]+d+" "+b[9]+" "+a[3];
		if(n == 194) return a[1]+d+" "+b[9]+" "+a[4];
		if(n == 195) return a[1]+d+" "+b[9]+" "+a[5];
		if(n == 196) return a[1]+d+" "+b[9]+" "+a[6];
		if(n == 197) return a[1]+d+" "+b[9]+" "+a[7];
		if(n == 198) return a[1]+d+" "+b[9]+" "+a[8];
		if(n == 199) return a[1]+d+" "+b[9]+" "+a[9];
		if(n == 200) return a[2] + d;
		if(n == 201) return a[2]+d+" "+a[1];
		if(n == 202) return a[2]+d+" "+a[2];
		if(n == 203) return a[2]+d+" "+a[3];
		if(n == 204) return a[2]+d+" "+a[4];
		if(n == 205) return a[2]+d+" "+a[5];
		if(n == 206) return a[2]+d+" "+a[6];
		if(n == 207) return a[2]+d+" "+a[7];
		if(n == 208) return a[2]+d+" "+a[8];
		if(n == 209) return a[2]+d+" "+a[9];
		if(n == 210) return a[2] + d + b[1];
		if(n == 211) return a[2]+d+" "+c[1];
		if(n == 212) return a[2]+d+" "+c[2];
		if(n == 213) return a[2]+d+" "+c[3];
		if(n == 214) return a[2]+d+" "+c[4];
		if(n == 215) return a[2]+d+" "+c[5];
		if(n == 216) return a[2]+d+" "+c[6];
		if(n == 217) return a[2]+d+" "+c[7];
		if(n == 218) return a[2]+d+" "+c[8];
		if(n == 219) return a[2]+d+" "+c[9];
		if(n == 220) return a[2] + d + b[2];
		if(n == 221) return a[2]+d+" "+b[2]+" "+a[1];
		if(n == 222) return a[2]+d+" "+b[2]+" "+a[2];
		if(n == 223) return a[2]+d+" "+b[2]+" "+a[3];
		if(n == 224) return a[2]+d+" "+b[2]+" "+a[4];
		if(n == 225) return a[2]+d+" "+b[2]+" "+a[5];
		if(n == 226) return a[2]+d+" "+b[2]+" "+a[6];
		if(n == 227) return a[2]+d+" "+b[2]+" "+a[7];
		if(n == 228) return a[2]+d+" "+b[2]+" "+a[8];
		if(n == 229) return a[2]+d+" "+b[2]+" "+a[9];
		if(n == 230) return a[2] + d + b[3];
		if(n == 231) return a[2]+d+" "+b[3]+" "+a[1];
		if(n == 232) return a[2]+d+" "+b[3]+" "+a[2];
		if(n == 233) return a[2]+d+" "+b[3]+" "+a[3];
		if(n == 234) return a[2]+d+" "+b[3]+" "+a[4];
		if(n == 235) return a[2]+d+" "+b[3]+" "+a[5];
		if(n == 236) return a[2]+d+" "+b[3]+" "+a[6];
		if(n == 237) return a[2]+d+" "+b[3]+" "+a[7];
		if(n == 238) return a[2]+d+" "+b[3]+" "+a[8];
		if(n == 239) return a[2]+d+" "+b[3]+" "+a[9];
		if(n == 240) return a[2] + d + b[4];
		if(n == 241) return a[2]+d+" "+b[4]+" "+a[1];
		if(n == 242) return a[2]+d+" "+b[4]+" "+a[2];
		if(n == 243) return a[2]+d+" "+b[4]+" "+a[3];
		if(n == 244) return a[2]+d+" "+b[4]+" "+a[4];
		if(n == 245) return a[2]+d+" "+b[4]+" "+a[5];
		if(n == 246) return a[2]+d+" "+b[4]+" "+a[6];
		if(n == 247) return a[2]+d+" "+b[4]+" "+a[7];
		if(n == 248) return a[2]+d+" "+b[4]+" "+a[8];
		if(n == 249) return a[2]+d+" "+b[4]+" "+a[9];
		if(n == 250) return a[2] + d + b[5];
		if(n == 251) return a[2]+d+" "+b[5]+" "+a[1];
		if(n == 252) return a[2]+d+" "+b[5]+" "+a[2];
		if(n == 253) return a[2]+d+" "+b[5]+" "+a[3];
		if(n == 254) return a[2]+d+" "+b[5]+" "+a[4];
		if(n == 255) return a[2]+d+" "+b[5]+" "+a[5];
		if(n == 256) return a[2]+d+" "+b[5]+" "+a[6];
		if(n == 257) return a[2]+d+" "+b[5]+" "+a[7];
		if(n == 258) return a[2]+d+" "+b[5]+" "+a[8];
		if(n == 259) return a[2]+d+" "+b[5]+" "+a[9];
		if(n == 260) return a[2] + d + b[6];
		if(n == 261) return a[2]+d+" "+b[6]+" "+a[1];
		if(n == 262) return a[2]+d+" "+b[6]+" "+a[2];
		if(n == 263) return a[2]+d+" "+b[6]+" "+a[3];
		if(n == 264) return a[2]+d+" "+b[6]+" "+a[4];
		if(n == 265) return a[2]+d+" "+b[6]+" "+a[5];
		if(n == 266) return a[2]+d+" "+b[6]+" "+a[6];
		if(n == 267) return a[2]+d+" "+b[6]+" "+a[7];
		if(n == 268) return a[2]+d+" "+b[6]+" "+a[8];
		if(n == 269) return a[2]+d+" "+b[6]+" "+a[9];
		if(n == 270) return a[2] + d + b[7];
		if(n == 271) return a[2]+d+" "+b[7]+" "+a[1];
		if(n == 272) return a[2]+d+" "+b[7]+" "+a[2];
		if(n == 273) return a[2]+d+" "+b[7]+" "+a[3];
		if(n == 274) return a[2]+d+" "+b[7]+" "+a[4];
		if(n == 275) return a[2]+d+" "+b[7]+" "+a[5];
		if(n == 276) return a[2]+d+" "+b[7]+" "+a[6];
		if(n == 277) return a[2]+d+" "+b[7]+" "+a[7];
		if(n == 278) return a[2]+d+" "+b[7]+" "+a[8];
		if(n == 279) return a[2]+d+" "+b[7]+" "+a[9];
		if(n == 280) return a[2] + d + b[8];
		if(n == 281) return a[2]+d+" "+b[8]+" "+a[1];
		if(n == 282) return a[2]+d+" "+b[8]+" "+a[2];
		if(n == 283) return a[2]+d+" "+b[8]+" "+a[3];
		if(n == 284) return a[2]+d+" "+b[8]+" "+a[4];
		if(n == 285) return a[2]+d+" "+b[8]+" "+a[5];
		if(n == 286) return a[2]+d+" "+b[8]+" "+a[6];
		if(n == 287) return a[2]+d+" "+b[8]+" "+a[7];
		if(n == 288) return a[2]+d+" "+b[8]+" "+a[8];
		if(n == 289) return a[2]+d+" "+b[8]+" "+a[9];
		if(n == 290) return a[2] + d + b[9]];
		if(n == 291) return a[2]+d+" "+b[9]+" "+a[1];
		if(n == 292) return a[2]+d+" "+b[9]+" "+a[2];
		if(n == 293) return a[2]+d+" "+b[9]+" "+a[3];
		if(n == 294) return a[2]+d+" "+b[9]+" "+a[4];
		if(n == 295) return a[2]+d+" "+b[9]+" "+a[5];
		if(n == 296) return a[2]+d+" "+b[9]+" "+a[6];
		if(n == 297) return a[2]+d+" "+b[9]+" "+a[7];
		if(n == 298) return a[2]+d+" "+b[9]+" "+a[8];
		if(n == 299) return a[2]+d+" "+b[9]+" "+a[9];
		if(n == 300) return a[3] + d;
		if(n == 301) return a[3]+d+" "+a[1];
		if(n == 302) return a[3]+d+" "+a[2];
		if(n == 303) return a[3]+d+" "+a[3];
		if(n == 304) return a[3]+d+" "+a[4];
		if(n == 305) return a[3]+d+" "+a[5];
		if(n == 306) return a[3]+d+" "+a[6];
		if(n == 307) return a[3]+d+" "+a[7];
		if(n == 308) return a[3]+d+" "+a[8];
		if(n == 309) return a[3]+d+" "+a[9];
		if(n == 310) return a[3] + d + b[1];
		if(n == 311) return a[3]+d+" "+b[1]+" "+c[1];
		if(n == 312) return a[3]+d+" "+b[1]+" "+c[2];
		if(n == 313) return a[3]+d+" "+b[1]+" "+c[3];
		if(n == 314) return a[3]+d+" "+b[1]+" "+c[4];
		if(n == 315) return a[3]+d+" "+b[1]+" "+c[5];
		if(n == 316) return a[3]+d+" "+b[1]+" "+c[6];
		if(n == 317) return a[3]+d+" "+b[1]+" "+c[7];
		if(n == 318) return a[3]+d+" "+b[1]+" "+c[8];
		if(n == 319) return a[3]+d+" "+b[1]+" "+c[9];
		if(n == 320) return a[3] + d + b[2];
		if(n == 321) return a[3]+d+" "+b[2]+" "+c[1];
		if(n == 322) return a[3]+d+" "+b[2]+" "+c[2];
		if(n == 323) return a[3]+d+" "+b[2]+" "+c[3];
		if(n == 324) return a[3]+d+" "+b[2]+" "+c[4];
		if(n == 325) return a[3]+d+" "+b[2]+" "+c[5];
		if(n == 326) return a[3]+d+" "+b[2]+" "+c[6];
		if(n == 327) return a[3]+d+" "+b[2]+" "+c[7];
		if(n == 328) return a[3]+d+" "+b[2]+" "+c[8];
		if(n == 329) return a[3]+d+" "+b[2]+" "+c[9];
		if(n == 330) return a[3] + d + b[3];
		if(n == 341) return a[3]+d+" "+b[4]+" "+c[1];
		if(n == 342) return a[3]+d+" "+b[4]+" "+c[2];
		if(n == 343) return a[3]+d+" "+b[4]+" "+c[3];
		if(n == 344) return a[3]+d+" "+b[4]+" "+c[4];
		if(n == 345) return a[3]+d+" "+b[4]+" "+c[5];
		if(n == 346) return a[3]+d+" "+b[4]+" "+c[6];
		if(n == 347) return a[3]+d+" "+b[4]+" "+c[7];
		if(n == 348) return a[3]+d+" "+b[4]+" "+c[8];
		if(n == 349) return a[3]+d+" "+b[4]+" "+c[9];
		if(n == 350) return a[3] + d + b[5];
		if(n == 351) return a[3]+d+" "+b[5]+" "+c[1];
		if(n == 352) return a[3]+d+" "+b[5]+" "+c[2];
		if(n == 353) return a[3]+d+" "+b[5]+" "+c[3];
		if(n == 354) return a[3]+d+" "+b[5]+" "+c[4];
		if(n == 355) return a[3]+d+" "+b[5]+" "+c[5];
		if(n == 356) return a[3]+d+" "+b[5]+" "+c[6];
		if(n == 357) return a[3]+d+" "+b[5]+" "+c[7];
		if(n == 358) return a[3]+d+" "+b[5]+" "+c[8];
		if(n == 359) return a[3]+d+" "+b[5]+" "+c[9];
		if(n == 360) return a[3] + d + b[6];
		if(n == 361) return a[3]+d+" "+b[6]+" "+c[1];
		if(n == 362) return a[3]+d+" "+b[6]+" "+c[2];
		if(n == 363) return a[3]+d+" "+b[6]+" "+c[3];
		if(n == 364) return a[3]+d+" "+b[6]+" "+c[4];
		if(n == 365) return a[3]+d+" "+b[6]+" "+c[5];
		if(n == 366) return a[3]+d+" "+b[6]+" "+c[6];
		if(n == 367) return a[3]+d+" "+b[6]+" "+c[7];
		if(n == 368) return a[3]+d+" "+b[6]+" "+c[8];
		if(n == 369) return a[3]+d+" "+b[6]+" "+c[9];
		if(n == 370) return a[3] + d + b[7];
		if(n == 371) return a[3]+d+" "+b[7]+" "+c[1];
		if(n == 372) return a[3]+d+" "+b[7]+" "+c[2];
		if(n == 373) return a[3]+d+" "+b[7]+" "+c[3];
		if(n == 374) return a[3]+d+" "+b[7]+" "+c[4];
		if(n == 375) return a[3]+d+" "+b[7]+" "+c[5];
		if(n == 376) return a[3]+d+" "+b[7]+" "+c[6];
		if(n == 377) return a[3]+d+" "+b[7]+" "+c[7];
		if(n == 378) return a[3]+d+" "+b[7]+" "+c[8];
		if(n == 379) return a[3]+d+" "+b[7]+" "+c[9];
		if(n == 380) return a[3] + d + b[8];	
		if(n == 381) return a[3]+d+" "+b[8]+" "+c[1];
		if(n == 382) return a[3]+d+" "+b[8]+" "+c[2];
		if(n == 383) return a[3]+d+" "+b[8]+" "+c[3];
		if(n == 384) return a[3]+d+" "+b[8]+" "+c[4];
		if(n == 385) return a[3]+d+" "+b[8]+" "+c[5];
		if(n == 386) return a[3]+d+" "+b[8]+" "+c[6];
		if(n == 387) return a[3]+d+" "+b[8]+" "+c[7];
		if(n == 388) return a[3]+d+" "+b[8]+" "+c[8];
		if(n == 389) return a[3]+d+" "+b[8]+" "+c[9];
		if(n == 390) return a[3] + d + b[9];
		if(n == 391) return a[3]+d+" "+b[9]+" "+c[1];
		if(n == 392) return a[3]+d+" "+b[9]+" "+c[2];
		if(n == 393) return a[3]+d+" "+b[9]+" "+c[3];
		if(n == 394) return a[3]+d+" "+b[9]+" "+c[4];
		if(n == 395) return a[3]+d+" "+b[9]+" "+c[5];
		if(n == 396) return a[3]+d+" "+b[9]+" "+c[6];
		if(n == 397) return a[3]+d+" "+b[9]+" "+c[7];
		if(n == 398) return a[3]+d+" "+b[9]+" "+c[8];
		if(n == 399) return a[3]+d+" "+b[9]+" "+c[9];
		if(n == 400) return a[4] + d ;
		if(n == 401) return a[4]+d+" "+a[1];
		if(n == 402) return a[4]+d+" "+a[2];
		if(n == 403) return a[4]+d+" "+a[3];
		if(n == 404) return a[4]+d+" "+a[4];
		if(n == 405) return a[4]+d+" "+a[5];
		if(n == 406) return a[4]+d+" "+a[6];
		if(n == 407) return a[4]+d+" "+a[7];
		if(n == 408) return a[4]+d+" "+a[8];
		if(n == 409) return a[4]+d+" "+a[9];
		if(n == 410) return a[4] + d + b[1];
		if(n == 411) return a[4]+d+" "+b[1]+" "+c[1];
		if(n == 412) return a[4]+d+" "+b[1]+" "+c[2];
		if(n == 413) return a[4]+d+" "+b[1]+" "+c[3];
		if(n == 414) return a[4]+d+" "+b[1]+" "+c[4];
		if(n == 415) return a[4]+d+" "+b[1]+" "+c[5];
		if(n == 416) return a[4]+d+" "+b[1]+" "+c[6];
		if(n == 417) return a[4]+d+" "+b[1]+" "+c[7];
		if(n == 418) return a[4]+d+" "+b[1]+" "+c[8];
		if(n == 419) return a[4]+d+" "+b[1]+" "+c[9];
		if(n == 420) return a[4] + d + b[2];
		if(n == 421) return a[4]+d+" "+b[2]+" "+c[1];
		if(n == 422) return a[4]+d+" "+b[2]+" "+c[2];
		if(n == 423) return a[4]+d+" "+b[2]+" "+c[3];
		if(n == 424) return a[4]+d+" "+b[2]+" "+c[4];
		if(n == 425) return a[4]+d+" "+b[2]+" "+c[5];
		if(n == 426) return a[4]+d+" "+b[2]+" "+c[6];
		if(n == 427) return a[4]+d+" "+b[2]+" "+c[7];
		if(n == 428) return a[4]+d+" "+b[2]+" "+c[8];
		if(n == 429) return a[4]+d+" "+b[2]+" "+c[9];
		if(n == 430) return a[4] + d + b[3];
		if(n == 441) return a[4]+d+" "+b[4]+" "+c[1];
		if(n == 442) return a[4]+d+" "+b[4]+" "+c[2];
		if(n == 443) return a[4]+d+" "+b[4]+" "+c[3];
		if(n == 444) return a[4]+d+" "+b[4]+" "+c[4];
		if(n == 445) return a[4]+d+" "+b[4]+" "+c[5];
		if(n == 446) return a[4]+d+" "+b[4]+" "+c[6];
		if(n == 447) return a[4]+d+" "+b[4]+" "+c[7];
		if(n == 448) return a[4]+d+" "+b[4]+" "+c[8];
		if(n == 449) return a[4]+d+" "+b[4]+" "+c[9];
		if(n == 450) return a[4] + d + b[5];
		if(n == 451) return a[4]+d+" "+b[5]+" "+c[1];
		if(n == 452) return a[4]+d+" "+b[5]+" "+c[2];
		if(n == 453) return a[4]+d+" "+b[5]+" "+c[3];
		if(n == 454) return a[4]+d+" "+b[5]+" "+c[4];
		if(n == 455) return a[4]+d+" "+b[5]+" "+c[5];
		if(n == 456) return a[4]+d+" "+b[5]+" "+c[6];
		if(n == 457) return a[4]+d+" "+b[5]+" "+c[7];
		if(n == 458) return a[4]+d+" "+b[5]+" "+c[8];
		if(n == 459) return a[4]+d+" "+b[5]+" "+c[9];
		if(n == 460) return a[4] + d + b[6];
		if(n == 461) return a[4]+d+" "+b[6]+" "+c[1];
		if(n == 462) return a[4]+d+" "+b[6]+" "+c[2];
		if(n == 463) return a[4]+d+" "+b[6]+" "+c[3];
		if(n == 464) return a[4]+d+" "+b[6]+" "+c[4];
		if(n == 465) return a[4]+d+" "+b[6]+" "+c[5];
		if(n == 466) return a[4]+d+" "+b[6]+" "+c[6];
		if(n == 467) return a[4]+d+" "+b[6]+" "+c[7];
		if(n == 468) return a[4]+d+" "+b[6]+" "+c[8];
		if(n == 469) return a[4]+d+" "+b[6]+" "+c[9];
		if(n == 470) return a[4] + d + b[7];
		if(n == 471) return a[4]+d+" "+b[7]+" "+c[1];
		if(n == 472) return a[4]+d+" "+b[7]+" "+c[2];
		if(n == 473) return a[4]+d+" "+b[7]+" "+c[3];
		if(n == 474) return a[4]+d+" "+b[7]+" "+c[4];
		if(n == 475) return a[4]+d+" "+b[7]+" "+c[5];
		if(n == 476) return a[4]+d+" "+b[7]+" "+c[6];
		if(n == 477) return a[4]+d+" "+b[7]+" "+c[7];
		if(n == 478) return a[4]+d+" "+b[7]+" "+c[8];
		if(n == 479) return a[4]+d+" "+b[7]+" "+c[9];
		if(n == 480) return a[4] + d + b[8];	
		if(n == 481) return a[4]+d+" "+b[8]+" "+c[1];
		if(n == 482) return a[4]+d+" "+b[8]+" "+c[2];
		if(n == 483) return a[4]+d+" "+b[8]+" "+c[3];
		if(n == 484) return a[4]+d+" "+b[8]+" "+c[4];
		if(n == 485) return a[4]+d+" "+b[8]+" "+c[5];
		if(n == 486) return a[4]+d+" "+b[8]+" "+c[6];
		if(n == 487) return a[4]+d+" "+b[8]+" "+c[7];
		if(n == 488) return a[4]+d+" "+b[8]+" "+c[8];
		if(n == 489) return a[4]+d+" "+b[8]+" "+c[9];
		if(n == 490) return a[4] + d + b[9];
		if(n == 491) return a[4]+d+" "+b[9]+" "+c[1];
		if(n == 492) return a[4]+d+" "+b[9]+" "+c[2];
		if(n == 493) return a[4]+d+" "+b[9]+" "+c[3];
		if(n == 494) return a[4]+d+" "+b[9]+" "+c[4];
		if(n == 495) return a[4]+d+" "+b[9]+" "+c[5];
		if(n == 496) return a[4]+d+" "+b[9]+" "+c[6];
		if(n == 497) return a[4]+d+" "+b[9]+" "+c[7];
		if(n == 498) return a[4]+d+" "+b[9]+" "+c[8];
		if(n == 499) return a[4]+d+" "+b[9]+" "+c[9];
		if(n == 500) return a[5] + d ;
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
