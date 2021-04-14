package tdd;

public class Calc {

    public int sum(String expression) {
        int result = 0;
        try {
            Character character = null;
            String splitVal = "[\n,]+";
            if (expression.startsWith("//") && expression.charAt(3) == '\n') {
                character = expression.charAt(2);
                expression = expression.substring(4);
                splitVal = character.toString();
            }
            Character finalCharacter = character;
            long commaCount = expression.codePoints().filter(ch -> {
                if(finalCharacter != null){
                    return ch == finalCharacter;
                }
                return ch == ',' || ch == '\n' ;}).count();

            String[] split = expression.split(splitVal);
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
