class Character{
	private int[] place = {0,0,0,0};
	private static int n;
	private static int[] money = {0,0,0};
	private static int[] CIN = {0,0,0,0,0};

	/*現在装備している装備の場所 店 種類 場所
	キャラ 店 種類 場所*/
	private static int[][][][] characterEquipment = 
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
	private static int[][][] characterEquipmentNumber = 
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
	private static int[][][][] characterItemsNumber = 
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
	public static int getCharacterItemsNumber(int store, int type, int i){
		return characterItemsNumber[n][store][type][i];
	}
	public static void setCharacterItemsNumber(int store, int bs, int type, int i, int answer){
		if (bs == 0) {
			characterItemsNumber[n][store][type][i] += answer;
		}else{
			characterItemsNumber[n][store][type][i] -= answer;
		}
	}
	public int getCharacter(){
		return n;
	}
	public void setCharacter(int C){
		n = C;
	}
	public static int getMoney(){
		return money[n];
	}
	public static void setMoney0(int m){
		money[n] += m;
	}
	public void setMoney1(int m){
		money[n] -= m;
	}
	public void equipment(Boolean x){
		int i = 0;
		int size;
		int answer = 0;
		while(x){
			try{
				size = equipmentif(i);
				answer = Case.scanI();
				if (answer == size+1) {
					if (i == 0) {
						x = false;
					}else {
						i--;
						this.place[i] = 0;
					}
				}else if (answer <= size && answer > 0 || i == 2 && this.place[0] == 2) {
					if (i == 3) {
						this.place[i] = answer-1;
						equipmentEDR(x);
					}else if (i == 2 && this.place[0] == 2) {
						this.place[i] = answer-1;
						equipmentEDR(x);
					}else {
						this.place[i] = answer-1;
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
		int[] equipmentif = {0,0,this.place[1]};
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
		Case.pl(Case.number(i)+Case.back());
		return equipment[place][equipmentif[place]].length;
	}
	private int equipmentif(int i){
		int size;
		String[] EDR = {" どれを装備しますか？"," どれの説明を見ますか？"," どの装備を外しますか？"};
		if (i == 3 || i == 2 && this.place[0] == 2) {
			Case.pl(EDR[this.place[0]]);
			size = itemsName();
		}else {
			size = equipmentpl(i);
		}
		return size;
	}
	private void equipmentEDR(Boolean x){
		int i;
		int answer = 0;
		if (this.place[0] == 0) {
			/*if (this.place[1] == 0 || this.place[1] == 1 || this.place[1] == 4) {
				characterItemsNumber[n][characterEquipment[n][this.place[1]][0][0]][characterEquipment[n][this.place[1]][0][1]][characterEquipment[n][this.place[1]][0][2]]++;
				characterEquipment[n][this.place[1]][0][0] = this.place[1];
				characterEquipment[n][this.place[1]][0][1] = this.place[2];
				characterEquipment[n][this.place[1]][0][2] = CIN[place];
				characterItemsNumber[n][characterEquipment[n][this.place[1]][0][0]][characterEquipment[n][this.place[1]][0][1]][characterEquipment[n][this.place[1]][0][2]]--;
				Case.pl(" "+Items.itemsName()[characterEquipment[n][this.place[1]][0][0]][characterEquipment[n][this.place[1]][0][1]][characterEquipment[n][this.place[1]][0][2]]+"を装備した。");
			}else {
				equipmentE(place, x);
			}*/
			equipmentE(x);
		}else if (this.place[0] == 1) {
			Case.pl(Items.itemsName()[this.place[1]][this.place[2]][this.place[3]]);
			String[] flavorText = Items.itemsFlavorText(this.place[1], this.place[2], this.place[3]);
			for (i=0; i<flavorText.length; i++) {
				Case.pl(flavorText[i]);
			}
		}else if (this.place[0] == 2) {
			/*if (this.place[1] == 0 || this.place[1] == 1 || this.place[1] == 4) {
				characterItemsNumber[n][characterEquipment[n][this.place[1]][0][0]][characterEquipment[n][this.place[1]][0][1]][characterEquipment[n][this.place[1]][0][2]]++;
				characterEquipment[n][this.place[1]][0][0] = 5;
				characterEquipment[n][this.place[1]][0][1] = 0;
				characterEquipment[n][this.place[1]][0][2] = 0;

				characterEquipmentNumber[n][this.place[1]][0] = 1;
			}else {
				equipmentR(x);
			}*/
			equipmentR(x);
		}
	}
	private void equipmentE(Boolean x){
		int i;
		int answer = 0;
		int number = 0;
		while(x){
			int characterEquipmentNumberInt = characterEquipmentNumber[n][this.place[1]].length;

			/*
				if () {
					装備する場所はどこか?
				}
			*/
			if (this.place[1] == 2 
				|| this.place[1] == 3) {
				
				try{
					Case.pl(" どこに装備しますか？");

					//装備する場所表示。 文字列
					for (i=0; i<characterEquipmentNumberInt; i++) {
						String equipmentStr = Case.number(i)+Items.itemsName()[characterEquipment[n][this.place[1]][i][0]][characterEquipment[n][this.place[1]][i][1]][characterEquipment[n][this.place[1]][i][2]];
						if (this.place[1] == 2 || characterEquipment[n][this.place[1]][i][0] == 5) {
							Case.pl(equipmentStr);
						}else {
							Case.pl(equipmentStr+" ("+characterEquipmentNumber[n][this.place[1]][i]+")");
						}
					}
					Case.pl(Case.number(i)+Case.back());
					answer = Case.scanI();
				}catch(java.util.InputMismatchException e){
					Case.pl(Case.correct());
				}
			}

			/*
				if () 
				else if () {
					何個装備するか？
				}
			*/
			if (answer == characterEquipmentNumberInt+1) break;
			else if (this.place[1] == 3 && answer != characterEquipmentNumberInt) {
				try{
					Case.pl(" 何個装備しますか？ 最大"+Items.itemsEquipment()[this.place[1]][this.place[2]][this.place[3]]+"個装備できます。");
					number = Case.scanI();
				}catch(java.util.InputMismatchException e){
					Case.pl(Case.correct());
				}
			}

			/*
				if (

				||
				&& 持ち物がnumber以上のとき
				&& 装備できる数がnumber以上のとき
				&& ) {}
			*/
			if (this.place[1] != 2 
				&& this.place[1] != 3
				|| this.place[1] == 2 
				&& answer > 0 
				&& answer <= characterEquipmentNumberInt
				|| this.place[1] == 3
				&& answer > 0
				&& answer <= characterEquipmentNumberInt
				&& number <= characterItemsNumber[n][this.place[1]][this.place[2]][CIN[this.place[3]]] 
				&& number <= Items.itemsEquipment()[this.place[1]][this.place[2]][this.place[3]] 
				&& number > 0) {

				//[0装備する場所 1装備する個数][this.place[1]] 整数 二次元配列
				int[][] itemsEquipmentIntArr = {{0,0,answer-1,answer-1,0},{1,1,1,number,1}};

				//現在装備しているものを増やす。
				characterItemsNumber[n][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][0]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][1]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][2]] += characterEquipmentNumber[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]];

				//装備を変更する。
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][0] = this.place[1];
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][1] = this.place[2];
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][2] = CIN[this.place[3]];

