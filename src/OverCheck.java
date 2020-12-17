public class OverCheck {

    public String overCheck(int per4){

        String[] roman1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] roman2 = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String num11 = "";
        String num12 = "";

        if(per4>10 && per4<100){
            int per5 = per4 / 10;
            for (int i = 0; i <= 10; i++) {
                if (i + 1 == per5){
                    num11 = roman2[i];
                }
            }
            int per6 = per4 % 10;
            for (int i = 0; i < 10; i++) {
                if (i + 1 == per6){
                    num12 = roman1[i];
                }
            }
        } else if(per4 <= 10 && per4 > 0){
            for(int i = 0; i < 10; i++){
                if(i + 1 == per4){
                    num11 = roman1[i];
                }
            }
        } else if(per4 == 100){
            num11 = roman2[9];
        } else if(per4 < 0){
            for (int i = 1; i < 10; i++)
                if (-i == per4) {
                    num11 = "-" + roman1[i-1];
                }
        } else if (per4 == 0){
            System.out.println("Ответ равен 0, в римских цифрах нет аналога цифры 0");
        } else{
            System.out.println(" итоговое число больше 100 или меньше -9!");
        }
        return num11 + num12;
    }
}
