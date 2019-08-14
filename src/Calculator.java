import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int number1 = getNumber();
        char operation = getOperation();
        int number2 = getNumber();
        int result = getResult(number1, operation, number2);
        System.out.println("Результат: " + result);
    }

    private static int getNumber(){
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуйте снова.");
            scanner.next();
            num = getNumber();
        }
        return num;
    }

    private static char getOperation(){
        System.out.println("Введите операцию(+,-,*,/):");
        char operation;
        if (scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции. Попробуйте снова.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    private static int getResult(int number1, char operation, int number2){
        int result;
        switch (operation){
            case '+': result = number1 + number2; break;
            case '-': result = number1 - number2; break;
            case '*': result = number1 * number2; break;
            case '/': result = number1 / number2; break;
            default:
                System.out.println("Операция не распознана. Попробуйте снова.");
                result = getResult(number1, getOperation(), number2);
        }
        return result;
    }
}
