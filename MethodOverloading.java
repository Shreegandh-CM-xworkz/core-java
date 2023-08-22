class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int TotalofThree = add(1, 54, 064);
        int TotalofTwo = add(65, 77);
        System.out.println(TotalofThree);
        System.out.println(TotalofTwo);

    }
}