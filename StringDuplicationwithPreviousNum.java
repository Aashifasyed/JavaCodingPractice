public class StringDuplicationwithPreviousNum {
    public static void main(String[] args) {
        String input = "t6hj7ui";
        System.out.println(expandString(input));
    }
    public static String expandString(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int repeatCount = Character.getNumericValue(ch);
                String lastPart = temp.toString();
                for (int j = 0; j < repeatCount - 1; j++) {
                    result.append(lastPart);
                }
                temp.setLength(0);
            } else {
                result.append(ch);
                temp.append(ch);
            }
        }
        return result.toString();
    }
}
