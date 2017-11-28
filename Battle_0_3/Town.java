class Town{
	static void town(Boolean x){
		final String[] towns = {"商店街","住宅街","地下迷宮"};
		while(x){
			Case.pl("まち");
			int i;
			for (i=0; i<towns.length; i++) Case.pl(Case.number(i)+towns[i]);
			Case.pl(Case.number(i)+"終わる");
			int answer = Case.scanI();
			if (answer == towns.length+1) x = false;
			else if (answer == 1) Shop.shop(x);
			else if (answer == 2) HealingShops.healingShop(x);
			else if (answer == 3) {};
		}
	}
}