import java.util.Scanner;

public class InputCheck {

    static Scanner scanner = new Scanner(System.in);

    public String inputCheck(){
        int num1 = 0;
        int num2 = 0;

        String[] arabic = {"1","2","3","4","5","6","7","8","9","10"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String text = scanner.nextLine();
        String[] blocks = text.split(" ");
        String operation = " ";
        operation = blocks[1];

        for (int i = 0; i < 10; i++) {
            if (blocks[0].equals(arabic[i])){
                num1=i+1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (blocks[2].equals(arabic[i])){
                num2=i+1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (roman[i].equals(blocks[0])){
                num1=i+1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (roman[i].equals(blocks[2])){
                num2=i+1;
            }
        }
        Calc object1 = new Calc();
        int overs = object1.calc(num1, num2, operation);
        String overs2 = "";


        for (int i = 0; i < 10; i++) {
            if (roman[i].equals(blocks[0])){
                for (int p = 0; p < 10; p++) {
                    if (roman[p].equals(blocks[2])) {
                        OverCheck object2 = new OverCheck();
                        overs2 = object2.overCheck(overs);
                    }
                }
            }
            if(arabic[i].equals(blocks[0])){
                Integer overs1 = new Integer(overs);
                overs2 = overs1.toString();
            }
        }
        return overs2;
    }
}
