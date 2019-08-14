public class Calculator {

    public int getResult(int number1, char operation, int number2){
        int result;
        switch (operation){
            case '+': result = number1 + number2; break;
            case '-': result = number1 - number2; break;
            case '*': result = number1 * number2; break;
            case '/': result = number1 / number2; break;
            default:
                System.out.println("Операция не распознана. Попробуйте снова.");
                result = getResult(number1, CalculatorView.getOperation(), number2);
        }
        return result;
    }
}
