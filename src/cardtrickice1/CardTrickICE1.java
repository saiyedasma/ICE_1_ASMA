/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Asmabanu Saiyed , Student ID 991578249
package cardtrickice1;

import java.util.Random;
import java.util.Scanner;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is
 * found'
 *
 * @author sivagamasrinivasan
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; //Array of object
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());
        System.out.println("The cards in the magic hand are: ");
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generator.nextInt(13) + 1);
            c.setSuits(Card.SUITS[generator.nextInt(4)]);
            magicHand[i] = c;
            System.out.println(c);
        }
        System.out.print("Enter card value:");
        int val = scan.nextInt();

        System.out.print("Enter suit:");
        String suit = scan.next();

        Card key = new Card();
        key.setValue(val);
        key.setSuits(suit);

        boolean found = false;
        System.out.println("searching for : " + key );
        for (int i = 0; i < magicHand.length; i++) {
            if ((magicHand[i].getValue() == key.getValue()) && magicHand[i].getSuits().equalsIgnoreCase(key.getSuits())) {
                System.out.println("Card is found in magic hand at index " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Card is not found in magic hand.");
        }
    }

        
}


