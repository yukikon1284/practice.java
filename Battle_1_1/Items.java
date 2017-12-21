import Items.Empty;
import Items.Weapons.OneHandedSwords.*;
import Items.Weapons.MagicalSwords.*;
import Items.Weapons.TwinSwords.*;
import Items.Weapons.JapaneseSwords.*;
import Items.Weapons.LargeSwords.*;
import Items.Weapons.Spears.*;
import Items.Weapons.Rods.*;
import Items.Weapons.MagicGuns.*;
import Items.Armors.MediumArmors.*;
import Items.Armors.LightArmors.*;
import Items.Armors.HeavyArmors.*;
import Items.Armors.MagicArmors.*;
import Items.Tools.RecoveryMedicines.*;
import Items.ItemsOrigin;
public class Items{
	private static ItemsOrigin[] iO;
	public static final String[][] ITEMS_TYPE = 
		{{"片手剣","魔法剣","双剣","刀","大剣","槍","杖","魔導銃"} //武器
		,{"中量防具","軽量防具","重量防具","魔道防具"} //防具
		,{"回復薬","特殊魔法薬","その他"} //アイテム{HP、MP回復、状態異常回復,能力上昇,その他}
		,{"攻撃魔法","回復魔法","特殊魔法"} //魔法
		,{"能力上昇","状態異常耐性","その他"}}; //装飾品
	Items(){
		iO = new ItemsOrigin[] {new Empty(), new Hinoki(), new WoodSword(), new BronzeSword(), new IronSword(), new MagicalIronSword(), new WoodTwinSword(), new WoodJapaneseSword(), new WoodLargeSword(), new WoodSpear(), new WoodRod(), new MagicIronGun(), new LeatherArmor(), new LeatherLightArmor(), new LeatherHeavyArmor(), new LeatherMagicArmor(), new RecoveryMedicine()};
		// String[] name = CaseOrigin.getDesignationStr(CaseOrigin.getAllName(ItemsOrigin), CaseOrigin.getAllType(ItemsOrigin, 0), 0);
		// for (int i=0; i<name.length; i++) Case.pl(name[i]);

		for (int i=0; i<iO.length; i++) seyAllStatus(i);


		/*int[] deNu = CaseOrigin.designationInt(CaseOrigin.getAllType(ItemsOrigin, 0), 0);
		for (int i=0; i<deNu.length; i++) {
			Case.pl(ItemsOrigin[deNu[i]].getName()+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getType())+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getAbility())+Case.newLine()+ItemsOrigin[deNu[i]].getAttribute()+Case.newLine()+ItemsOrigin[deNu[i]].getMoney()+Case.newLine()+ItemsOrigin[deNu[i]].getEquipment()+Case.newLine()+ItemsOrigin[deNu[i]].getEquipmentRestriction()+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getRestriction())+Case.newLine()+Case.toString(ItemsOrigin[deNu[i]].getTxts()));
		}*/

		// int[] deIn = CaseOrigin.getDesignationInt(CaseOrigin.designationInt(CaseOrigin.getAllType(ItemsOrigin, 0), 0), CaseOrigin.getAllType(ItemsOrigin, 1), 0);
		// for (int i=0; i<deIn.length; i++) seyAllStatus(deIn[i]);
	}
	private void seyAllStatus(int place){
		int[] type = iO[place].getType();
		int[][] attribute = iO[place].getAttribute();
		Case.pl("名前： "+iO[place].getName()+Case.newLine()+"種類： "+ITEMS_TYPE[type[0]][type[1]]+Case.newLine()+"アビリティ： "+Case.toString(CaseOrigin.ability(iO[place].getAbility()))+Case.newLine()+"属性： "+Case.toString(CaseOrigin.attribute(attribute[0]))+Case.newLine()+"属性耐性： "+Case.toString(CaseOrigin.attribute(attribute[1]))+Case.newLine()+"バフ： "+Case.toString(CaseOrigin.attributeAbility(attribute[2]))+Case.newLine()+"デバフ： "+Case.toString(CaseOrigin.attributeAbility(attribute[2]))+Case.newLine()+"価値： "+iO[place].getMoney()+Case.newLine()+"装備： "+iO[place].getEquipment()+Case.newLine()+"装備可能個数： "+iO[place].getEquipmentRestriction()+Case.newLine()+"販売制限 [ダンジョン, 階層]： "+Case.toString(iO[place].getRestriction())+Case.newLine()+"情報： "+Case.toString(iO[place].getTxts())+Case.newLine());
	}
	/*static int[][] getAllType(){
		final int IOL = ItemsOrigin.length;
		final int[][] type = new int[IOL][];
		for (int i=0; i<IOL; i++) type[i] = ItemsOrigin[i].getType();
		return type;
	}*/
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