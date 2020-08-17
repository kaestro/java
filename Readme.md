
## LinkedList

to use java iterator, use Iterator<E>.
You can move forward|backward using **next, previous**, and check existance using **hasNext**.

You can use **isEmpty()** to check if the LinkedList is empty.

### Caution with the Iterator use

Differing from the C++ style iterator, java's list-iterator is **fail-fast**, that is, if the list is
structurally modified at any time after the Iterator is created, in any way except through the list-iterator's own
or methods, the list - iterator will throw a ConcurrentModification Exception.

That is why setting the iterator at the beginning of **playlist class** to store it's current position isn't working properly.
Instead, you will have to update the playlist iterator everytime you add or remove some of the element to the list.

Or in the **solution code** the author used **play function** which sets an **iterator** which is not a part of **playlist**.

### Why do you need to keep the direction of the iterator you've been moving?

If you've been moving towards next, and you want to switch the direction to the previous, you have to move twice, not once.
Vice versa.

That is, **If you moved forward last time, calling .previous will return the *current iterator***.

ex)

boolean forward = true;

In java, you don't have "current Iterator" due to reject infinite loop from happening.

If you don't have forward iterator, you don't know if you can move forward or backward.

## InnerClasses

### How to initialize a inner class

To initiate a Inner class, there must exist a **instance**.

ex)
GearBox mcLaren = new GearBox(6);
GearBox.Gear first = mcLaren.new Gear(1, 12.3); // Okay
GearBox.Gear second = new Gearbox.Gear(2, 15.4); // Wrong
GearBox.Gear third = new mcLaren.Gear(3, 17.8); // Wrong
