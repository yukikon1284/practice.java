class Shop{
	private int[] place = {0,0,0};
	// 店 種類 場所
	private static int[][][] ShopMoney = 
		//武器
		{{{1,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//防具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//魔法
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//道具
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}
		//装飾品
		,{{0,0,0,0,0}
		,{0,0,0,0,0}
		,{0,0,0,0,0}}};
	private static int[] ShopFault = {0,0,0,0,0};
	private static int[] CIN = {0,0,0,0,0};
	public void shop(Boolean x){
		int i = 0;
		int size;
		int answer = 0;
		while(x){
			try{
				size = shopif(i);
				answer = Case.ScanI();
				if (answer == size+1) {
					if (i == 0) {
						x = false;
					}else {
						i--;
						place[i] = 0;
					}
				}else if (answer <= size && answer > 0) {
					if (i == 3) {
						BuySell(answer-1);
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
		int[] placeif = {this.place[2],this.place[2],this.place[0]};
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
		Case.pl(Case.number(i)+Case.Back());
		return shop[place][placeif[place]].length;
	}
	private int shopif(int i){
		int size;
		if (i == 3) {
			if (this.place[1] == 0) {
				size = ItemsName0(this.place[0], this.place[2]);
			}else {
				size = ItemsName1(this.place[0], this.place[2], 0);
			}
		}else {
			size = shoppl(i);
		}
		return size;
	}
	private void BuySell(int answer){
		int YNanswer;
		int CountNumber;
		String[] BY = {"を購入しますか？","を売却しますか？"};
		String[] BYc = {" いくつ購入しますか？"," いくつ売却しますか？"};
		String[] BYe = {" お金が足りない"," 数が足りない"};
			Case.pl(" "+Items.ItemsName(this.place[0], this.place[2],this.CIN[answer])+BY[this.place[1]]);
		YNanswer = Case.YN(Battle.x);
		if (YNanswer == 1) {
			Case.pl(BYc[this.place[1]]);
			CountNumber = Case.ScanI();
			if (CountNumber == 0) {
				Case.pl(" 戻ります");
			}else if (this.place[1] == 0 && ShopMoney[this.place[0]][this.place[2]][answer]*CountNumber <= Character.GetMoney()*CountNumber) {
				Character.SetCharacterItemsNumber(this.place[0], this.place[1], this.place[2], this.CIN[answer], CountNumber);
			}else if (this.place[1] == 1 && CountNumber <= Character.GetCharacterItemsNumber(this.place[0], this.place[2], this.CIN[answer])) {
				Character.SetCharacterItemsNumber(this.place[0], this.place[1], this.place[2], this.CIN[answer], CountNumber);
			}else {
				Case.pl(BYe[this.place[1]]);
			}
		}
	}
	private static int ItemsName0(int store, int type){
		int i;
		int t = 0;
		for (i=0; i<Items.ItemsNamel(store, type); i++) {
			if (store == 0 && ShopFault[i] != 1 || store != 0) {
				Case.pl(Case.number(i)+Items.ItemsName(store, type, i)+" $"+ShopMoney[store][type][i]+" ("+Character.GetCharacterItemsNumber(store, type, i)+")");
				CIN[t] = i;
				t++;
			}
		}
		Case.pl(Case.number(t)+Case.Back());
		return t;
	}
	public static int ItemsName1(int store, int type, int s){
		int i;
		int t = 0;
		for (i=0; i<Items.ItemsNamel(store, type); i++) {
			if (Character.GetCharacterItemsNumber(store, type, i) >= 1) {
				Case.p(Case.number(t)+Items.ItemsName(store, type, i));
				if (s == 0) {
					Case.p(" $"+ShopMoney[store][type][i]);
				}
				Case.pl(" ("+Character.GetCharacterItemsNumber(store, type, i)+")");
				CIN[t] = i;
				t++;
			}
		}
		if (t == 0) {
			Case.pl(" 持ち物がない");
		}
		Case.pl(Case.number(t)+Case.Back());
		return t;
	}
	public static int CIN(int i){
		return CIN[i];
	}
}