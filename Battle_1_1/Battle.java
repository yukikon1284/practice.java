import Items.Items;
public class Battle{
	public static void main(String[] args) {
		Boolean x = true;
		int answer = 0;
		while (answer== 0) {
			answer = Case.YN();
		}
		Items Itemss = new Items();
		Items.items();
	}
}