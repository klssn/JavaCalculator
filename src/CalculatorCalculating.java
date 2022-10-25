public class CalculatorCalculating {
    public static int calc3 (int num1, int num2, int num3, char operation, char operation2){
        int res;
        int result;
        if ((operation2 == '*' || operation2 == '/')&(operation == '+' || operation == '-')){
            res = calc2(num2, num3, operation2);
            result = (calc2(num1,res,operation));
            return result;
        }else{
            res = calc2(num1, num2, operation);
            result = (calc2(res, num3, operation2));
            return result;
        }
    }
    public static int calc2 (int num1, int num2, char operation){
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
}
