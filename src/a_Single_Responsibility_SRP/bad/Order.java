package a_Single_Responsibility_SRP.bad;

/*
The Single Responsibility Principle (SRP) means that a
class should have only one job to do. It should
focus on doing one specific thing well.

The Order class has two responsibilities: creating an order
and saving it to the database. 
This violates the SRP.
*/

public class Order {
    public void createOrder() {
        // Create the order
    }

    public void saveOrder() {
        // Save the order to the database
    }
}
