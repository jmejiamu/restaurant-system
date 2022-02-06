
package Logic;

/**
 *
 * @author josemejia
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String middleName;
    private String ssn;
    private String phoneNum;
    private String id;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, String middleName, String ssn, String phoneNum, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.ssn = ssn;
        this.phoneNum = phoneNum;
        this.id = id;
        this.age = age;
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: \n" + 
                "* First Name: " + firstName + "\n" +
                "* Last Name: " + lastName + "\n" +
                "* Middle Name: " + middleName + "\n" +
                "* ssn: " + ssn + "\n" +
                "* Phone#: " + phoneNum + "\n" +
                "* Id: " + id + "\n" +
                "* Age: " + age;
    }
    
    
}
