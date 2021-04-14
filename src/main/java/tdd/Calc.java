package tdd;

public class Calc {

    public int sum(String expression) {
        int result = 0;
        try {
            long commaCount = expression.codePoints().filter(ch -> ch == ',').count();
            String[] split = expression.split(",");
            if (split.length == 1) {
                return split[0].trim().equals("") ? result : Integer.parseInt(split[0]);
            } else if (split.length != commaCount + 1) {
                return -1;
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
