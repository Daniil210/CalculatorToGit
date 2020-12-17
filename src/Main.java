public class Main {

    public static void main(String[] args) {

        try {
            InputCheck object1 = new InputCheck();
            String over = object1.inputCheck();
            System.out.println(over);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}

