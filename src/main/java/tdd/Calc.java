package tdd;

public class Calc {

    public int sum(String expression) {
        int result = 0;
        try {
            long commaCount = expression.codePoints().filter(ch -> ch == ',' || ch == '\n').count();
            String[] split = expression.split("[\n,]+");
            if (split.length != commaCount + 1) {
                return -1;
            }
            if (split.length == 1) {
                return split[0].trim().equals("") ? result : Integer.parseInt(split[0]);
            }
            for (String s : split) {
                result += Integer.parseInt(s);
            }

        } catch (Exception e) {
            result = -1;
        }
        return result;
    }
}
