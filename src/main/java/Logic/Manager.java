
package Logic;

/**
 *
 * @author josemejia
 */
public class Manager extends Person implements Password, TimerChecker{
    
    private int storeNum;

    public Manager() {
    }

    public Manager(int storeNum) {
        this.storeNum = storeNum;
    }
    
    public Manager(int storeNum, String firstName, String lastName, String middleName, String ssn, String phoneNum, String id, int age) {
        super(firstName, lastName, middleName, ssn, phoneNum, id, age);
        this.storeNum = storeNum;
    }

    @Override
    public void passwordGerated() {
        System.out.println("Password generated");
    }

    @Override
    public void idGerated() {
        System.out.println("Id generated");
    }

    @Override
    public void clockIn() {
        System.out.println("Manager clock in at: 11:00am");
    }

    @Override
    public void clockOut() {
        System.out.println("Manager clock out at 7:00pm");
    }
    
    public void doSchedule(){
        System.out.println("Make workers schedule");
    }
    
    public void doInventory(){
        System.out.println("Inverntory at the end of the month");
    }

    
    
    public String getSuperString(){
        return "Manager Employee:\n" + 
                super.toString() + "\n"+
                "* Store Number Mange: " +  storeNum;
    }
    
    public boolean getEquals(Object obj){
        
        return super.equals(obj);
    }
    
}
