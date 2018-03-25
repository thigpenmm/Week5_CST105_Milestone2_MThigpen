/**Program: DisplayNFLPlayer Program
 *File: DisplayNFLPlayer.java
 *Summary: Contains details of the NFL player's stats to print to the console 
 * using program NFLPlayer.java.
 *Author: Mercedes Thigpen
 *Date: March 23, 2018
 **/
package nflplayer;

/**
 *
 * @author mthigpen
 */
public class DisplayNFLPlayer {
    
    public static void main(String[] args) {
        NFLPlayer NFLPlayer1;
        NFLPlayer1 = new NFLPlayer("Quarterback", "Dak Prescott", 6, 2, 238, 24, 3, 22, 13, 3324);
        NFLPlayer1.DisplayNFLPlayer();
        System.out.println();
    }
    static {
        NFLPlayer NFLPlayer2;
        NFLPlayer2 = new NFLPlayer("Wide Receiver", "Dez Bryant", 6, 3, 220, 29, 9, 6, 0, 838);
        NFLPlayer2.DisplayNFLPlayer();
        System.out.println();
    }
    static {
        NFLPlayer NFLPlayer3;
        NFLPlayer3 = new NFLPlayer("Wide Receiver", "Brice Butler", 6, 3, 220, 28, 6, 3, 0, 317);
        NFLPlayer3.DisplayNFLPlayer();
        System.out.println();
    }
   
}
