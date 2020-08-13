import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void storeContact(String name, Integer phoneNumber) {

        if (!contacts.contains(new Contact(name, phoneNumber))) {
            contacts.add(new Contact(name, phoneNumber));
        }
    }

    public void modifyContact(String name, Integer phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNumber(phoneNumber);
                break;
            }
        }
    }

    public void removeContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                break;
            }
        }
    }

    public Integer queryContact(String name) {
        Integer res = null;
        for (Contact contact : contacts) {
            if (contact.getName() == name) {
                res = contact.getPhoneNumber();
                break;
            }
        }
        return res;
    }

    public void queryContact() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

}
