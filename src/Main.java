import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String userInput;
        Double amount;
        Random random = new Random();
        Integer wordIndex = 0;
        String word = "";
        String output = "";
        String firstWord = "";
        String secondWord = "";
        String thirdWord = "";
        char playAgain = 'y';
        Double totalAmountEntered = 0d;
        Double totalAmountWon = 0d;

        while (playAgain == 'y'){
            output = "";
            userInput = JOptionPane.showInputDialog("Insert money: ");
            amount = Double.parseDouble(userInput);
            totalAmountEntered += amount;

            for (int i = 0; i < 3; i++) {
                wordIndex = random.nextInt(6);

                switch (wordIndex) {
                    case 0:
                        word = "cherries";
                        break;
                    case 1:
                        word = "oranges";
                        break;
                    case 2:
                        word = "plums";
                        break;
                    case 3:
                        word = "bells";
                        break;
                    case 4:
                        word = "melons";
                        break;
                    case 5:
                        word = "bars";
                        break;
                    default:
                        break;
                }
                if (i == 0) {
                    firstWord = word;
                } else if (i == 1) {
                    secondWord = word;
                } else if (i == 2) {
                    thirdWord = word;
                }
            }

            output = output + "[" + firstWord + "]" + "     " + "[" + secondWord + "]" + "     " + "[" + thirdWord + "]";

            if ((!firstWord.equals(secondWord)) && (!secondWord.equals(thirdWord)) && (!thirdWord.equals(firstWord))) {
                output = output + "\n\nYou have won $0 !";
                totalAmountWon += 0;
            } else if ((firstWord.equals(secondWord) && !firstWord.equals(thirdWord)) ||
                    (firstWord.equals(thirdWord) && !firstWord.equals(secondWord)) ||
                    (secondWord.equals(thirdWord) && !secondWord.equals(firstWord))){
                output = output + "\n\nYou have won " + (amount * 2);
                totalAmountWon += (amount *2);
            }else{
                output = output + "\n\nYou have won " + (amount * 5);
                totalAmountWon += (amount * 5);
            }

            output = output + "\n\nTotal money inserted: " + totalAmountEntered + "\nAmount won:" + totalAmountWon;

            playAgain = JOptionPane.showInputDialog(output + "\n\n\nDo you want to play " +
                    "again?\nPress y for yes, any key for no :").charAt(0);
        }

        if (totalAmountEntered > totalAmountWon){
            JOptionPane.showMessageDialog(null,"You have inserted: " + totalAmountEntered + "$\nYou won: " + totalAmountWon +
                                            "$\nYour loss is: " + (totalAmountEntered - totalAmountWon) + "$\n");
        }else if(totalAmountWon > totalAmountEntered){
            JOptionPane.showMessageDialog(null,"You have inserted: " + totalAmountEntered + "$\nYou won: " + totalAmountWon +
                    "$\nYour profit is: " + (totalAmountWon - totalAmountEntered) + "$\n");
        }else{
            JOptionPane.showMessageDialog(null,"You have inserted: " + totalAmountEntered + "$\nYou won: " + totalAmountWon +
                    "$\nYour are even: ");
        }

        System.exit(0);
    }
}
