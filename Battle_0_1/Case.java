import java.util.Scanner;
import java.util.Random;
class Case{
	public static int YN(Boolean x){
		int i;
		int answer = 0;
		String[] YN = {"はい","いいえ"};
		while(x){
			try{
				for (i=0; i<YN.length; i++) {
					pl(number(i)+YN[i]);
				}
				answer = ScanI();
				if (answer == 1 || answer == 2) {
					x = false;
				}else{
					pl(correct());
				}
			}catch(java.util.InputMismatchException e){
				pl(correct());
			}
		}
		return answer;
	}
	public static int ScanI(){
		Scanner scanner = new Scanner(System.in);
		int ScanI;
		p(direction());
		ScanI = scanner.nextInt();
		return ScanI;
	}
	public static int Random(int R){
		Random rnd = new Random();
		int Random = rnd.nextInt(R);
		return Random;
	}
	public static String ScanS(){
		Scanner scanner = new Scanner(System.in);
		String ScanS = scanner.nextLine();
		return ScanS;
	}
	public static String correct(){
		String correct = "対応した数字を入れてください。";
		return correct;
	}
	public static String number(int i){
		String[] number = {" >1 "," >2 "," >3 "," >4 "," >5 "," >6 "," >7 "," >8 "," >9 "};
		return number[i];
	}
	public static String SCE(int i){
		String[] SCM = {"始め","続き","終わり"};
		return SCM[i];
	}
	public static String MCR(int i){
		String[] MCR = {"進む","確認",};
		return MCR[i];
	}
	public static String direction(){
		String direction = " >";
		return direction;
	}
	public static String Back(){
		String Back = "戻る";
		return Back;
	}
	public static void pl(String str){
		System.out.println(str);
	}
	public static void p(String str){
		System.out.print(str);
	}
}