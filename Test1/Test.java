import tool.Tool;
import java.util.Arrays;
public class Test {
	public static void main(String[] args) {
		int[] asd = {1,2,3,4,5,6,7};
		System.out.println(Arrays.binarySearch(asd, 3));
	}
}
/*
	name 
	status HPMP
	装備 
	level 
	戦闘 はじめ new (状態)
	ダンジョンに入ったら new (money EXP DorpItem) ダンジョンを出たら del 対応する数値へ

	player Data
		name
		status HPMP
		装備
		装備以外のアイテム
		DorpItem
		Level
		Money
		EXP

	Enemy Data
		戦闘時に new Level
		コンストラクタで引数level 
		name
		status HPMP
		Money
		EXP
		DropItem
		攻撃モーション
		防御モーション

	DropItem
		name[]
		Money[]

	錬金
		DorpItem から アイテムへ
	
	装備

	Items
		Type
		name
		Data 
			武器 {なし,物理,魔法} {相手に与える状態異常} {装備しているときの状態異常0}
			魔法 {なし,物理,魔法,回復量,上昇量} {相手に与える状態異常}
			防具 {なし、物理防御,魔法防御力} {装備しているときの状態異常1} 
			道具 {なし,物理,魔法,回復量,上昇量} {自分に与える状態異常}
			装飾品 {装備しているときの状態異常2} {装備しているときの状態異常耐性} {上昇量buff, 復活buff}
			
			装備しているとき ~ 戦闘開始の時にやる
			


		{{"片手剣","魔法剣","双剣","刀","大剣","槍","杖","魔導銃"} //武器
		,{"中量防具","軽量防具","重量防具","魔道防具"} //防具
		,{"回復薬","特殊魔法薬","その他"} //アイテム{HP、MP回復、状態異常回復,能力上昇,その他}
		,{"攻撃魔法","回復魔法","特殊魔法"} //魔法
		,{"能力上昇","状態異常耐性","その他"}};


		復活系は　デバフの効果後に発動する

		上昇系の　リセットは戦闘後　EXP　などの精算後に行う


		buff = {基本バフ}{基本デバフ}{特殊バフ}{武器バフ}{防具バフ}{}
*/