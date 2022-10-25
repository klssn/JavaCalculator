public class CalculatorException {
    public static void matching(String s) throws Exception {
        String regex1 = "^([1-9]|10)\\s[+*/-]\\s([1-9]|10)$";
        String regex2 = "^([1-9]|10)\\s[+*/-]\\s([1-9]|10)\\s[+*/-]\\s([1-9]|10)$";
        if (((s.matches(regex1)) || (s.matches(regex2)))) {
        } else {
            throw new Exception();
        }
    }
}