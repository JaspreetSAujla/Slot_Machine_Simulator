import time
import random

class SlotMachine:
    """
    A simple class which performs the operation of a slot machien.

    Class Variables:
        items = Stores a list of all the items that can be selected.
    
    Methods:
        __init__ = Initialises the variables.

        run = Runs the code for the slot machine.

        generate_random_items = Picks the items randomly.
    """
    items = ['Apple', 'Banana', 'Pear']



    def __init__(self):
        """
        Defines the initial variables of the class.

        Variables:
            self.slot_1 = The first slot.

            self.slot_2 = The second slot.

            self.slot_3 = The third slot.

            self.play_again = Stores whether the user wants to play 
                              again or not.
        """
        self.slot_1 = None
        self.slot_2 = None
        self.slot_3 = None
        self.play_again = "yes"
    


    def run(self):
        """
        Runs the code for the slot machine.
        Uses a while loop so that the player can play again.
        """
        while self.play_again == "yes":
            input("Press any key to spin the wheel.")
            self.generate_random_items()
            print("Spinning...")
            time.sleep(3)
            print(f"{self.slot_1} {self.slot_2} {self.slot_3}")
            if self.slot_3 == self.slot_1 and self.slot_3 == self.slot_2:
                print("Well done! You got all 3 of them the same!")
            elif self.slot_1 == self.slot_2 or self.slot_1 == self.slot_3 or self.slot_2 == self.slot_3:
                print("Nice job! You got 2 of the same.")
            else:
                print("Sorry! You got none the same.")
            time.sleep(2)
            self.play_again = input("Would you like to play again? \n(yes/no) \n")
        print("Thank you for playing.")
    


    def generate_random_items(self):
        """
        Picks the items in the slots randomly.
        """
        self.slot_1 = random.choice(SlotMachine.items)
        self.slot_2 = random.choice(SlotMachine.items)
        self.slot_3 = random.choice(SlotMachine.items)



if __name__ == "__main__":
    slot_machine = SlotMachine()
    slot_machine.run()