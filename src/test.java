//import javax.swing.*;
//
///**
// * Created by Daniel on 21.6.2017 г..
// */
//public class test {
//    if ((!firstWord.equals(secondWord)) && (!secondWord.equals(thirdWord)) && (!thirdWord.equals(firstWord))) {
//        output = output + "\n\nYou have won $0 !";
//        totalAmountWon += 0;
//    } else if ((firstWord.equals(secondWord) && !firstWord.equals(thirdWord)) ||
//            (firstWord.equals(thirdWord) && !firstWord.equals(secondWord)) ||
//            (secondWord.equals(thirdWord) && !secondWord.equals(firstWord))){
//        output = output + String.format("\n\nYou have won $%,.2f" + (amount * 2));
//        totalAmountWon += (amount *2);
//    }else{
//        output = output + String.format("\n\nYou have won $%,.2f" + (amount * 5));
//        totalAmountWon += (amount * 5);
//    }
//
//    output = output + String.format("\n\nTotal money inserted: $%,.2f\n Amount won: $%,.2f\n" + totalAmountEntered, totalAmountWon);
//
//    playAgain = JOptionPane.showInputDialog(output + "\n\n\nDo you want to play " +
//            "again?\nPress y for yes, any key for no :").charAt(0);
//}
//
//        if (totalAmountEntered > totalAmountWon){
//                JOptionPane.showMessageDialog(null,String.format(
//                "You have inserted: $%,.2f\nYou won: $%,.2f\nYour loss is: $%,.2f", totalAmountEntered ,totalAmountWon ,(totalAmountEntered - totalAmountWon)));
//                }else if(totalAmountWon > totalAmountEntered){
//                JOptionPane.showMessageDialog(null,String.format(
//                "You have inserted: $%,.2f\nYou won: $%,.2f\nYour profit is: $%,.2f", totalAmountEntered ,totalAmountWon ,(totalAmountWon - totalAmountEntered)));
//                }else{
//                JOptionPane.showMessageDialog(null,String.format(
//                "You have inserted: $%,.2f\nYou won: $%,.2f\nYour are even !", totalAmountEntered ,totalAmountWon));
//                }
//}
