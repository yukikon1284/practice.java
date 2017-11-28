package Items;
import Items.Sword.*;
import Items.MagicSword.*;
public class Items{
	private static ItemsOrigin[] ItemsOrigin;
	private static String[][] itemsN = 
		{{"片手剣","魔法剣","双剣","刀","大剣","槍","杖","魔道銃"}//武器
		,{"中","軽","重","魔"}//防具
		,{"回復薬","状態異常回復薬","その他"}//アイテム
		,{"攻撃魔法","回復魔法","状態異常攻撃魔法","状態異常回復魔法"}//魔法
		,{"能力","状態異常耐性","その他"}};//装飾品
	public static void items(){
		ItemsOrigin = new ItemsOrigin[] {new WoodSword(), new IronSword(), new BronzeSword(), new MagicalIronSword()};
		System.out.println(ItemsOrigin[1].getName());
		System.out.println(ItemsOrigin[0].getName());
		System.out.println(ItemsOrigin[2].getName());
		designationType(0);
	}
	public static void designationType(final int place){
		for (int i=0; i<ItemsOrigin.length; i++) {
			final int[] type = ItemsOrigin[i].getType();
			if (type[0] == place) System.out.println(itemsN[type[0]][type[1]]);
		}
	}
}