package storeobject;

public class StoreObject {

    public static void main(String[] args) {
        //declared an array
        Object[] obj = new Object[5];
        // values inside the array
        obj[0] = new Object("Ishka", 18);
        obj[1] = new Object("Molly", 22);
        obj[2] = new Object("Tatiana", 36);
        obj[3] = new Object("Kath", 30);
        obj[4] = new Object("Joy", 25);
        
        
        // prints all the names has in the array by the length of it
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Name of the object is: " + obj[i].name + " " + obj[i].age + " old is the object");
        }
    }
}
/**
 *
 * @author 30023737
 */
