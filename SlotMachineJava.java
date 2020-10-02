import java.util.Scanner;
import java.util.Random;

class SlotMachine {
    public static void main(String[] args) {
        String[] Items = {"Apple", "Banana", "Pear"};
        String Slot1;
        String Slot2;
        String Slot3;
        String again = "yes";
        Scanner scn = new Scanner(System.in);
        Random choice = new Random();
        
        while (again.equals("yes")) {
            System.out.println("Press enter to spin wheel.");
            String filler = scn.nextLine();
            Slot1 = Items[choice.nextInt(3)];
            Slot2 = Items[choice.nextInt(3)];
            Slot3 = Items[choice.nextInt(3)];
            System.out.println(Slot1 + " " + Slot2 + " " + Slot3);
            if (Slot1.equals(Slot2) && Slot1.equals(Slot3)) {
                System.out.println("Well done, you got all three the same!");
            } else if (Slot1.equals(Slot2) || Slot1.equals(Slot3) || Slot2.equals(Slot3)) {
                System.out.println("Well done, you got two the same.");
            } else {
                System.out.println("You got none of the same.");
            }
            System.out.println("Would you like to play again? \r\n(yes/no)");
            again = scn.nextLine();
        }
    }
}