public class App {
    public static void main(String[] args) throws Exception {
        Reader BobCanRead = new Reader();
        int randomNum = Methods.randInt(1,10);
        double randomNum2 = Methods.randInt(1,10);
        double additionAnswer = randomNum+randomNum2;
        int score = 0;
        System.out.println("What is " + randomNum + "+" + randomNum2 + "?");
        int num = BobCanRead.getInt("Enter answer:");
        if (num == (int)additionAnswer){
            System.out.println("Correct");
            score ++;
            System.out.println("Score: " +score+"/5");
        }else {
            System.out.println("Wrong!");
            System.out.println("Score: " +score+"/5");
        }
        System.out.println("Answer: "+(int)additionAnswer);

        int randomNum3 = Methods.randInt(1,10);
        int randomNum4 = Methods.randInt(1,10);
        int subtractionAnswer = randomNum3-randomNum4;
        System.out.println("What is " + randomNum3 + "-" + randomNum4 + "?");
        int num2 = BobCanRead.getInt("Enter answer:");
         if (num2 == subtractionAnswer){
            System.out.println("Correct");
            score ++;
            System.out.println("Score: " +score+"/5");
        }else {
            System.out.println("Wrong!");
            System.out.println("Score: " +score+"/5");
        }
        System.out.println("Answer: "+subtractionAnswer);

        int randomNum5 = Methods.randInt(1,10);
        int randomNum6 = Methods.randInt(1,10);
        int multiAnswer = randomNum5*randomNum6;

        System.out.println("What is " + randomNum5 + " times " + randomNum6 + "?");
        int num3 = BobCanRead.getInt("Enter answer:");
         if (num3 == multiAnswer){
            System.out.println("Correct");
            score ++;
            System.out.println("Score: " +score+"/5");
        }else {
            System.out.println("Wrong!");
            System.out.println("Score: " +score+"/5");
        }
        System.out.println("Answer: "+multiAnswer);

        double randomNum7 = Methods.randInt(5,10);
        int randomNum8 = Methods.randInt(1,5);
        double divisAnswer = randomNum7/randomNum8;

        System.out.println("What is " + randomNum7 + " divided by " + randomNum8 + "? (Round to the nearest tenth)");
        double num4 = BobCanRead.getDouble("Enter answer:");
         if (num4 == Methods.roundDouble(1,divisAnswer)){
            System.out.println("Correct");
            score ++;
            System.out.println("Score: " +score+"/5");
        }else {
            System.out.println("Wrong!");
            System.out.println("Score: " +score+"/5");
        }
        System.out.println("Answer: "+divisAnswer);

        int randomNum9 = Methods.randInt(5, 10);
        int randomNum10 = Methods.randInt(1,5);
        int modAnswer = randomNum9%randomNum10;

        System.out.println("What is " + randomNum9 + "%" + randomNum10 + "?");
        double num5 = BobCanRead.getInt("Enter answer:");
         if (num5 == modAnswer){
            System.out.println("Correct");
            score ++;
            System.out.println("Score: " +score+"/5");
        }else {
            System.out.println("Wrong!");
            System.out.println("Score: " +score+"/5");
        }
        System.out.println("Answer: "+modAnswer);
    }
}
