## Are there any classes missing in your design, why/why not?
Most classes in class_diagram.jpg are present in my own class diagram. I believe i got most of them right because of Assignment 2. While i did not submit it in time, i learned a great deal about abstract classes, interface classes and regular classes. Some things i did not implement are are protected classes and enumeration. I do not have any protected methods in my class diagram because i did not really deem them nessecary. I did not implement enumeration in my UI class aswell since i did not know what it was. I did a little researching and understood how in this case, while not nessecary, is efficient and keeps things short.

## Did you have any extra classes in your design, why/why not?
 I did not have any extra classes. I think that is because i am naturally interested in game design and game programming, therefore i believe my creativity regarding this matter helped me. But during the time i created the class diagram, i misinterpreted a few classes. For example, Board. I believed it was the board class that both generated and set the board.

## Are there differences in naming the classes? How should classes be named?
There are slight differences in naming. RealPlayer instead of HumanPlayer for example. But most of them are the same since i followed assignment 2's instructions. I believe that classes should be named according to their use. You should be able to understand what the class does in general just by reading the name. If a class is called player, i would assume it maybe holds the values and methods specifically for the player, not the user interface. 

## Are there differences in the relations between the classes?
I do have differences in relations, specifically the relations between board, tile, and the different tiles. In my class, the tiles are generated and the board gets set inside my board class. I did this because having ```generateTiles``` and ```setBoard``` in the same class is convenient and efficient in my opinion. The program wouldnt be forced to jump around between classes. I also did not have as many relations in general because i was fairly new to this and had a difficult time understanding the different arrows.

## Did you connect the objects using dependency/association or did you use id-connections?
I used ID connections. I did not completely understand what all the arrows mean in genmymodel, therefore i used the simple ID-connection. And when i did understand how to use some of the arrows, i think i used them incorrectly since they did not work. Hence my updated_class_diagram having a drawn interface realization arrow between computerPlayer and Player. Thats why i resorted to ID-connections.

## Did you manage to divide the complexity/behaviour into different classes or do you have one central class having most of the code?
I feel that i did manage to divide the games behaviour into different classes. Board and Tiles take care of all the tiles. I have a seperate Dice class so its easier to reach. I have a Player interface and a RealPlayer class, i followed the instructions that dictated we should prepare our diagram to be able to implement a computer player later on. And i have a game class that starts the program. So i feel that i divided the process into different classes.

## What differences are there for the object diagram?
The biggest difference is that my tiles do not have a Prev variable. They only see the tile in front of them but not whats behind them. I did not understand what the point of that was since the players only move forward, so i did not implement it. I also swapped out game for Ui, and also removed Game from the equation entirely. I thought that since the UI is asking you for an action, it should be the UI that appears in the Object diagram, not Game.

## What differences are there for the sequence diagram?
The biggest differences are that my implementation only has one Dice with two values. I do roll twice, but i dont send back each value by itself, i send both of them back simultaneously. Also i did not implement Game since i thought the game was already "running" hence not needing to put it into my sequence diagram. My sequence diagram was also much less detailed than this one. I didnt show the loop in the sequence diagram, i just went back and forth. I did not think about getName when printing out in the UI either. All in all my sequence diagram missed a few steps, no getName, no loop, no next round. 

## Do you think you made a good job in your initial design, why/why not?
I believe my class diagram was decent. I had a good idea about which classes and methods were gonna be used. But i feel i couldve done a much better job on the other two. They were not detailed enough and they were very confusing in my opinion. I could have done more research on both sequence and object diagrams to try and understand them better. 

## What is the most important thing you learned by designing first?
I think creating the different diagrams single handedly first was an experiment to see how much i knew and how fast i could learn. And i feel it was a good excerise because after the correct diagrams got revealed, i got to understand what my flaws are and where i can improve. And now that i know that, i can start to improve upon them.

## Updated Class Diagram
I has some issues with genmymodel and i couldnt print out the neccesary interface realization arrow from my ComputerPlayer class to the Player interface. So unfortunately i had to resort to Paint. 

