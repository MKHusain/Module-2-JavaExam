package inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Nokia1100 extends PreNokia1100 {


    public void defaultConstructor(int x){
        System.out.println("Default Constructor Created");
    };

    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */
    public static void main(String[] args) {


        Nokia1100 phone = new Nokia1100();

        phone.sendText();
        phone.makeCall();
        phone.contactList();
        photoGallery();
    }

    public static void photoGallery(){
        System.out.println("Photo Gallery Implemented");
    }

}