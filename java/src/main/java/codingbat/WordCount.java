package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * http://codingbat.com/prob/p117630
 */
public final class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        final Map<String, Integer> map = new HashMap<>();
        if (strings == null || strings.length == 0) {
            return map;
        }

        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        return map;
    }
}
