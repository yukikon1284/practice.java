import Items.Empty;
import Items.Weapons.OneHandedSwords.*;
import Items.Weapons.MagicalSwords.*;
import Items.Weapons.TwinSwords.*;
import Items.Weapons.JapaneseSwords.*;
import Items.ItemsOrigin;
public class Items{
	private static ItemsOrigin[] ItemsOrigin;
	private static String[][] itemNames = 
		{{"片手剣","魔法剣","双剣","刀","大剣","槍","杖","魔導銃"} //武器
		,{"中量防具","軽量防具","重量防具","魔道防具"} //防具
		,{"回復薬","特殊魔法薬","その他"} //アイテム{HP、MP回復,能力上昇,その他}
		,{"攻撃魔法","回復魔法","特殊魔法"} //魔法
		,{"能力上昇","状態異常耐性","その他"}}; //装飾品
	Items(){
		ItemsOrigin = new ItemsOrigin[] {new Empty(), new WoodSword(), new IronSword(), new BronzeSword(), new MagicalIronSword(), new WoodTwinSword(), new WoodJapaneseSword()};
		String[] name = Case.getDesignationStr(getAllName(), getAllType(0), 0);
		for (int i=0; i<name.length; i++) Case.pl(name[i]);
		
		int[] deNu = Case.designationNumber(getAllType(0), 0);
		for (int i=0; i<deNu.length; i++) {
			Case.pl(ItemsOrigin[deNu[i]].getName()+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getType())+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getAddAbility())+Case.newLine()+ItemsOrigin[deNu[i]].getAttribute()+Case.newLine()+ItemsOrigin[deNu[i]].getMoney()+Case.newLine()+ItemsOrigin[deNu[i]].getEquipment()+Case.newLine()+ItemsOrigin[deNu[i]].getEquipmentRestriction()+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getRestriction())+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getTxts()));
		}
	}
	static String[] getAllName(){
		final int IOL = ItemsOrigin.length;
		final String[] name = new String[IOL];
		for (int i=0; i<IOL; i++) name[i] = ItemsOrigin[i].getName();
		return name;
	}
	/*static int[][] getAllType(){
		final int IOL = ItemsOrigin.length;
		final int[][] type = new int[IOL][];
		for (int i=0; i<IOL; i++) type[i] = ItemsOrigin[i].getType();
		return type;
	}*/
	static int[] getAllType(int place){
		final int IOL = ItemsOrigin.length;
		final int[] type = new int[IOL];
		for (int i=0; i<IOL; i++) type[i] = ItemsOrigin[i].getType(place);
		return type;
	}
	/*static int[][] getAllAbility(){
		final int IOL = ItemsOrigin.length;
		final int[][] ability = new int[IOL][];
		for (int i=0; i<IOL; i++) ability[i] = ItemsOrigin[i].getAddAbility();
		return ability;
	}
	static int[] getAllAttribute(){
		final int IOL = ItemsOrigin.length;
		final int[] attribute = new int[IOL];
		for (int i=0; i<IOL; i++) attribute[i] = ItemsOrigin[i].getAttribute();
		return attribute;
	}
	static int[] getAllMoney(){
		final int IOL = ItemsOrigin.length;
		final int[] money = new int[IOL];
		for (int i=0; i<IOL; i++) money[i] = ItemsOrigin[i].getMoney();
		return money;
	}
	static int[] getAllEquipment(){
		final int IOL = ItemsOrigin.length;
		final int[] equipment = new int[IOL];
		for (int i=0; i<IOL; i++) equipment[i] = ItemsOrigin[i].getEquipment();
		return equipment;
	}
	static int[] getAllEquipmentRestriction(){
		final int IOL = ItemsOrigin.length;
		final int[] equipmentRestriction = new int[IOL];
		for (int i=0; i<IOL; i++) equipmentRestriction[i] = ItemsOrigin[i].getEquipmentRestriction();
		return equipmentRestriction;
	}
	static int[] getAllRestricrion(){
		final int IOL = ItemsOrigin.length;
		final int[] restriction = new int[IOL];
		for (int i=0; i<IOL; i++) restriction[i] = ItemsOrigin[i].getRestricrion();
		return restriction;
	}*/
}