class HealingShops{
	private static int[] places = {0,0};
	static void healingShop(Boolean x){
		int i = 0;
		while(x){
			try{
				Case.pl(i+"");
				Case.pl(" "+Character.getMoney());
				int size = healingShoppl(i);
				int answer = Case.scanI();
				if (answer == size+1) {
					if (i == 0) x = false;
					else i--;
				}else if (answer > 0 && answer < size+1) {
					if (i == 1) {
						places[i] = answer-1;
						healingShopIA(x);
					}else {
						places[i] = answer-1;
						i++;
						System.out.println("aaaaaaaaaaaaa");
					}
				}else Case.seyCorrect();
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}
		}
	}
	private static int healingShoppl(int place){
		int i;
		int[] healingShopIntArr = {0,places[0]};
		String[][][] healingShop = 
		{{{"宿屋","教会"}}
		,{{"食事","風呂","睡眠"}
		,{"体力","魔力","レベル"}}};
		int healingShopLength = healingShop[place][healingShopIntArr[place]].length;
		for (i=0; i<healingShopLength; i++) Case.pl(Case.number(i)+healingShop[place][healingShopIntArr[place]][i]);
		Case.pl(Case.number(i)+Case.back());
		return healingShopLength;
	}
	private static void healingShopIA(Boolean x){
		String[][] healingShopIAStrArr = 
		{{" 食事を取りますか？"," 風呂に入りますか？"," 睡眠をとりますか？"}
		,{" 体力"," 魔力"," レベル"}};
		Case.pl(healingShopIAStrArr[places[0]][places[1]]);
		int answer = Case.YN(x);
		if (answer == 1) {
			final int[] abilityMaxIntArr = Character.getAbilityMax();
			final float[][] ratio = {{0.5f,0.5f},{1.0f,1.0f}};
			if (places[1] != 2) {
				float recoveryAmount = abilityMaxIntArr[places[1]]*ratio[places[0]][places[1]];
				Character.setAbilityOperation(places[1], (int)recoveryAmount);
			}else if (places[1] == 2 && places[0] == 0) Character.setAbilityOperation();
			else levelUp(x);
		}
	}
	private static void levelUp(Boolean x){
		int number = 0;
		try{
			Case.pl(" MyLevel "+Character.getLevel());
			Case.pl(" 何レベル上げますか？");
			number = Case.scanI();
		}catch(java.util.InputMismatchException e){
			Case.seyCorrect();
		}
		int[] consumptionMEIntArr = consumptionME(number);
		if (number == 0) Case.pl("戻ります。");
		else if (consumptionMEIntArr[0] > Character.getMoney()) Case.pl(" お金が不足している。");
		else if (consumptionMEIntArr[1] > Character.getExperience()) Case.pl(" 経験値が不足している。");
		else {
			Character.setMoney(-consumptionMEIntArr[0]);
			Character.setExperience(-consumptionMEIntArr[1]);
			Character.setLevel(number);
			levelif(x, number*2);
		}
	}
	private static int[] consumptionME(int number){
		final int[] moneyExperience = {300,200};
		int levelInt = Character.getLevel();
		int[] consumptionME = new int[2];
		for (int i=0; i<number; i++) {
			consumptionME[0] += levelInt*moneyExperience[0];
			consumptionME[1] += levelInt*moneyExperience[1];
			levelInt++;
		}
		return consumptionME;
	}
	static void levelif(Boolean x, int number){
		int[] abilityIntArr = Character.getAbility();
		for (int i=0; i<abilityIntArr.length; i++) {
			Case.pl(" "+Character.getAbilityName(i)+" "+abilityIntArr[i]);
		}
		int[] addAbility = new int[abilityIntArr.length];
		int i = 0;
		final int addNumber = number;
		while(x){
			try{
				Case.pl(Character.getAbilityName(i)+" 残り割当数"+number);
				addAbility[i] = Case.scanI();
			}catch(java.util.InputMismatchException e){
				Case.seyCorrect();
			}catch(java.lang.ArrayIndexOutOfBoundsException e){
				Case.seyCorrect();
			}
			if (addAbility[i] <= number) {
				number -= addAbility[i];
				i++;
			}

			if (number == 0 && Case.YN(x) == 1) x = false;
			else if (number == 0 || i == 7) {
				number = addNumber;
				addAbility = Case.setIntArr(addAbility.length, 0);
				Case.pl(" 全て割当してください。");
				i = 0;
			}
		}
		Character.setAbility(addAbility);
		Character.setAbilityOperation();
	}
}