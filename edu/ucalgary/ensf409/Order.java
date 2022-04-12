package edu.ucalgary.ensf409;
import java.util.*;

public class Order{
    private ArrayList<Hamper> hampers;
    private static boolean orderFormCreated;
    public Order(){
        this.hampers=new ArrayList<Hamper>();
        orderFormCreated = false;


    }
    public void addNewHamper(){
        hampers.add(new Hamper());

    }
    public ArrayList<Hamper> getHampers(){
        return this.hampers;
    }
    public void setOrderFormCreated(boolean status){
        orderFormCreated=status;
    }
    public void calculateFoodDistribution(AvailableFood availableFood){

    }
    public void createOrderForm(){
        OrderForm a = new OrderForm();
        orderFormCreated = true;
    }
    public void addRecipientToHamper(Hamper hamper, int recipientID) {
        hamper.addNewRecipient(recipientID);
    }




}