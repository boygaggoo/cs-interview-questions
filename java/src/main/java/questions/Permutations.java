package questions;

import java.util.ArrayList;
import java.util.List;

public final class Permutations {
    public static List<String> getStringPermutations(String prefix, String string) {
        if (string == null) {
            return new ArrayList<>();
        }

        final List<String> finalList = new ArrayList<>();
        final int length = string.length();
        if (length == 0) {
            // empty string
            finalList.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                // add to final list
                finalList.addAll(
                    getStringPermutations(prefix + string.charAt(i),
                        string.substring(i + 1, length) + string.substring(0, i)));
            }
        }

        return finalList;
    }
}
