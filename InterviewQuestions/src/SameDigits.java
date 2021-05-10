import java.util.HashSet;

public class SameDigits {

    public static void main(String[] args) {
        System.out.println("Test case 1 => " + sameDigits(1)); // true
        System.out.println("Test case 10 => " + sameDigits(10)); // true
        System.out.println("Test case 251894 => " + sameDigits(251894)); // true
        System.out.println("Test case 251895 => " + sameDigits(251895)); // false

    }

    private static boolean sameDigits(long i) {

        // build a hashset of unique digits
        HashSet<Character> originalSet = createHashSet(i);

        // build a hashset of cubed digits
        long iCubed = i * i * i;
        HashSet<Character> newSet = createHashSet(iCubed);

        // If the sets aren't the same size, they obviously don't have the same digits
        if (originalSet.size() != newSet.size()) {
            return false;
        }

        return newSet.containsAll(originalSet);
    }

    private static HashSet<Character> createHashSet(long value) {
        HashSet<Character> returnSet = new HashSet<Character>();
        for (char c : Long.toString(value).toCharArray()) {
            returnSet.add(c);
        }

        return returnSet;
    }

}
