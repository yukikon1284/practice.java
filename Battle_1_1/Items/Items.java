package Items;
public class Items{
	private static ItemsOrigin[] ItemsOrigin;
	private static String[][] itemsN = 
		{{"剣","杖","槍","銃","立て"}
		,{"軽","中","重"}
		,{"攻撃","回復","以上"}
		,{"１攻撃","２回復","３以上"}
		,{"能力","体制","そのた"}};
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