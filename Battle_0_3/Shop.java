class Shop{

	//[] {店,売買,種類,場所}
	private static int[] places = {0,0,0,0};

	//[] {操作アイテムの場所}
	private static int[] CIN = {0,0,0,0,0};

	public static void shop(Boolean x){
		int i = 0;
		while(x){
			try{
				Case.pl(" お金"+Character.getMoney());
				int size = shopif(i);
				int answer = Case.scanI();
				if (answer == size+1) {
					if (i == 0) x = false;
					else i--;
				}else if (answer > 0 && answer <= size+1) {
					if (i == 3) {
						places[i] = answer-1;
						buySell(x);
					}else {
						places[i] = answer-1;
						i++;
					}
				}else {
					Case.seyCorrect();
				}
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}
		}
	}
	private static int shoppl(int place){
		int i;
		int[] shopIntArr = {0,0,places[0]};
		String[][][] shopStrArr = 
		{{{"武器屋","防具屋","魔道書屋","道具屋","装飾屋"}}
		,{{"買う","売る"}}
		,{{"片手剣","魔法剣","双剣","刀","槍","大剣","大杖","魔道銃"}
		,{"中量装備","軽量装備","重量装備","魔道装備"}
		,{"攻撃魔法","回復魔法","特殊魔法"}
		,{"攻撃用","回復用","その他"}
		,{"上昇系","軽減系","回復系"}}};
		int shopStrArrLength = shopStrArr[place][shopIntArr[place]].length;
		for (i=0; i<shopStrArrLength; i++) Case.pl(Case.number(i)+shopStrArr[place][shopIntArr[place]][i]);
		Case.pl(Case.number(i)+Case.back());
		return shopStrArrLength;
	}
	private static int shopif(int i){
		int size;
		if (i == 3) size = itemsNameSize();
		else size = shoppl(i);
		return size;
	}
	private static void buySell(Boolean x){
		String[][] BS = {{"を購入しますか？","を売却しますか？"},{" いくつ購入しますか？"," いくつ売却しますか？"},{" 所持金が足りない。"," 所持数が足りない。"}};
		Case.pl(" "+Items.itemsName(places[0], places[2], CIN[places[3]])+BS[0][places[1]]);
		int answer = Case.YN(x);
		if (answer == 1) {
			int number = 0;
			try{
				Case.pl(BS[1][places[1]]);
				number = Case.scanI();
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}
			//取引価格
			int transactionPrice = Items.itemsMoney(places[0], places[2], places[3])*number;
			
			//[places[0]][アイテム,所持金] アイテム増減 所持金増減
			int[][] buySellInt = {{+number, -number},{-transactionPrice, +transactionPrice}};

			/*
				if () 
				else if(買
					&& 販売価格 以上の所持金を所持
					|| 売
					&& 買取個数 以上の数を所持){
						所持数 増減
						所持金 増減
					}
				else {}
			*/	
			if (number == 0) Case.pl(" 戻ります");
			else if (places[1] == 0 
				&& transactionPrice <= Character.getMoney()
				|| places[1] == 1 
				&& number <= Character.getCharacterItemsNumber(places[0], places[2], CIN[places[3]])) {
				Character.setCharacterItemsNumber(places[0], places[2], CIN[places[3]], buySellInt[0][places[1]]);
				Character.setMoney(buySellInt[1][places[1]]);
			}else {
				Case.pl(BS[2][places[1]]);
			}
			/*else if (places[1] == 0 
				&& transactionPrice <= Character.getMoney()*number) {
				Character.setCharacterItemsNumber(places[0], places[2], CIN[places[3]], +number);
				Character.setMoney(-transactionPrice);
			}else if (places[1] == 1 
				&& number <= Character.getCharacterItemsNumber(places[0], places[2], CIN[places[3]])) {
				Character.setCharacterItemsNumber(places[0], places[2], CIN[places[3]], -number);
				Character.setMoney(+transactionPrice);
			}else {
				Case.pl(BS[2][places[1]]);
			}*/
		}
	}
	private static int itemsNameSize(){
		/*for (int i=0; i<Items.itemsName()[store][type].length; i++) {
			if (BS == 0
				&& Items.itemsFault(store, type, i) 
				|| BS == 1  
				&& Character.getCharacterItemsNumber(store, type, i) > 0) {
				Case.p(Case.number(t)+Items.itemsName()[store][type][i]);
				if (BS == 0) {
					Case.p(" $"+Items.itemsMoney()[store][type][i]);
				}
				Case.pl(" ("+Character.getCharacterItemsNumber(store, type, i)+")");
				CIN[t] = i;
				t++;
			}
		}*/
		Boolean showall = true;
		if (places[1] == 1) showall = false;
		Boolean money = true;
		if (places[1] == 1) money = false;
		Boolean possession = true;
		int[][] poCIN = Items.seyItemsName(places[0], places[2], showall, money, possession);
		CIN = poCIN[0];
		return poCIN[1][0];
	}
}