import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        CalculatorException.matching(input);
        String string = input.replaceAll(" ", "");
        String operators = string.replaceAll("[0-9]","");
        String nums[];
        nums = string.split("[*/+-]");
        String regex1 = "^([1-9]|10)\\s[+*/-]\\s([1-9]|10)$";
        if (input.matches(regex1)) {
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            char op1 = operators.charAt(0);
            System.out.println(CalculatorCalculating.calc2(a,b,op1));
        }else{
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int c = Integer.parseInt(nums[2]);
            char op1 = operators.charAt(0);
            char op2 = operators.charAt(1);
            System.out.println(CalculatorCalculating.calc3(a,b,c,op1,op2));
        }
    }
}