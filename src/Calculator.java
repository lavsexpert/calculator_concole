import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Введите 1е число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите операцию(+,-,*,/):");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите 2е число:");
        int number2 = scanner.nextInt();
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

    public static int getNumber(){
        System.out.println("Введите число:");
        return scanner.nextInt();
    }

    public static char getOperation(){
        System.out.println("Введите операцию(+,-,*,/):");
        return scanner.next().charAt(0);
    }

    public static void showResult(int number1, char operation, int number2){
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
