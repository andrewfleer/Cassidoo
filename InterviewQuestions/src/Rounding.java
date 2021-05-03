public class Rounding {

    public static void main(String[] args) {
        System.out.println("Test Case 1.7 => " + roundClosestToZero(1.7));
        System.out.println("Test Case -2.1 => " + roundClosestToZero(-2.1));
        System.out.println("Test Case 500.4 => " + roundClosestToZero(500.4));
        System.out.println("Test Case -369.5 => " + roundClosestToZero(-369.5));
        System.out.println("Test Case 150 => " + roundClosestToZero(150));
        System.out.println("Test Case -350 => " + roundClosestToZero(-350));

    }

    private static int roundClosestToZero(double v) {
        return v > 0 ? (int) Math.floor(v) : (int) Math.ceil(v);
    }
}
