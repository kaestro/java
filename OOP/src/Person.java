public class Person {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age >= 0 && age <= 100) ? age : 0;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty())
            return new String("");
        if (firstName.isEmpty())
            return lastName;
        if (lastName.isEmpty())
            return firstName;
        return getFirstName() + " " + getLastName();
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    private String firstName, lastName;
    private int age;
}
