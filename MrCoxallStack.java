/*
* This class creates an integer stack.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-12-10
*/

import java.util.Stack;

/** This class contains the contents of a stack. */
public final class MrCoxallStack {

    /** Create the stack as an ArrayList (array that grows as I need it!). */
    private static Stack<Integer> stack = new Stack<Integer>();

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MrCoxallStack() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method push an integer to the stack.
    *
    * @param pushInput push the input
    */
    public void push(final String pushInput) {
        try {
            final int pushNumber = Integer.parseInt(pushInput);
            this.stack.push(pushNumber);
        }
        catch (IOException ex) {
            System.out.println("\nInvalid input.");
        }
    }

    /**
    * This method returns the last integer in the stack.
    *
    * @return lastIntegerOfStack last integer
    */
    public Integer peek() {
        if (this.stack.size() < 1) {
            lateInteger = null;
        }
        lateInteger = this.stack.get(this.stack.size() - 1);
    }

    /**
    * This method pops the top integer from the stack.
    *
    * @return lastIntegerOfStack The last integer of stack
    */
    public Integer pop() {
        let lateInteger;
        if (this.stack.size() < 1) {
            lateInteger = null;
        }
        final int element = this.peek();
        this.stack.remove(this.stack.size() - 1);
        lateInteger = element;
    }

    /**
    * This method prints out the list of items in the stack.
    */
    public void showStack() {
        System.out.print("");
        for (int index = 0; index < this.stack.size(); index++) {
            System.out.println(this.stack.get(index));
        }
        System.out.println("\n");
    }
}
