package Items;
public class Items{
	private static ItemsOrigin[] ItemsOrigin;
	private static String[][] itemsN = 
		{{"片手剣","魔法剣","双剣","刀","大剣","槍","杖","魔道銃"}
		,{"中","軽","重","魔"}
		,{"攻撃","回復","状態異常回復","その他"}//アイテム
		,{"攻撃","回復","状態異常攻撃","状態異常回復"}//魔法
		,{"能力","状態異常耐性","その他"}};//装飾品
	public static void items(){
		ItemsOrigin = new ItemsOrigin[] {new WoodSword(), new IronSword()};
		System.out.println(ItemsOrigin[1].getName());
		System.out.println(ItemsOrigin[0].getName());
		designationType(0);
	}
	public static void designationType(final int place){
		for (int i=0; i<ItemsOrigin.length; i++) {
			final int[] type = ItemsOrigin[i].getType();
			if (type[0] == place) System.out.println(itemsN[type[0]][type[1]]);
		}
	}
}