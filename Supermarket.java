class Supermarket {

	static String Chocolate[] = { "cadbury", "dairymilk", "milkeybar", "snikkers", "neslay", "mintos", "5star",
			"galaxy", "centerfresh", "parle", "kissme", "mangobyte", "laktoking", "campko", "kises" };

	static String Vegitabal[] = { "carret", "petato", "tomato", "onion", "cabbage", "coliflower", "betroot",
			"ladyFinger", "garlic", "brinjol", "capsicam", "chilli", "haagalakaye", "cavalikai", "hireykai" };

	static String SoftDrinks[] = { "cocacola", "pepsi", "string", "thumpsup", "hell", "monster", "limca", "tropicana",
			"slice", "maagga", "primr", "bindu", "fanta", "mirinda" };

	static String snacks[] = { "layz", "bingo", "kurkurai", "tooyum", "saltedpenuts", "kattamitta", "alloBhujiya",
			"ratlamsew", "doritos", "oreo", "cheetos", "pringals", "papad", "popcorn", "bananaChips", "tortillaChips" };

	static String soaps[] = { "dove", "pears", "lifebouy", "mysoreSandal", "cintol", "dettol", "santoor", "hamam",
			"medimex", "himalaya", "liril", "jonson", "patanjali", "nivya", "lux", "venus", "fiama", "vivel" };

	static String Biscuits[] = { "parle-G", "hide&seek", "UNIBIC", "sunfeast", "milano", "keackjack", "monaco",
			"goodday", "oreo", "marilite", "tiger", "marieGold", "5050", "chaskamaska", "darkfantaci" };

	static String purfume[] = { "fogg", "denver", "parkavinue", "KS", "villan", "skinn", "beelavita", "Engage",
			"yadley", "beardo", "envy", "he", "axe", "wildstone", "isak" };

	static String Masalas[] = { "chickenSmasala", "sabjiMasala", "cholaymasala", "garamMasala", "chatMasala",
			"pannermasaa", "eggmasala", "muttanMasala", "biryanimasala", "teamasala", "chudaMasala", "chakalimasala",
			"chanaMasala", "kichankingMasala" };

	static String Dalls[] = { "chanadal", "moongdal", "udaddal", "toordal", "moosurdal", "motedal", "moong", "mote",
			"loba", "chana", "kabulichana", "akkamasur", "toor", "avarikal", "rajmaa", "udad" };

	static String Dairyitem[] = { "Milk", "curd", "chees", "ghee", "butter", "buttermilk", "lassi", "shreekhand",
			"amarkhand", "milkshake", "chocolatemilkshake", "peada", "kunda", "burfi", "milkcake" };

	public static void main(String args[]) {
		System.out.println("main started");
		getChoclate();
		getVegitabal();
		getSoftDrins();
		getsnacks();
		getsoaps();
		getBiscuits();
		getpurfume();
		getMasalas();
		getDalls();
		getDairyitem();

		System.out.println("main ended");
	}

	public static void getChoclate() {

		System.out.println("the collection of chockleats are");
		System.out.println(Chocolate.length);
		for (int cho = 0; cho < Chocolate.length; cho++) {
			System.out.println(Chocolate[cho]);

		}

		System.out.println("------------------------------------------");

		for (int cho = Chocolate.length - 1; cho >= 0; cho--) {
			System.out.println(Chocolate[cho]);
		}
	}

	public static void getVegitabal() {

		System.out.println("the collection of vegitables are");
		System.out.println(Vegitabal.length);

		for (int veg = 0; veg < Vegitabal.length; veg++) {
			System.out.println(Vegitabal[veg]);
		}
		System.out.println("------------------------------------------");

		for (int veg = Vegitabal.length - 1; veg >= 0; veg--) {
			System.out.println(Vegitabal[veg]);
		}

	}

	public static void getSoftDrins() {

		System.out.println("the collection of SoftDrinks  are");
		System.out.println(SoftDrinks.length);

		for (int soft = 0; soft < SoftDrinks.length; soft++) {

			System.out.println(SoftDrinks[soft]);
		}

		System.out.println("--------------------------------------------------------------");

		for (int soft = SoftDrinks.length - 1; soft >= 0; soft--) {
			System.out.println(SoftDrinks[soft]);
		}
	}

	public static void getsnacks() {

		System.out.println("the collection snacks  are");
		System.out.println(snacks.length);

		for (int sn = 0; sn < snacks.length; sn++) {

			System.out.println(snacks[sn]);
		}

		System.out.println("--------------------------------------------------------------");

		for (int sn = snacks.length - 1; sn >= 0; sn--) {
			System.out.println(snacks[sn]);
		}
	}

	public static void getsoaps() {

		System.out.println("the collection of soaps  are");
		System.out.println(soaps.length);
		for (int so = 0; so < soaps.length; so++) {
			System.out.println(soaps[so]);

		}
		System.out.println("------------------------------------------");

		for (int so = soaps.length - 1; so >= 0; so--) {
			System.out.println(soaps[so]);
		}

	}

	public static void getBiscuits() {

		System.out.println("the collection of Biscuits  are");
		System.out.println(Biscuits.length);
		for (int bis = 0; bis < Biscuits.length; bis++) {
			System.out.println(Biscuits[bis]);

		}
		System.out.println("------------------------------------------");

		for (int bis = Biscuits.length - 1; bis >= 0; bis--) {
			System.out.println(Biscuits[bis]);
		}

	}

	public static void getpurfume() {

		System.out.println("the collection of purfume are");
		System.out.println(purfume.length);
		for (int pur = 0; pur < purfume.length; pur++) {
			System.out.println(purfume[pur]);

		}
		System.out.println("------------------------------------------");

		for (int pur = purfume.length - 1; pur >= 0; pur--) {
			System.out.println(purfume[pur]);
		}
	}

	public static void getMasalas() {

		System.out.println("the collection of Masalas are");
		System.out.println(Masalas.length);
		for (int mas = 0; mas < Masalas.length; mas++) {
			System.out.println(Masalas[mas]);

		}
		System.out.println("------------------------------------------");

		for (int mas = Masalas.length - 1; mas >= 0; mas--) {
			System.out.println(Masalas[mas]);
		}
	}

	public static void getDalls() {
		System.out.println("the collection of Dalls are");
		System.out.println(Dalls.length);
		for (int da = 0; da < Dalls.length; da++) {
			System.out.println(Dalls[da]);

		}
		System.out.println("------------------------------------------");

		for (int da = Dalls.length - 1; da >= 0; da--) {
			System.out.println(Dalls[da]);
		}
	}

	public static void getDairyitem() {

		System.out.println("the collection of Dairyitem are");
		System.out.println(Dairyitem.length);
		for (int milk = 0; milk < Dairyitem.length; milk++) {
			System.out.println(Masalas[milk]);

		}
		System.out.println("------------------------------------------");

		for (int milk = Dairyitem.length - 1; milk >= 0; milk--) {
			System.out.println(Dairyitem[milk]);
		}
	}

}