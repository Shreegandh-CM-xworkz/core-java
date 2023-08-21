class FaceBook {
	public static void Login(String Name, String Password) {
		System.out.println("Logged in with userId");
	}

	public static void Login(long PhoneNumber, String Password) {// length of the parameter is same but type is
																	// differtent so this is also a method overloading
		System.out.println("Logged in with PhoneNumber");
	}

	public static void main(String args[]) {
		Login("Shreegandh", "X-workzz");
		Login(8073748951l, "X-workzz");
	}
}
