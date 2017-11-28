import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
class Case{
	public static int YN(Boolean x){
		int answer = 0;
		String[] YN = {"はい","いいえ"};
		while(x){
			try{
				for (int i=0; i<YN.length; i++) {
					pl(number(i)+YN[i]);
				}
				answer = scanI();
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
	public static void time(int time){
		TimeUnit timeUnit = TimeUnit.SECONDS;
		try{
			timeUnit.sleep(time);
		}catch(InterruptedException e){
		}
	}
	public static int scanI(){
		Scanner scanner = new Scanner(System.in);
		int scanI;
		p(direction());
		scanI = scanner.nextInt();
		return scanI;
	}
	public static String scanS(){
		Scanner scanner = new Scanner(System.in);
		String scanS;
		p(direction());
		scanS = scanner.nextLine();
		return scanS;
	}
	public static int random(int number){
		Random random = new Random();
		int rnd = random.nextInt(number);
		return rnd;
	}
	public static String correct(){
		String correct = "対応した数字を入れてください。";
		return correct;
	}
	public static String number(int i){
		return direction()+(i+1)+" ";
	}
	public static String direction(){
		String direction = " >";
		return direction;
	}
	public static String back(){
		String back = "戻る";
		return back;
	}
	public static void pl(String str){
		System.out.println(str);
	}
	public static void p(String str){
		System.out.print(str);
	}
}