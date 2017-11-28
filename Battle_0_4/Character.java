class Character{

	//ability = {"HP","MP","STR","VIT","INT","MGR","AGI"};
	private static int[][] ability = 
		{{1,1,1,1,1,1,1}
		,{1,1,1,1,1,1,1}
		,{1,1,1,1,1,1,1}};
	
	private static int[][] abilityOperation = 
		{{1,1,1,1,1,1,1}
		,{1,1,1,1,1,1,1}
		,{1,1,1,1,1,1,1}};

	//{EDR,店,種類,場所};
	private static int[] places = {0,0,0,0};

	//[キャラ] キャラのレベル
	private static int[] level = {1,1,1};

	private static int[] experience = {10000000,0,0};
	//どのキャラ
	private static int n;

	private static String[] name = {"無し","無し","無し"};

	private static Boolean[] storageLocation = {false, false, false};

	//キャラごとのお金
	private static int[] money = {1000000,0,0};

	//表示したアイテムの場所
	private static int[] CIN = {0,0,0,0,0};

	/*[キャラ][店][種類][場所]現在装備している装備の場所 */
	private static int[][][][] equipmentPlace = 
		//1 武器
		{{{{5,0,0}}
		//1 防具
		,{{5,0,0}}
		//1 魔法
		,{{5,0,0}
		,{5,0,0}
		,{5,0,0}}
		//1 道具
		,{{5,0,0}
		,{5,0,0}
		,{5,0,0}
		,{5,0,0}
		,{5,0,0}}
		//1 装飾品
		,{{5,0,0}}}
		//2 武器
		,{{{5,0,0}}
		//2 防具
		,{{5,0,0}}
		//2 魔法
		,{{5,0,0}
		,{5,0,0}
		,{5,0,0}}
		//2 道具
		,{{5,0,0}
		,{5,0,0}
		,{5,0,0}
		,{5,0,0}
		,{5,0,0}}
		//2 装飾品
		,{{5,0,0}}}
		//3 武器
		,{{{5,0,0}}
		//3 防具
		,{{5,0,0}}
		//3 魔法
		,{{5,0,0}
		,{5,0,0}
		,{5,0,0}}
		//3 道具
		,{{5,0,0}
		,{5,0,0}
		,{5,0,0}
		,{5,0,0}
		,{5,0,0}}
		//3 装飾品
		,{{5,0,0}}}};

	//キャラ 店 場所
	private static int[][][] equipmentNumber = 
		//1 武器
		{{{1}
		//1 防具
		,{1}
		//1 魔法
		,{1,1,1}
		//1 道具
		,{1,1,1,1,1}
		//1 装飾品
		,{1}}
		//2 武器
		,{{1}
		//2 防具
		,{1}
		//2 魔法
		,{1,1,1}
		//2 道具
		,{1,1,1,1,1}
		//2 装飾品
		,{1}}
		//3 武器
		,{{1}
		//3 防具
		,{1}
		//3 魔法
		,{1,1,1}
		//3 道具
		,{1,1,1,1,1}
		//3 装飾品
		,{1}}};

	//キャラ 店 種類 場所
	private static int[][][][] itemsNumber = 
		//1 武器
		{{{{12,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//1 防具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//1 魔法
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//1 道具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//1 装飾品
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//1 無し
		,{{0}}}
		//2 武器
		,{{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//2 防具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//2 魔法
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//2 道具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//2 装飾品
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//2 無し
		,{{0}}}
		//3 武器
		,{{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//3 防具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//3 魔法
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//3 道具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//3 装飾品
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//3 無し
		,{{0}}}};
	
	private static int[] dungeonLevel = {1,1,1};

	static int[] getAbility(){
		return ability[n];
	}
	static int getAbility(int place){
		return ability[n][place];
	}
	static void setAbility(int[] addAbility){
		for (int i=0; i<addAbility.length; i++) {
			setAbility(i, addAbility[i]);
		}
	}
	static void setAbility(int place, int addAbility){
		ability[n][place] += addAbility;
	}
	static void setNewAbility(){
		ability[n] = Case.setIntArr(getAbility().length, 1);
	}
	static String getAbilityName(int place){
		String[] abilityName = {"HP","MP","STR","VIT","INT","MGR","AGI"};
		return abilityName[place];
	}
	static void setName(String changeName){
		name[n] = changeName;
	}
	static void setName(Boolean x){
		while(x){
			Case.pl("名前を入れてください。");
			String name = Case.scanS();
			int answer = Case.YN(x);
			if (answer == 1) {
				setName(name);
				x = false;
			}
		}
	}
	static String[] getName(){
		return name;
	}
	static String getName(int place){
		return name[place];
	}
	static String getMyName(){
		return name[n];
	}
	static int getEquipmentPlace(int shop, int type, int place){
		return equipmentPlace[n][shop][type][place];
	}
	static Boolean[] getStorageLocation(){
		return storageLocation;
	}
	static Boolean getStorageLocation(int place){
		return storageLocation[place];
	}
	static void setStorageLocation(Boolean[] StorageTF){
		for (int i=0; i<StorageTF.length; i++) {
			setStorageLocation(i, StorageTF[i]);
		}
	}
	static void setStorageLocation(int place, Boolean StorageTF){
		storageLocation[place] = StorageTF;
	}
	static void setStorageLocationNew(Boolean x){
		setName(x);
		HealingShops.levelif(x, 10);
	}
	static int[] getAbilityOperation(){
		return abilityOperation[n];
	}
	static void setAbilityOperation(){
		int[] abilityMaxIntArr = getAbilityMax();
		for (int i=0; i<abilityMaxIntArr.length; i++) {
			setAbilityOperation(i, abilityMaxIntArr[i]);
		}
	}
	static void setAbilityOperation(int place, int addAbility){
		abilityOperation[n][place] += addAbility;
		int abilityMaxInt = getAbilityMax()[place];
		int abilityOperationInt = getAbilityOperation()[place];
		if (abilityOperationInt > abilityMaxInt) abilityOperation[n][place] = abilityMaxInt;
		else if (abilityOperationInt < 0) abilityOperation[n][place] = 0;
	}
	static int[] getAbilityMax(){
		int[] abilityMaxIntArr = new int[getAbility().length];
		for (int i=0; i<abilityMaxIntArr.length; i++) {
			abilityMaxIntArr[i] = getAbilityMax(i);
		}
		return abilityMaxIntArr;
	}
	static int getAbilityMax(int place){
		final int[] abilityMaxConstant = {10,10,1,1,1,1,1};
		return getAbility(place)*abilityMaxConstant[place];
	}
	static int getLevel(){
		return level[n];
	}
	static void setLevel(int addlevel){
		level[n] += addlevel;
	}
	static int[] getEquipmentNumber(int place){
		return equipmentNumber[n][place];
	}
	static int getExperience(){
		return experience[n];
	}
	static void setExperience(int addExperience){
		experience[n] += addExperience;
	}
	static int[] getCharacterItemsNumber(int store, int type){
		return itemsNumber[n][store][type];
	}
	static int getCharacterItemsNumber(int store, int type, int place){
		return itemsNumber[n][store][type][place];
	}
	static void setCharacterItemsNumber(int store, int type, int i, int answer){
		itemsNumber[n][store][type][i] += answer;
	}
	static int getCharacter(){
		return n;
	}
	static void setCharacter(int C){
		n = C;
	}
	static int getMoney(){
		return money[n];
	}
	static void setMoney(int m){
		money[n] += m;
	}
	static void setDungeonLevel(int level){
		dungeonLevel[n] = level;
	}
	static int getDungeonLevel(){
		return dungeonLevel[n];
	}
	static void inventoryOperation(Boolean x){
		int i = 0;
		int size;
		int answer = 0;
		while(x){
			try{
				size = inventoryif(i);
				answer = Case.scanI();
				Boolean answerTF = false;
				if (answer <= size && answer > 0) answerTF = true;
				if (answer == size+1) {
					if (i == 0) x = false;
					else i--;
				}else if (answerTF || answerTF && i == 2 && places[0] == 2) {
					if (i == 3) {
						places[i] = answer-1;
						inventoryEDR(x);
					}else if (i == 2 && places[0] == 2) {
						places[i] = answer-1;
						inventoryEDR(x);
					}else {
						places[i] = answer-1;
						i++;
					}
				}else {
					Case.seyCorrect();
				}
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}catch(java.lang.ArrayIndexOutOfBoundsException e){
				Case.seyCorrect();
			}
		}
	}
	private static int inventorypl(int place){
		int i;
		int[] inventoryIntArr = {0,0,places[1]};
		String[][][] inventoryStrArr = 
		{{{"装備する","説明","装備を外す"}}
		,{{"武器","防具","魔道書","道具","装飾品"}}
		,{{"片手剣","魔法剣","双剣","刀","槍","大剣","大杖","魔道銃"}
		,{"中量装備","軽量装備","重量装備","魔道装備"}
		,{"攻撃魔法","回復魔法","特殊魔法"}
		,{"攻撃用","回復用","その他"}
		,{"上昇系","軽減系","回復系"}}};
		int inventoryLength = inventoryStrArr[place][inventoryIntArr[place]].length;
		for (i=0; i<inventoryLength; i++) Case.pl(Case.number(i)+inventoryStrArr[place][inventoryIntArr[place]][i]);
		Case.pl(Case.number(i)+Case.back());
				return inventoryLength;
	}
	private static int inventoryif(int i){
		int size;
		String[] EDR = {" どれを装備しますか？"," どれの説明を見ますか？"," どの装備を外しますか？"};
		
		/*
			if (
				||
				&& R) {
				
			}else
		*/
		if (i == 3 
		    || i == 2 
		    && places[0] == 2) {
			Case.pl(EDR[places[0]]);
			size = itemsNameSize();
		}else size = inventorypl(i);
		return size;
	}
	private static void inventoryEDR(Boolean x){
		int answer = 0;
		if (places[0] == 0) inventoryE(x);
		else if (places[0] == 1) {
			Case.pl(Items.itemsName(places[1], places[2], places[3]));
			String[] flavorText = Items.itemsFlavorText(places[1], places[2], places[3]);
			for (int i=0; i<flavorText.length; i++) Case.pl(flavorText[i]);
		}else if (places[0] == 2) inventoryR(x);
	}
	private static void inventoryE(Boolean x){
		int answer = 0;
		int number = 0;
		while(x){
			int equipmentNumberInt = equipmentNumber[n][places[1]].length;

			/*
				if (魔道書
					||　道具) {
					装備する場所はどこか?
				}
			*/
			if (places[1] == 2 
				|| places[1] == 3) {
				try{
					Case.pl(" どこに装備しますか？");
					int i;

					//装備する場所表示。 文字列
					for (i=0; i<equipmentNumberInt; i++) {
						String equipmentStr = Case.number(i)+Items.itemsName(equipmentPlace[n][places[1]][i][0], equipmentPlace[n][places[1]][i][1], equipmentPlace[n][places[1]][i][2]);
						if (places[1] == 2 || equipmentPlace[n][places[1]][i][0] == 5) {
							Case.pl(equipmentStr);
						}else {
							Case.pl(equipmentStr+" ("+equipmentNumber[n][places[1]][i]+")");
						}
					}
					Case.pl(Case.number(i)+Case.back());
					answer = Case.scanI();
				}catch(java.util.InputMismatchException e){
					Case.seyCorrect();
				}
			}

			/*
				if () 
				else if (道具) {
					何個装備するか？
				}
			*/
			int inventoryInt = Items.itemsEquipmentNumber(places[1], places[2], places[3]);
			if (answer == equipmentNumberInt+1) break;
			else if (places[1] == 3) {
				try{
					Case.pl(" 何個装備しますか？ 最大"+inventoryInt+"個装備できます。");
					number = Case.scanI();
				}catch(java.util.InputMismatchException e){
					Case.seyCorrect();
				}
			}
			Boolean answerTF = false;
			if (answer > 0 && answer <= equipmentNumberInt) answerTF = true;
			Boolean numberTF = false;
			if (number > 0 && number <= inventoryInt && number <= itemsNumber[n][places[1]][places[2]][CIN[places[3]]]) numberTF = true;

			/*
				if (魔道以外
				&&　道具以外
				||　魔道
				&& answerが0超えのとき
				|| 道具
				&&　answerが0超えのとき
				&& 
				&&
				&& ) {
					アイテムを装備するする
				}
			*/
			if (places[1] != 2 
				&& places[1] != 3
				|| places[1] == 2 
				&& answerTF 
				|| places[1] == 3
				&& answerTF 
				&& numberTF) {

				//[0装備する場所 1装備する個数][places[1]] 整数 二次元配列
				int[][] itemsEquipmentIntArr = {{0,0,answer-1,answer-1,0},{1,1,1,number,1}};

				//現在装備しているものを増やす。
				itemsNumber[n][equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][0]][equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][1]][equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][2]] += equipmentNumber[n][places[1]][itemsEquipmentIntArr[0][places[1]]];

				//装備を変更する。
				equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][0] = places[1];
				equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][1] = places[2];
				equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][2] = CIN[places[3]];

				//現在装備している個数へ変更。
				equipmentNumber[n][places[1]][itemsEquipmentIntArr[0][places[1]]] = itemsEquipmentIntArr[1][places[1]];

				//現在装備しているものを減らす。
				itemsNumber[n][equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][0]][equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][1]][equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][2]] -= itemsEquipmentIntArr[1][places[1]];

				//現在装備しているもの。 文字列
				String itemsEquipmentStr = " "+Items.itemsName(equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][0], equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][1], equipmentPlace[n][places[1]][itemsEquipmentIntArr[0][places[1]]][2])+"を装備した。";

				//現在装備しているもの。 文字列 一次元配列
				String[] itemsEquipmentStrArr = {itemsEquipmentStr,itemsEquipmentStr," "+itemsEquipmentStr+"を装備した。"," "+itemsEquipmentStr+"を"+number+"個装備した。",itemsEquipmentStr};
				Case.pl(itemsEquipmentStrArr[places[1]]);
				if (places[1] != 2 && places[1] != 3) x = false;
			}else if (places[1] == 3) Case.pl(" 数が足りない、又は装備出来る最大数を超えています。");
		}
	}
	private static void inventoryR(Boolean x){
		int i;
		int answer = 0;
		while(x){
			int equipmentNumberInt = equipmentNumber[n][places[1]].length;

			/*
				if () {
					装備を外す場所はどこか?
				}
			*/
			if (places[1] == 2 
				|| places[1] == 3) {
				try{
					Case.pl(" どこに装備を外しますか？");
					for (i=0; i<equipmentNumberInt; i++) {
						
						//装備を外す場所表示。 文字列
						String equipmentStr = Case.number(i)+Items.itemsName(equipmentPlace[n][places[1]][i][0], equipmentPlace[n][places[1]][i][1], equipmentPlace[n][places[1]][i][2]);
						if (places[1] == 2 
						    || equipmentPlace[n][places[1]][i][0] == 5) Case.pl(equipmentStr);
						else Case.pl(equipmentStr+" ("+equipmentNumber[n][places[1]][i]+")");
					}
					Case.pl(Case.number(i)+Case.back());
					answer = Case.scanI();
				}catch(java.util.InputMismatchException e){
					Case.seyCorrect();
				}
			}
			int[] itemsEquipmentIntArr = {0,0,answer-1,answer-1,0};
			Boolean answerTF = false;
			if (answer > 0 || answer <= equipmentNumberInt+1) answerTF = true;

			/*
				if () 
				else if (装備している装備が 無し
				) {
					
				}
				else if (
					&& 
					|| 魔道書
					&& answerが0以上
					&& answerが装備できる最大以下
					|| 道具
					&& answerが0以上
					&& answerが装備できる最大以下) {
				 	装備を外す
				 } 
			*/
			if (answer == equipmentNumberInt+1) break;
			else if (equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][0] == 5) {
				Case.pl("装備していない。");
				if (places[1] != 2 && places[1] != 3) x = false;
			}
			else if (places[1] != 2 
				&& places[1] != 3 
				|| places[1] == 2 
				&& answerTF 
				|| places[1] == 3
				&& answerTF) {

				//現在装備しているものを増やす。
				itemsNumber[n][equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][0]][equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][1]][equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][2]] += equipmentNumber[n][places[1]][itemsEquipmentIntArr[places[1]]];

				//装備を変更する。
				equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][0] = 5;
				equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][1] = 0;
				equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][2] = 0;

				//現在装備している1へ変更。
				equipmentNumber[n][places[1]][itemsEquipmentIntArr[places[1]]] = 1;

				//現在装備しているもの。 文字列
				String itemsEquipmentStr = " "+Items.itemsName(equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][0], equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][1], equipmentPlace[n][places[1]][itemsEquipmentIntArr[places[1]]][2])+"を外した。";
				Case.pl(itemsEquipmentStr);
				if (places[1] != 2 && places[1] != 3) x = false;
			}
		}
	}
	private static int itemsNameSize(){
		int t;
		/*if (装備を外す以外) {
		}else if (装備を外す) {
		}*/
		/*if (places[0] != 2) {
			for (i=0; i<Items.itemsName()[places[1]][places[2]].length; i++) {
				if (getCharacterItemsNumber(places[1], places[2], i) >= 1) {
					Case.pl(Case.number(t)+Items.itemsName()[places[1]][places[2]][i]+" ("+Character.getCharacterItemsNumber(places[1], places[2], i)+")");
					CIN[t] = i;
					t++;
				}
			}
		}else if (places[0] == 2) {
			for (i=0; i<equipmentPlace[n][places[1]].length; i++) {
				Case.pl(Case.number(t)+Items.itemsName()[equipmentPlace[n][places[1]][i][0]][equipmentPlace[n][places[1]][i][1]][equipmentPlace[n][places[1]][i][2]]);
				t++;
			}	
		}*/
		if (places[0] != 2) {
			int[][] poCIN = Items.seyItemsName(places[1], places[2], false, false, true);
			CIN = poCIN[0];
			t = poCIN[1][0];
		}else t = seyEquipmentName(places[1], places[2]);
		return t;
	}
	static int seyEquipmentName(int store, int type){
		int i;
		for (i=0; i<equipmentPlace[n][store].length; i++) Case.pl(Case.number(i)+Items.itemsName(equipmentPlace[n][store][i][0], equipmentPlace[n][store][i][1], equipmentPlace[n][store][i][2]));
		Case.pl(Case.number(i)+Case.back());
		return i;
	}
}