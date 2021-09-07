package Java;

import java.util.Scanner;
import java.util.Random;

class SlotMachine {
    /**
    A simple class which performs the operation of a slot machien.
    
    Methods:
        SlotMachine = Initialises the variables.

        run = Runs the code for the slot machine.

        generateRandomItems = Picks the items randomly.
    */
    private String[] items = {"Apple", "Banana", "Pear"};
    private String slot_1;
    private String slot_2;
    private String slot_3;
    private String playAgain;
    private Scanner scn;
    Random randomIndex;



    SlotMachine() {
        this.playAgain = "yes";
        this.scn = new Scanner(System.in);
        this.randomIndex = new Random();
    }



    public void run() {
        /**
        Runs the code for the slot machine.

        Variables:
            spinWheel = Used as a filler so that the user can 
                        hit enter.
        */
        while (this.playAgain.equals("yes")) {
            System.out.println("Press enter to spin wheel.");
            String spinWheel = scn.nextLine();
            generateRandomItems();
            System.out.println("Spinning...");
            System.out.println(this.slot_1 + " " + this.slot_2 + " " + this.slot_3);
            if (this.slot_1.equals(this.slot_2) && this.slot_1.equals(this.slot_3)) {
                System.out.println("Well done, you got all 3 the same!");
            } else if (this.slot_1.equals(this.slot_2) || this.slot_1.equals(this.slot_3) || this.slot_2.equals(this.slot_3)) {
                System.out.println("Well done, you got 2 the same.");
            } else {
                System.out.println("You got none of the same.");
            }
            System.out.println("Would you like to play again? \r\n(yes/no)");
            this.playAgain = scn.nextLine();
        }
        System.out.println("Thank you for playing.");
        this.scn.close();
    }



    private void generateRandomItems() {
        this.slot_1 = items[this.randomIndex.nextInt(3)];
        this.slot_2 = items[this.randomIndex.nextInt(3)];
        this.slot_3 = items[this.randomIndex.nextInt(3)];
    }


    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        slotMachine.run();
    }
}