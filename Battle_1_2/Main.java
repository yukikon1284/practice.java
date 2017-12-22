public class Main{
	public static void main(String[] args) {
		Battle battle = new Battle(new BattleCharacter[] {new Slime("a"), new Slime("b")});
		battle.battle();
	}
}