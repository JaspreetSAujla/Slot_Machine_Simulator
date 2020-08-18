import time
import random

Items = ['Apple', 'Banana', 'Pear']

replay = "yes"
while replay == "yes":
    input('Press any key to spin the machine.')
    Slot1 = random.choice(Items)
    Slot2 = random.choice(Items)
    Slot3 = random.choice(Items)
    print('Spinning...')
    time.sleep(3)
    print(Slot1, Slot2, Slot3)
    time.sleep(2)
    if Slot3 == Slot1 and Slot3 == Slot2:
        print('Well done, you got all 3 the same, here is 10k.')
    elif Slot1 == Slot2 or Slot1 == Slot3 or Slot2 == Slot3:
        print('Well done, you got 2 of the same!')
    else:
        print('Sorry, you got none the same.')
    time.sleep(3)
    replay = input('Would you like to play again? \n(yes/no) \n')
print('Thank you for playing.')