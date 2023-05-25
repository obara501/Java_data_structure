# Stack

A stack is a fundamental data structure in computer science that follows the Last-In-First-Out (LIFO) principle. It can be visualized as a stack of objects, where the last object placed on top is the first one to be removed. Think of it like a stack of books where you can only add or remove books from the top.

## Methods

### 1. Push

The `push` operation adds an element to the top of the stack. It takes the element as input and places it on top of the existing elements. The stack's size increases by one, and the newly added element becomes the new top.

### 2. Pop

The `pop` operation removes the top element from the stack and returns it. It reduces the stack's size by one and updates the top to the next element below. It is important to note that popping from an empty stack results in an error known as "underflow."

### 3. Peek (or Top)

The `peek` operation retrieves the top element of the stack without removing it. It returns the element currently at the top of the stack, allowing you to examine its value. This operation does not affect the stack's size or structure.

### 4. IsEmpty

The `isEmpty` operation checks whether the stack is empty or not. It returns a boolean value indicating whether there are any elements in the stack. If the stack is empty, it means no elements are present, and further popping or peeking is not possible.

## Implementation

Stacks can be implemented using various programming languages. One common approach is to use an array or a linked list to store the stack's elements. The top of the stack is typically represented by a variable that points to the last element added.

Feel free to explore the provided examples in this repository to gain a better understanding of stacks and their practical applications in java.
