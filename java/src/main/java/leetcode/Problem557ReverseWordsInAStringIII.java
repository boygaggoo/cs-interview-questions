package leetcode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii
 */
public final class Problem557ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        if (s == null) {
            return "";
        }

        final String[] sentence = s.split("\\s+");
        final StringBuilder stringBuilder = new StringBuilder(sentence.length);
        for (String string : sentence) {
            final char[] array = string.toCharArray();

            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                swap(array, i, j);
            }

            stringBuilder.append(new String(array));
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private void swap(char[] array, int left, int right) {
        final char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
