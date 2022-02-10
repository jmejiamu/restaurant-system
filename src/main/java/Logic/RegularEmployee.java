
package Logic;

/**
 *
 * @author josemejia
 */
public class RegularEmployee extends Person implements TimerChecker, Password{
    
    //Cook, chasier, IT ...
    private String position;

    public RegularEmployee() {
    }

    public RegularEmployee(String position) {
        this.position = position;
    }

    public RegularEmployee(String position, String firstName, String lastName, String middleName, String ssn, String phoneNum, String id, int age) {
        super(firstName, lastName, middleName, ssn, phoneNum, id, age);
        this.position = position;
    }

    @Override
    public void clockIn() {
        System.out.println("Clock in at 10:00 am");
    }

    @Override
    public void clockOut() {
        System.out.println("Clock out at 6:00pm");
    }

    @Override
    public void passwordGerated() {
        System.out.println("Employee password");
    }

    @Override
    public void idGerated() {
        System.out.println("Employee Id");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public void callOrder(){
        System.out.println("Call order");
    }

//    @Override
//    public String toString() {
//        return "RegularEmployee:\n"+ 
//                "* First Name: " + getFirstName()+ "\n"+
//                "* Last Name: "+ getLastName() + "\n" +
//                "* Middle Name: " + getMiddleName() + "\n"+
//                "* SSN: " + getSsn()+ "\n"+
//                "* Phone #: " + getPhoneNum() + "\n"+
//                "* ID: " + getId() + "\n"+
//                "* Age: " + getAge() + "\n" +
//                "* position: " + position  ;
//    }
    
    public String getSuperString(){
        return "Regular Employee:\n" + 
                super.toString() + "\n"+
                "* Position: " + position;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof RegularEmployee) {
            RegularEmployee reguEmp =  (RegularEmployee) obj;
            
            String otherRegEmpId =  reguEmp.getId();
            String otherRegEmpFName = reguEmp.getFirstName();
            
            if(getId().equals(otherRegEmpId) && getFirstName().equals(otherRegEmpFName)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    
}
