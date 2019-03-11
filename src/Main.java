/**
 * Created by 044158 on 3/7/2019.
 */
import java.util.*;
class Contacts{
    private String name;
    private String email;

    public Contacts(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Business extends Contacts{
    private String phone;

    public Business(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Business{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

class ContactCollection {

    public String addContact(Contacts addMeToList) {

        List<String> list = new ArrayList<>();
        list.add(String.valueOf(addMeToList));
        for (String items : list) {
            System.out.println(items);
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("Jeffery", "jeff.ray@gmail.com");

        Business b1 = new Business("Adriana", "adri.faust@gmail.com","614-812-9046");

        ContactCollection group = new ContactCollection();
        group.addContact(c1);
        group.addContact(b1);
    }

}
