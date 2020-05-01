package inheritance;

public interface SymbianPhone {

    /**
     * Assume that this is early stage of creating mobile
     * <p>
     * Declare 3 methods sendText(), makeCall(), contactList()
     * Can a method contains method body in Interface?
     * Ans: All methods of an Interface do not contain implementation (method bodies) as of all versions below Java 8.
     * Starting with Java 8, default and static methods may have implementation in the interface definition.
     */

    public void sendText();

    public void makeCall();

    public void contactList();
}