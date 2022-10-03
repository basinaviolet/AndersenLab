public class Main {
    public static void main(String[] args) {
        // correct arrays
        String[][] array11 = {{"1","1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"}};
        String[][] array12 = {{"1","1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"0","-4","-20","100000"}};
        // incorrect lengths of the arrays
        String[][] array21 = {{"1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"}};
        String[][] array22 = {{"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"}};
        String[][] array23 = {{"1","1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"}, {"5","5","5","5"}};
        String[][] array24 = {{"1","1","1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"}};
        // incorrect items of the arrays
        String[][] array31 = {{"1","1","1","String"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"}};
        String[][] array32 = {{"1","1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","-"}};
        // incorrect length and items of the arrays
        String[][] array41 = {{"1","1","1","String"}, {"2","2","2","2"}, {"3","-","3","3"}};

        MethodsForException check = new MethodsForException();
        System.out.println("Check correct cases:");
        check.checkAndSum(array11);
        check.checkAndSum(array12);
        System.out.println("Check incorrect length cases:");
        check.checkAndSum(array21);
        check.checkAndSum(array22);
        check.checkAndSum(array23);
        check.checkAndSum(array24);
        System.out.println("Check incorrect items cases:");
        check.checkAndSum(array31);
        check.checkAndSum(array32);
        System.out.println("Check incorrect both items & length case:");
        check.checkAndSum(array41);
    }
}
