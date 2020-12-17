public class Calc {
    public int calc(int num1, int num2, String operation) {
        int res = 0;
        if ((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10)) {

            if (operation.equals("+")) {
                res = num1 + num2;
            } else if (operation.equals("-")) {
                res = num1 - num2;
            } else if (operation.equals("*")) {
                res = num1 * num2;
            } else if (operation.equals("/")) {
                res = num1 / num2;
            } else {
                System.out.println("Вы ввели недопустимый символ!");
            }
        } else {
            System.out.println("Вы ввели недопустимые цифры или символы!");
        }
        return res;
    }
}

