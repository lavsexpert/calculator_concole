public class Calculator {

    public int getResult(int number1, char operation, int number2) throws Exception {
        int result;
        switch (operation){
            case '+': result = number1 + number2; break;
            case '-': result = number1 - number2; break;
            case '*': result = number1 * number2; break;
            case '/':
                if(number2 == 0) {
                    throw new Exception("На ноль делить нельзя!");
                }
                else
                    result = number1 / number2;
                break;
            default:
                throw new Exception("Операция " + operation + " не распознана.");
        }
        return result;
    }
}
