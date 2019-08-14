import java.util.Scanner;

public class CalculatorView {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int number1 = getNumber();
        char operation = getOperation();
        int number2 = getNumber();

        Calculator calc = new Calculator();
        try {
            int result = calc.getResult(number1, operation, number2);
            System.out.println("Результат: " + result);
        } catch (Exception e){
            System.out.println("Не удалось посчитать по причине:\n" + e.getMessage());
        }
    }

    public static int getNumber(){
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

    public static char getOperation(){
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
}
