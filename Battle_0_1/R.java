import java.util.Random;
import java.util.Scanner;
public class R{
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner Scan = new Scanner(System.in);
		int i;
		int n;
		int k = 0;
		int answer;
		int random;
		int[] key = {0,0};
		answer = Scan.nextInt();
		while(true){
			for (i=0; i<2; i++) {
				for (n=0; n<10; ) {
					n++;
					random = rnd.nextInt(6)+1;
					if (n >= 10) {
						key[i] = random;
					}
				}
			}
			if (key[0] == key[1]) {
				k++;
				System.out.println(key[0]);
				if (answer == k) {
					break;				
				}
			}
		}
	}
}