import java.util.Locale;

public class Person {
    private String firstName, lastName, nickName, gender;

    // Constructorless
    public Person() {
        System.out.println("Person constructor was called");
    }
    //chain constructor
//    public Person(String firstName, String nickName) {
//        this(firstName, "", nickName, "");
//    }

    public Person(String firstName, String nickName) {
        this.firstName = firstName;
        this.nickName = nickName;
    }

    public Person(String firstName, String lastName, String nickName, String gender) {
//        this.firstName = firstName.trim().substring(0,1).toUpperCase()+
//                firstName.trim().substring(1).toLowerCase();
        setFirstName(firstName);
        setLastName(lastName);
        setNickName(nickName);
        setGender(gender);
//        this.lastName = lastName.trim().substring(0,1).toUpperCase()+
//                lastName.trim().substring(1).toLowerCase();
//        this.nickName = nickName;
//        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim().substring(0,1).toUpperCase()+
                firstName.trim().substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim().substring(0,1).toUpperCase()+
                lastName.trim().substring(1).toLowerCase();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
