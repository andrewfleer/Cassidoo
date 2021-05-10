import java.util.HashSet;

public class SameDigits {

    public static void main(String[] args) {
        System.out.println("Test case 1 => " + sameDigits(1)); // true
        System.out.println("Test case 10 => " + sameDigits(10)); // true
        System.out.println("Test case 251894 => " + sameDigits(251894)); // true
        System.out.println("Test case 251985 => " + sameDigits(251895)); // false

    }

    private static boolean sameDigits(long i) {

        // build a hashset of unique digits
        HashSet<Character> originalSet = new HashSet<Character>();
        for (char c : Long.toString(i).toCharArray()) {
            originalSet.add(c);
        }

        // build a hashset of cubed digits
        long iCubed = i * i * i;
        HashSet<Character> newSet = new HashSet<Character>();
        for (char c : Long.toString(iCubed).toCharArray()) {
            newSet.add(c);
        }

        // If the sets aren't the same size, they obviously don't have the same digits
        if (originalSet.size() != newSet.size()) {
            return false;
        }

        return newSet.containsAll(originalSet);
    }

}
