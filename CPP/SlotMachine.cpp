#include <iostream>
#include <cstdlib>
#include <ctime>
// Use instead of built in arrays.
#include <vector>
using namespace std;

class SlotMachine {
    /*
    A simple class which performs the operation of a slot machien.
    
    Methods:
        SlotMachine = Initialises the variables.

        run = Runs the code for the slot machine.

        generateRandomItems = Picks the items randomly.
        
        randomIndex = Generates a random index.
    */
    public:
        SlotMachine() {
            playAgain = "yes";
        }



        void run() {
            /*
            Runs the code for the slot machine.

            Variables:
                spinWheel = Used as a filler so that the user can 
                            hit enter.
            */
            while (playAgain == "yes") {
                cout << "Type yes to spin the wheel." << endl;
                cin >> spinWheel;
                generateRandomItems();
                cout << slot_1 << " " << slot_2 << " " << slot_3 << endl;
                if (slot_1 == slot_2 && slot_1 == slot_3) {
                    cout << "Well done, you got all three the same!" << endl;
                } else if (slot_1 == slot_2 || slot_1 == slot_3 || slot_2 == slot_3) {
                    cout << "That's good, you got two of the same!" << endl;
                } else {
                    cout << "You got none of the same :( -- Try again!" << endl;
                }
                cout << "Would you like to play again? \n(yes/no)" << endl;
                cin >> playAgain;
            }
            cout << "Thank you for playing." << endl;
        }
    


    private:
        vector<string> items = {"apple", "banana", "pear"};
        string slot_1;
        string slot_2;
        string slot_3;
        string playAgain;
        string spinWheel;



        void generateRandomItems() {
            slot_1 = items[randomIndex(items, 1)];
            slot_2 = items[randomIndex(items, 4)];
            slot_3 = items[randomIndex(items, 7)];
        }



        int randomIndex(vector<string> TheList, int Number) {
            // Makes seed random.
            // Number is used so that all slots have different seeds.
            srand(time(0) + Number);
            // % keeps it periodic within the size of the array.
            return (rand() % TheList.size());
        }
};



int main() {
    SlotMachine slotMachine;
    slotMachine.run();
    return 0;
}