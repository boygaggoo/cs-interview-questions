package codingbat;

import java.util.Map;

/**
 * http://codingbat.com/prob/p115011
 */
public final class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map == null) {
            return null;
        }

        if (map.containsKey("a")
            && map.containsKey("b")
            && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }
}
