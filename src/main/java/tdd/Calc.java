package tdd;

public class Calc {

    public int sum(String expression) {
        int result  = -1;
        if (expression.codePoints().filter(ch -> ch == ',').count() > 1){
            return result;
        }
        try {
            String[] split = expression.split(",");
            if (split.length == 1) {
                result = split[0].trim().equals("") ? 0 : Integer.parseInt(split[0]);
            }
            if (split.length == 2) {
                result = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            }
        } catch (Exception ignored) {
            //ignore
        }
        return result;
    }
}
