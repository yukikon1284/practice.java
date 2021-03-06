import Enemys.SmallSizes.*;
import Enemys.EnemysOrigin;
import Characters.DungeonCharacters;
public class Enemys{
	private static EnemysOrigin[] EnemysOrigin;
	private static final String[][] enemySize = 
		{{"小1","中1","大1"}
		,{"小2","中2","大2"}
		,{"小3","中3","大3"}
		,{"小4","中4","大4"}
		,{"小5","中5","大5"}};
	Enemys(){
		EnemysOrigin = new EnemysOrigin[] {new Slime()};
		for (int i=0; i<EnemysOrigin.length; i++) seyAllStatus(i);
		int hierarchy = Case.random(99)+1;
		for (int i=0; i<EnemysOrigin.length; i++) seyAllStatus(i, hierarchy);
		/*String[] name = CaseOrigin.getDesignationStr(CaseOrigin.getAllName(EnemysOrigin), CaseOrigin.getAllType(EnemysOrigin, 0), 0);
		for (int i=0; i<name.length; i++) Case.pl(name[i]);*/

		//CaseOrigin.designationInt(CaseOrigin.getAllType(EnemysOrigin, 0), 0) ダンジョン指定
		//CaseOrigin.getDesignationInt(上を使う, CaseOrigin.getAllType(EnemysOrigin, 1), 0)　大きさ検索;
		//指定したダンジョン　指定した大きさ　検索
		/*int[] deIn = CaseOrigin.getDesignationInt(CaseOrigin.designationInt(CaseOrigin.getAllType(EnemysOrigin, 0), 0), CaseOrigin.getAllType(EnemysOrigin, 1), 1);
		for (int i=0; i<deIn.length; i++) Case.pl(EnemysOrigin[deIn[i]].getName()+"aaa");*/

		//指定したダンジョン　のすべて表示
		/*int[] deNu = CaseOrigin.designationInt(CaseOrigin.getAllType(EnemysOrigin, 0), 0);
		for (int i=0; i<deNu.length; i++) {
			Case.pl(EnemysOrigin[deNu[i]].getName()+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getType())+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getAbility())+Case.newLine()+EnemysOrigin[deNu[i]].getMoney()+Case.newLine()+EnemysOrigin[deNu[i]].getExperiencePoint()+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getDropItems())+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getDropItemsProbability())+Case.newLine()+Case.toString(EnemysOrigin[deNu[i]].getTxts()));
		}*/
		DungeonBattle db = new DungeonBattle(new DungeonCharacters[] {new BattleEnemy(EnemysOrigin[0], 10), new BattleEnemy(EnemysOrigin[0], 10)});
		db.dungeonBattle();
	}
	private void seyAllStatus(int place){
		int[] type = EnemysOrigin[place].getType();
		int[][] attribute = EnemysOrigin[place].getAttribute();
		Case.pl("名前： "+EnemysOrigin[place].getName()+Case.newLine()+"種類： "+enemySize[type[0]][type[1]]+Case.newLine()+"アビリティ固定： "+Case.toString(CaseOrigin.ability(EnemysOrigin[place].getAbility(0)))+Case.newLine()+"アビリティ変動： "+Case.toString(CaseOrigin.ability(EnemysOrigin[place].getAbility(1)))+Case.newLine()+"属性： "+Case.toString(CaseOrigin.attribute(attribute[0]))+Case.newLine()+"属性耐性： "+Case.toString(CaseOrigin.attribute(attribute[1]))+Case.newLine()+"お金： "+EnemysOrigin[place].getME(0)+Case.newLine()+"ドロップ: "+Case.toString(EnemysOrigin[place].getDropItems(0))+Case.newLine()+"ドロップ確率: "+Case.toString(EnemysOrigin[place].getDropItems(1))+Case.newLine()+"情報： "+Case.toString(EnemysOrigin[place].getTxts())+Case.newLine());
	}
	private void seyAllStatus(int place, int hierarchy){
		BattleEnemy bE = new BattleEnemy(EnemysOrigin[place], hierarchy);
		Case.pl("階層:"+hierarchy+Case.newLine()+"名前："+bE.getName()+Case.newLine()+Case.toString(CaseOrigin.ability(bE.getAbility()))+Case.newLine()+"レベル, お金, 経験値"+Case.toString(bE.getLME())+Case.newLine()+"攻撃"+Case.toString(bE.attack())+Case.newLine());
	}

	/*static int[] getAllType(){
		final int IOL = EnemysOrigin.length;
		final int[] type = new int[IOL];
		for (int i=0; i<IOL; i++) type[i] = EnemysOrigin[i].getType(0);
		return type;
	}*/
}