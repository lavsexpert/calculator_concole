import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int number1 = getNumber();
        char operation = getOperation();
        int number2 = getNumber();
        showResult(number1, operation, number2);
    }

    private static int getNumber(){
        System.out.println("Введите число:");
        return scanner.nextInt();
    }

    private static char getOperation(){
        System.out.println("Введите операцию(+,-,*,/):");
        return scanner.next().charAt(0);
    }

    private static void showResult(int number1, char operation, int number2){
        if(operation == '+'){
            System.out.println("Результат: " + (number1 + number2));
        } else if (operation == '-'){
            System.out.println("Результат: " + (number1 - number2));
        } else if (operation == '*'){
            System.out.println("Результат: " + (number1 * number2));
        } else if (operation == '/'){
            System.out.println("Результат: " + (number1 / number2));
        } else {
            System.out.println("Результат неизвестен из-за неизвестной операции: " + operation);
        }
    }

}
