class Character{
	private int[] place = {0,0,0};
	private static int n;
	private static int[] money = {0,0,0};
	private static int[][][][] CharacterEquipment = 
	//キャラ　店　種類　場所
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
	private static int[][][] CharacterEquipmentNumber = 
	//キャラ　店　場所
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
	private static int[][][][] CharacterItemsNumber = 
	//キャラ　店　種類　場所
		//1 武器
		{{{{0,0,0,0,0}
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
	public static int GetCharacterItemsNumber(int store, int type, int i){
		return CharacterItemsNumber[n][store][type][i];
	}
	public static void SetCharacterItemsNumber(int store, int bs, int type, int i, int answer){
		if (bs == 0) {
			CharacterItemsNumber[n][store][type][i] += answer;
		}else{
			CharacterItemsNumber[n][store][type][i] -= answer;
		}
	}
	public int GetCharacter(){
		return n;
	}
	public void SetCharacter(int C){
		n = C;
	}
	public static int GetMoney(){
		return money[n];
	}
	public static void SetMoney0(int M){
		money[n] += M;
	}
	public void SetMoney1(int M){
		money[n] -= M;
	}
	public void equipment(Boolean x){
		int i = 0;
		int size;
		int answer = 0;
		while(x){
			try{
				size = equipmentif(i);
				answer = Case.ScanI();
				if (answer == size+1) {
					if (i == 0) {
						x = false;
					}else {
						i--;
						place[i] = 0;
					}
				}else if (answer <= size && answer > 0 || i == 1 && this.place[0] == 2) {
					if (i == 3) {
						equipmentEDR(answer-1, x);
					}else if (i == 1 && this.place[0] == 2) {
						place[i] = answer-1;
						equipmentEDR(answer-1, x);
					}else {
						place[i] = answer-1;
						i++;
					}
				}else {
					Case.pl(Case.correct());
				}
			}catch(java.util.InputMismatchException e){
				Case.pl(Case.correct());
			}
		}
	}
	private int equipmentpl(int place){
		int i;
		int[] equipmentif = {this.place[2],this.place[2],this.place[1]};
		String[][][] equipment = 
		{{{"装備する","説明","装備を外す"}}
		,{{"武器","防具","魔道書","道具","装飾品"}}
		,{{"片手剣","魔法剣","双剣","刀","槍","大剣","大杖","魔道銃"}
		,{"中量装備","軽量装備","重量装備","魔道装備"}
		,{"攻撃魔法","回復魔法","特殊魔法"}
		,{"攻撃用","回復用","その他"}
		,{"上昇系","軽減系","回復系"}}};
		for (i=0; i<equipment[place][equipmentif[place]].length; i++) {
			Case.pl(Case.number(i)+equipment[place][equipmentif[place]][i]);
		}
		Case.pl(Case.number(i)+Case.Back());
		return equipment[place][equipmentif[place]].length;
	}
	private int equipmentif(int i){
		int size;
		String[] EDR = {" どれを装備しますか？"," どれの説明を見ますか？"," どの装備を外しますか？"};
		if (i == 3) {
			Case.pl(EDR[this.place[0]]);
			size = Shop.ItemsName1(this.place[1], this.place[2], 1);
		}else {
			size = equipmentpl(i);
		}
		return size;
	}
	private void equipmentEDR(int place, Boolean x){
		//課題あり
		int i;
		int answer = 0;
		if (this.place[0] == 0) {
			if (this.place[1] == 0 || this.place[1] == 1 || this.place[1] == 4) {
				CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][0][0]][CharacterEquipment[n][this.place[1]][0][1]][CharacterEquipment[n][this.place[1]][0][2]]++;
				CharacterEquipment[n][this.place[1]][0][0] = this.place[1];
				CharacterEquipment[n][this.place[1]][0][1] = this.place[2];
				CharacterEquipment[n][this.place[1]][0][2] = Shop.CIN(place);
				CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][0][0]][CharacterEquipment[n][this.place[1]][0][1]][CharacterEquipment[n][this.place[1]][0][2]]--;
				Case.pl(" "+Items.ItemsName(CharacterEquipment[n][this.place[1]][0][0], CharacterEquipment[n][this.place[1]][0][1], CharacterEquipment[n][this.place[1]][0][2])+"を装備した。");
			}else {
				equipmentE(place, x);
			}
		}else if (this.place[0] == 1) {
			Case.pl(Items.ItemsName(this.place[1], this.place[2], place));
			for (i=0; i<Items.ItemsFlavorTextl(this.place[1], this.place[2], place); ) {
				Case.pl(Items.ItemsFlavorText(this.place[1], this.place[2], place, i));
			}
		}else if (this.place[0] == 2) {
			if (this.place[1] == 0 || this.place[1] == 1 || this.place[1] == 4) {
				CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][0][0]][CharacterEquipment[n][this.place[1]][0][1]][CharacterEquipment[n][this.place[1]][0][2]]++;
				CharacterEquipment[n][this.place[1]][0][0] = 5;
				CharacterEquipment[n][this.place[1]][0][1] = 0;
				CharacterEquipment[n][this.place[1]][0][2] = 0;
			}else {
				equipmentR(place, x);
			}
		}
	}
	private void equipmentE(int place, Boolean x){
		int i;
		int answer;
		int number;
		while(x){
			try{
				Case.pl(" どこに装備しますか？");
				for (i=0; i<CharacterEquipmentNumber[n][this.place[1]].length; i++) {
					Case.pl(Case.number(i)+Items.ItemsName(CharacterEquipment[n][this.place[1]][i][0],CharacterEquipment[n][this.place[1]][i][1],CharacterEquipment[n][this.place[1]][i][2]));
				}
				answer = Case.ScanI();
				if (this.place[1] == 2) {
					CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][answer-1][0]][CharacterEquipment[n][this.place[1]][answer-1][1]][CharacterEquipment[n][this.place[1]][answer-1][2]]++;
					CharacterEquipmentE(answer-1, place);
					CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][answer-1][0]][CharacterEquipment[n][this.place[1]][answer-1][1]][CharacterEquipment[n][this.place[1]][answer-1][2]]--;
					Case.pl(" "+Items.ItemsName(CharacterEquipment[n][this.place[1]][answer-1][0], CharacterEquipment[n][this.place[1]][answer-1][1], CharacterEquipment[n][this.place[1]][answer-1][2])+"を装備した。");
					x = false;
				}else if(this.place[1] == 3) {
					Case.pl(" 何個装備しますか？ 最大"+Items.ItemsEquipment(this.place[1], this.place[2], place)+"個装備できます。");
					number = Case.ScanI();
					if (number <= CharacterItemsNumber[n][this.place[1]][this.place[2]][place] && number <= Items.ItemsEquipment(this.place[1], this.place[2], place)) {
						CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][answer-1][0]][CharacterEquipment[n][this.place[1]][answer-1][1]][CharacterEquipment[n][this.place[1]][answer-1][2]] += CharacterEquipmentNumber[n][this.place[1]][answer-1];
						CharacterEquipmentE(answer-1, place);
						CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][answer-1][0]][CharacterEquipment[n][this.place[1]][answer-1][1]][CharacterEquipment[n][this.place[1]][answer-1][2]] = number;
						CharacterItemsNumber[n][this.place[1]][this.place[2]][place] -= number;
						Case.pl(" "+Items.ItemsName(CharacterEquipment[n][this.place[1]][answer-1][0], CharacterEquipment[n][this.place[1]][answer-1][1], CharacterEquipment[n][this.place[1]][answer-1][2])+"を"+number+"個装備した。");
						x = false;
					}else {
						Case.pl(" 数が足りない、又は装備出来る最大数を超えています。");
					}
				}else {
					Case.pl(Case.correct());
				}
			}catch(java.util.InputMismatchException e){
				Case.pl(Case.correct());
			}
		}
	}
	private void equipmentR(int place, Boolean x){
		int i;
		int answer;
		while(x){
			try{
				for (i=0; i<CharacterEquipmentNumber[n][this.place[1]].length; i++) {
					Case.pl(Case.number(i)+Items.ItemsName(CharacterEquipment[n][this.place[1]][i][0],CharacterEquipment[n][this.place[1]][i][1],CharacterEquipment[n][this.place[1]][i][2]));
				}
				Case.pl(Case.number(i)+Case.Back());
				answer = Case.ScanI();
				if (answer-1 == CharacterEquipment[this.place[1]][this.place[2]].length) {
					x = false;
				}else if (answer > 0 && answer < CharacterEquipment[n][this.place[1]].length) {
					CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][answer-1][0]][CharacterEquipment[n][this.place[1]][answer-1][1]][CharacterEquipment[n][this.place[1]][answer-1][2]] += CharacterEquipmentNumber[n][this.place[1]][answer-1];
					CharacterEquipment[n][this.place[1]][0][0] = 5;
					CharacterEquipment[n][this.place[1]][0][1] = 0;
					CharacterEquipment[n][this.place[1]][0][2] = 0;
					CharacterItemsNumber[n][CharacterEquipment[n][this.place[1]][answer-1][0]][CharacterEquipment[n][this.place[1]][answer-1][1]][CharacterEquipment[n][this.place[1]][answer-1][2]] = 1;
				}else {
					Case.pl(Case.correct());
				}
			}catch(java.util.InputMismatchException e){
				Case.pl(Case.correct());
			}
		}
	}
	private void CharacterEquipmentE(int answer, int place){
		CharacterEquipment[n][this.place[1]][answer][0] = this.place[1];
		CharacterEquipment[n][this.place[1]][answer][1] = this.place[2];
		CharacterEquipment[n][this.place[1]][answer][2] = Shop.CIN(place);
	}
}