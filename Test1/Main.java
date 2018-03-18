public class Main {
	public static void main(String[] args) {
		Battle battle = new Battle(new Slime(new int[]{10,10,1,2,3,4,5}, "slime1"), new Slime(new int[]{10,10,1,2,3,4,5}, "slime2"));
		battle.battle();
	}
}