				//現在装備している個数へ変更。
				characterEquipmentNumber[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]] = itemsEquipmentIntArr[1][this.place[1]];

				//現在装備しているものを減らす。
				characterItemsNumber[n][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][0]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][1]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][2]] -= itemsEquipmentIntArr[1][this.place[1]];

				//現在装備しているもの。 文字列
				String itemsEquipmentStr = " "+Items.itemsName()[characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][0]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][1]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[0][this.place[1]]][2]]+"を装備した。";

				//現在装備しているもの。 文字列 一次元配列
				String[] itemsEquipmentStrArr = {itemsEquipmentStr,itemsEquipmentStr," "+itemsEquipmentStr+"を装備した。"," "+itemsEquipmentStr+"を"+number+"個装備した。",itemsEquipmentStr};
				Case.pl(itemsEquipmentStrArr[this.place[1]]);
				if (this.place[1] != 2 && this.place[1] != 3) {
					x = false;
				}
			}else if (this.place[1] == 3) {
				Case.pl(" 数が足りない、又は装備出来る最大数を超えています。");
			}
		}
	}
	/*private void equipmentE(int place, Boolean x){
		int i;
		int answer;
		int number = 0;
		while(x){
			try{
				Case.pl(" どこに装備しますか？");
				for (i=0; i<characterEquipmentNumber[n][this.place[1]].length; i++) {
					Case.pl(Case.number(i)+Items.itemsName()[characterEquipment[n][this.place[1]][i][0]][characterEquipment[n][this.place[1]][i][1]][characterEquipment[n][this.place[1]][i][2]]);
				}
				Case.pl(Case.number(i)+Case.back());
				answer = Case.scanI();
				if (answer == characterEquipmentNumber[n][this.place[1]].length) {
					x = false;
				}else if (this.place[1] == 2 
					|| this.place[1] == 3 
					&& number <= characterItemsNumber[n][this.place[1]][this.place[2]][CIN[place]] 
					&& number <= Items.itemsEquipment()[this.place[1]][this.place[2]][place] 
					&& number != 0) {
					//何個装備するか？
					if (this.place[1] == 3) {
						Case.pl(" 何個装備しますか？ 最大"+Items.itemsEquipment()[this.place[1]][this.place[2]][place]+"個装備できます。");
						number = Case.scanI();
					}
					//現在装備しているものを増やす。
					characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]] += characterEquipmentNumber[n][this.place[1]][answer-1];
					//装備を変更する。
					characterEquipment[n][this.place[1]][answer-1][0] = this.place[1];
					characterEquipment[n][this.place[1]][answer-1][1] = this.place[2];
					characterEquipment[n][this.place[1]][answer-1][2] = CIN[place];
					//装備する個数
					int[] itemsEquipmentInt = {0,0,1,number,0};
					//現在装備しているものを減らす。
					characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]] -= itemsEquipmentInt[this.place[1]];
					//現在装備しているものを表示。
					String[] itemsEquipmentStr = {"",""," "+Items.itemsName()[characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]]+"を装備した。"," "+Items.itemsName()[characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]]+"を"+number+"個装備した。",""};
					Case.pl(itemsEquipmentStr[this.place[1]]);
				}else if (this.place[1] == 3) {
					Case.pl(" 数が足りない、又は装備出来る最大数を超えています。");
				}else {
					Case.pl(Case.correct());
				}
				/*
				if (this.place[1] == 2) {
					//現在装備しているもの。
					characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]]++;
					//装備を変更する。
					characterEquipmentE(answer-1, place);
					//現在装備しているもの。
					characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]]--;
					Case.pl(" "+Items.itemsName()[characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]]+"を装備した。");
					x = false;
				}else if(this.place[1] == 3) {
					Case.pl(" 何個装備しますか？ 最大"+Items.itemsEquipment()[this.place[1]][this.place[2]][place]+"個装備できます。");
					number = Case.scanI();
					if (number <= characterItemsNumber[n][this.place[1]][this.place[2]][CIN[place]] && number <= Items.itemsEquipment()[this.place[1]][this.place[2]][place]) {
						//現在装備しているもの。
						characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]] += characterEquipmentNumber[n][this.place[1]][answer-1];
						//装備を変更する。
						characterEquipmentE(answer-1, place);
						//現在装備しているもの。
						characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]] -= number;
						Case.pl(" "+Items.itemsName()[characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]]+"を"+number+"個装備した。");
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
	}*/
	private void equipmentR(Boolean x){
		int i;
		int answer = 0;
		while(x){
			int characterEquipmentNumberInt = characterEquipmentNumber[n][this.place[1]].length;

			/*
				if () {
					装備を外す場所はどこか?
				}
			*/
			if (this.place[1] == 2 
				|| this.place[1] == 3) {
				try{
					Case.pl(" どこに装備を外しますか？");
					for (i=0; i<characterEquipmentNumberInt; i++) {
						
						//装備を外す場所表示。 文字列
						String equipmentStr = Case.number(i)+Items.itemsName()[characterEquipment[n][this.place[1]][i][0]][characterEquipment[n][this.place[1]][i][1]][characterEquipment[n][this.place[1]][i][2]];
						if (this.place[1] == 2 || characterEquipment[n][this.place[1]][i][0] == 5) {
							Case.pl(equipmentStr);
						}else {
							Case.pl(equipmentStr+" ("+characterEquipmentNumber[n][this.place[1]][i]+")");
						}
					}
					Case.pl(Case.number(i)+Case.back());
					answer = Case.scanI();
				}catch(java.util.InputMismatchException e){
					Case.pl(Case.correct());
				}
			}

			//[this.place[1]] 整数 一次元配列
			int[] itemsEquipmentIntArr = {0,0,answer-1,answer-1,0};

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
			if (answer == characterEquipmentNumberInt+1) break;
			else if (characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0] == 5) {
				Case.pl("装備していない。");
				if (this.place[1] != 2 && this.place[1] != 3) x = false;
			}
			else if (this.place[1] != 2 
				&& this.place[1] != 3 
				|| this.place[1] == 2 
				&& answer > 0 
				&& answer <= characterEquipmentNumberInt
				|| this.place[1] == 3
				&& answer > 0
				&& answer <= characterEquipmentNumberInt) {

				//現在装備しているものを増やす。
				characterItemsNumber[n][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][1]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][2]] += characterEquipmentNumber[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]];

				//装備を変更する。
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0] = 5;
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][1] = 0;
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][2] = 0;

				//現在装備している1へ変更。
				characterEquipmentNumber[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]] = 1;

				//現在装備しているもの。 文字列
				String itemsEquipmentStr = " "+Items.itemsName()[characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][1]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][2]]+"を外した。";
				Case.pl(itemsEquipmentStr);
				if (this.place[1] != 2 && this.place[1] != 3) x = false;
			}
		}
	}
	/*private void equipmentR(Boolean x){
		int i;
		int answer = 0;
		while(x){
			int characterEquipmentNumberInt = characterEquipmentNumber[n][this.place[1]].length;

			
				// if () {
				// 	装備を外す場所はどこか?
				// }
			
			if (this.place[1] == 2 
				|| this.place[1] == 3) {
				try{
					Case.pl(" どこに装備を外しますか？");
					for (i=0; i<characterEquipmentNumberInt; i++) {
						
						//装備を外す場所表示。 文字列
						String equipmentStr = Case.number(i)+Items.itemsName()[characterEquipment[n][this.place[1]][i][0]][characterEquipment[n][this.place[1]][i][1]][characterEquipment[n][this.place[1]][i][2]];
						if (this.place[1] == 2 || characterEquipment[n][this.place[1]][i][0] == 5) {
							Case.pl(equipmentStr);
						}else {
							Case.pl(equipmentStr+" ("+characterEquipmentNumber[n][this.place[1]][i]+")");
						}
					}
					Case.pl(Case.number(i)+Case.back());
					answer = Case.scanI();
				}catch(java.util.InputMismatchException e){
					Case.pl(Case.correct());
				}
			}

			//[this.place[1]] 整数 一次元配列
			int[] itemsEquipmentIntArr = {0,0,answer-1,answer-1,0};

			
				// if () 
				// else if (装備している装備が 無し
				// ) {
					
				// }
				// else if (
				// 	&& 
				// 	|| 魔道書
				// 	&& answerが0以上
				// 	&& answerが装備できる最大以下
				// 	|| 道具
				// 	&& answerが0以上
				// 	&& answerが装備できる最大以下) {
				//  	装備を外す
				//  } 
			
			if (answer == characterEquipmentNumberInt+1) break;
			else if (characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0] == 5) {
				Case.pl("装備していない。");
			}
			else if (this.place[1] != 2 
				&& this.place[1] != 3 
				|| this.place[1] == 2 
				&& answer > 0 
				&& answer <= characterEquipmentNumberInt
				|| this.place[1] == 3
				&& answer > 0
				&& answer <= characterEquipmentNumberInt) {

				//現在装備しているものを増やす。
				characterItemsNumber[n][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][1]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][2]] += characterEquipmentNumber[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]];

				//装備を変更する。
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0] = 5;
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][1] = 0;
				characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][2] = 0;

				//現在装備している1へ変更。
				characterEquipmentNumber[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]] = 1;

				//現在装備しているもの。 文字列
				String itemsEquipmentStr = " "+Items.itemsName()[characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][0]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][1]][characterEquipment[n][this.place[1]][itemsEquipmentIntArr[this.place[1]]][2]]+"を外した。";
				Case.pl(itemsEquipmentStr);
				if (this.place[1] != 2 && this.place[1] != 3) x = false;
			}
		}
	}*/
	/*private void equipmentR(int place, Boolean x){
		int i;
		int answer;
		while(x){
			try{
				for (i=0; i<characterEquipmentNumber[n][this.place[1]].length; i++) {
					Case.pl(Case.number(i)+Items.itemsName()[characterEquipment[n][this.place[1]][i][0]][characterEquipment[n][this.place[1]][i][1]][characterEquipment[n][this.place[1]][i][2]]);
				}
				Case.pl(Case.number(i)+Case.back());
				answer = Case.scanI();
				if (answer-1 == characterEquipment[this.place[1]][this.place[2]].length) {
					x = false;
				}else if (answer > 0 && answer < characterEquipment[n][this.place[1]].length) {
					//現在装備しているもの。
					characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]] += characterEquipmentNumber[n][this.place[1]][answer-1];
					//装備を変更する。
					characterEquipment[n][this.place[1]][0][0] = 5;
					characterEquipment[n][this.place[1]][0][1] = 0;
					characterEquipment[n][this.place[1]][0][2] = 0;
					//現在装備しているもの。
					characterItemsNumber[n][characterEquipment[n][this.place[1]][answer-1][0]][characterEquipment[n][this.place[1]][answer-1][1]][characterEquipment[n][this.place[1]][answer-1][2]] = 1;
				}else {
					Case.pl(Case.correct());
				}
			}catch(java.util.InputMismatchException e){
				Case.pl(Case.correct());
			}
		}
	}*/
	private void equipmentER(){

	}
	/*private void characterEquipmentE(int answer, int place){
		characterEquipment[n][this.place[1]][answer][0] = this.place[1];
		characterEquipment[n][this.place[1]][answer][1] = this.place[2];
		characterEquipment[n][this.place[1]][answer][2] = CIN[place];
	}*/
	private int itemsName(){
		int i;
		int t = 0;
		if (this.place[0] != 2) {
			for (i=0; i<Items.itemsName()[this.place[1]][this.place[2]].length; i++) {
				if (getCharacterItemsNumber(this.place[1], this.place[2], i) >= 1) {
					Case.pl(Case.number(t)+Items.itemsName()[this.place[1]][this.place[2]][i]+" ("+Character.getCharacterItemsNumber(this.place[1], this.place[2], i)+")");
					CIN[t] = i;
					t++;
				}
			}
		}else if (this.place[0] == 2) {
			for (i=0; i<characterEquipment[n][this.place[1]].length; i++) {
				Case.pl(Case.number(t)+Items.itemsName()[characterEquipment[n][this.place[1]][i][0]][characterEquipment[n][this.place[1]][i][1]][characterEquipment[n][this.place[1]][i][2]]);
				t++;
			}	
		}
		Case.pl(Case.number(t)+Case.back());
		return t;
	}
}