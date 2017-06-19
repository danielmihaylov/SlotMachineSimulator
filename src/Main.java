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

        userInput = JOptionPane.showInputDialog("Insert money: ");
        amount = Double.parseDouble(userInput);

        for (int i = 0; i < 3 ; i++) {
            wordIndex = random.nextInt(6);

            switch (wordIndex){
                case 0:word = "cherries";
                    break;
                case 1:word = "oranges";
                    break;
                case 2:word = "plums";
                    break;
                case 3:word = "bells";
                    break;
                case 4:word = "melons";
                    break;
                case 5: word = "bars";
                    break;
                default:
                    break;
            }
            if (i == 0){
                firstWord = word;
            }else if(i == 1){
                secondWord = word;
            }else if(i == 2){
                thirdWord = word;
            }
        }

        output = output + "[" + firstWord + "]" + "     " + "[" + secondWord + "]" + "     " + "[" + thirdWord + "]";

        if ((!firstWord.equals(secondWord)) && (!secondWord.equals(thirdWord)) && (!thirdWord.equals(firstWord))){
            output = output + "\nYou have won $0 !";
        }

        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}
