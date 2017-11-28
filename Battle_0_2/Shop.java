class Shop{
	private static int[] place = {0,0,0,0};
	private static int[] CIN = {0,0,0,0,0};
	public void shop(Boolean x){
		int i = 0;
		int size;
		int answer = 0;
		while(x){
			try{
				size = shopif(i);
				answer = Case.scanI();
				if (answer == size+1) {
					if (i == 0) {
						x = false;
					}else {
						i--;
					}
				}else if (answer <= size && answer > 0) {
					if (i == 3) {
						place[i] = answer-1;
						buySell(x);
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
	private int shoppl(int place){
		int i;
		int[] placeif = {0,0,this.place[0]};
		String[][][] shop = 
		{{{"武器屋","防具屋","魔道書屋","道具屋","装飾屋"}}
		,{{"買う","売る"}}
		,{{"片手剣","魔法剣","双剣","刀","槍","大剣","大杖","魔道銃"}
		,{"中量装備","軽量装備","重量装備","魔道装備"}
		,{"攻撃魔法","回復魔法","特殊魔法"}
		,{"攻撃用","回復用","その他"}
		,{"上昇系","軽減系","回復系"}}};
		for (i=0; i<shop[place][placeif[place]].length; i++) {
			Case.pl(Case.number(i)+shop[place][placeif[place]][i]);
		}
		Case.pl(Case.number(i)+Case.back());
		return shop[place][placeif[place]].length;
	}
	private int shopif(int i){
		int size;
		if (i == 3) {
			size = itemsName(this.place[0], this.place[1], this.place[2]);
		}else {
			size = shoppl(i);
		}
		return size;
	}
	private void buySell(Boolean x){
		int answer;
		int countNumber;
		String[][] BS = {{"を購入しますか？","を売却しますか？"},{" いくつ購入しますか？"," いくつ売却しますか？"},{" お金が足りない"," 数が足りない"}};
		Case.pl(" "+Items.itemsName()[this.place[0]][this.place[2]][this.CIN[place[3]]]+BS[0][this.place[1]]);
		answer = Case.YN(x);
		if (answer == 1) {
			Case.pl(BS[1][this.place[1]]);
			countNumber = Case.scanI();
			if (countNumber == 0) {
				Case.pl(" 戻ります");
			}else if (this.place[1] == 0 && Items.itemsMoney()[this.place[0]][this.place[2]][place[3]]*countNumber <= Character.getMoney()*countNumber) {
				Character.setCharacterItemsNumber(this.place[0], this.place[1], this.place[2], this.CIN[place[3]], countNumber);
			}else if (this.place[1] == 1 && countNumber <= Character.getCharacterItemsNumber(this.place[0], this.place[2], this.CIN[place[3]])) {
				Character.setCharacterItemsNumber(this.place[0], this.place[1], this.place[2], this.CIN[place[3]], countNumber);
			}else {
				Case.pl(BS[2][this.place[1]]);
			}
		}
	}
	private static int itemsName(int store, int BS, int type){
		int i;
		int t = 0;
		for (i=0; i<Items.itemsName()[store][type].length; i++) {
			if (Items.itemsFault()[store][type][i] && BS == 0 
				|| 
				BS == 1 && Character.getCharacterItemsNumber(store, type, i) >= 1) {
				Case.p(Case.number(t)+Items.itemsName()[store][type][i]);
				if (BS == 0) {
					Case.p(" $"+Items.itemsMoney()[store][type][i]);
				}
				Case.pl(" ("+Character.getCharacterItemsNumber(store, type, i)+")");
				CIN[t] = i;
				t++;
			}
		}
		if (t == 0 && place[1] == 1) {
			Case.pl(" 持ち物がない");
		}
		Case.pl(Case.number(t)+Case.back());
		return t;
	}
}