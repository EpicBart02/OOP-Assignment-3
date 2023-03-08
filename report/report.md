# Are there any classes missing in your design, why/why not?
Most classes in class_diagram.jpg are present in my own class diagram. I believe i got most of them right because of Assignment 2. While i did not submit it in time, i learned a great deal about abstract classes, interface classes and regular classes. The one thing i did not implement are protected classes, i do not have any protected classes or methods in my class diagram.. 

# Did you have any extra classes in your design, why/why not?
 I did not have any extra classes. I think that is because i am naturally interested in game design and game programming, therefore i believe my creativity regarding this matter helped me. But i misinterpreted a few classes in my class diagram. For example, Board. I believed it was the board class that both generated and set the board.

# Are there differences in naming the classes? How should classes be named?
There are slight differences in naming. I believe that classes should be named according to their use. So the user interface should be named UI or Game interface. You should be able to understand what the class does in general just by reading the name. 

# Are there differences in the relations between the classes?
I do have differences in relations, specifically the relations between board, tile, and the different tiles. In my class, the tiles are generated and the board gets set inside my board class. I did this because having ```generateTiles``` and ```setBoard``` in the same class is convenient and efficient in my opinion. I also did not have as many relations in general.

# Did you connect the objects using dependency/association or did you use id-connections?
I used ID connections. I did not completely understand what all the arrows mean in genmymodel, so i used the simple ID-connection. Somtimes the arrows did not even work, so i resorted to ID-connections.

# Did you manage to divide the complexity/behaviour into different classes or do you have one central class having most of the code?
I feel that i did manage to divide the games behaviour into different classes. Board and Tiles take care of all the tiles. I have a seperate Dice class so it doesnt clutter in one specific class. I have a Player interface and a RealPlayer class, i followed the instructions that dictated we should prepare our diagram to be able to implement a computer player later on. And i have a game class that starts the program. So i feel that i divided the process into different classes.

# What differences are there for the object diagram?

# What differences are there for the sequence diagram?
The biggest differences are that my implementation only has one Dice with two values. I do roll twice, but i dont send back each value by itself, i send both of them back simultaneously. Also i did not implement Game since i thought the game was already "running" hence not needing any mehtods inside game. My sequence diagram was also much less detailed than this one. I did not think about getName when printing out in the UI. 

# Do you think you made a good job in your initial design, why/why not?
I believe my class diagram was decent. I had a good idea about which classes and methods were gonna be used. But i feel i couldve done a much better job on the other two. They were not detailed enough and they were very confusing. 

# What is the most important thing you learned by designing first?
I think creating the different diagrams single handedly first was an experiment to see how much we knew and how fast we could learn. And i feel it was a really good thing because after the correct diagrams got revealed, we got to understand what our flaws were and where we can improve. And now that we know that, we know our flaws and we can start to improve them. 

