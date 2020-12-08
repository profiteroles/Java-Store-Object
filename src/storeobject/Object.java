package storeobject;

// object class declared name and age
public class Object {

    int age;
    String name;

    public Object() { // default values of name and age
        name = null; // can be "Has no Name";
        age = 0;
    }

    public Object(String name, int num) { // overloaded constructor to indicate name & age
        this.name = name;
        age = num;
    }
  
}
/**
 *
 * @author 30023737
 */
