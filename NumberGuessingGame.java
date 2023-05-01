/* 
  * this program is made by vivek sharma 
   this is the task or my java development intership 
   
  */



// import statement is used to import scanner class which present inside scanner class

import java.util.*;

 class NumberGuessingGame {
    public static void main(String[] args) {
        try (// we take scanner object to take input from the user 
        Scanner object = new Scanner(System.in)) {
            // radom() method is used to generate any no between 1 to 100
            int userNumber = (int) (Math.random() * 100) + 1;

            int trials = 0;
            
            System.out.println("Guess the any  number between 1 and 100. You have 3 trials .");
            
            // iterative  statement 
            while (trials < 3) {
                System.out.print("Enter your luckyNo: ");
                int luckyNO = object.nextInt();
                trials++;
                
                if (luckyNO == userNumber) {
                    System.out.println(" ohhh Congrats my brother you guessed the right one !");
                    return; 
                } else if (luckyNO < userNumber) {
                    System.out.println("Your luckyNO is smaller then required no ");
                } else {
                    System.out.println("Your luckyNO is larger then the required no");
                }
            }
            
            System.out.println("Sorry, loose the game try next time . the right no is  : " +userNumber);
        }

}
}