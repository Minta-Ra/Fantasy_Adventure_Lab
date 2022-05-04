# Fantasy Adventure Lab

Java modelled fantasy adventure game. TDD lab, implemented 4 pillars and solid principles.

### Classes Diagram
![](app-screenshots/1.png)

The game has enemies, such as Orcs, Trolls and players, who have a number of health points and weapons/spells. Players fall into different categories:

### Dwarves, Barbarians, Knights 
* Each of these have a weapon (Sword, Axe, Club) and can fight with other players. 
* Each are able to change their weapon at any point in the game.

### Warlocks and Wizards 
* They are able to cast spells (Fireball, Lightning Strike) on others.
* They can have a mythical creature (Ogre or Dragon) who will defend them from attackers.
* They are able to change spells or creature at any point in the game.

### Clerics 
* They have healing tools (potion, herbs) with which they can heal other players.
* They are able to change healing tool at any point in the game.

The game will also have rooms to work through. Each room should either have some kind of treasure (Gold, Gems) to collect or an Enemy (Troll, Orc) to defeat before moving on.

#
## MVP
* Create the players, enemies, weapons, healers for the adventure.
* Each player will have a name and a number of health points.
* Create IHeal, IDefend, ISpell interfaces
* Create classes which implement the IDefend interface e.g. Ogre, Dragon. Each should have a defend method which affects the health value of the enemy they attack.
* Give different players properties/methods that are specific to their own class. (e.g. a Knight could have armour that could reduce damage they take)
* Create a Cleric class. This class will have an IHeal with which they can heal other players. This can be changed as the game goes on.

## Extensions
* Create a class for Room.
* Allow rooms to randomly assign an enemy to defeat or treasure to find once user enters the room.
* Room should have an array of exits which should create a random number of unique exit locations when initialised.
* When a user chooses an exit it should take them to a new Room.
* The user should complete rooms by either collecting treasure or defeating an enemy and a new room will be presented to them.
* Quest should complete when the array of rooms is empty.

#
### <a href="https://github.com/codeclan/g28_classnotes/blob/main/week_12/day_3/fantasy_adventure_lab/fantasy_adventure_lab.md">
Full brief</a>