
package Logic;

/**
 *
 * @author josemejia
 */
public class AreaSupervisor extends Person implements Password, TimerChecker {
    
    private int numOfStores;

    public AreaSupervisor() {
    }
 
    public AreaSupervisor(int numOfStores) {
        this.numOfStores = numOfStores;
    }

    public AreaSupervisor(int numOfStores, String firstName, String lastName, String middleName, String ssn, String phoneNum, String id, int age) {
        super(firstName, lastName, middleName, ssn, phoneNum, id, age);
        this.numOfStores = numOfStores;
    }

    @Override
    public void passwordGerated() {
        System.out.println("Area Supervisor password");
    }

    @Override
    public void idGerated() {
        System.out.println("Area Supervisor id");
    }

    @Override
    public void clockIn() {
        System.out.println("Clock in at 9:00am");
    }

    @Override
    public void clockOut() {
        System.out.println("Clock out at 5:30pm");
    }
    
    

    public int getNumOfStores() {
        return numOfStores;
    }

    public void setNumOfStores(int numOfStores) {
        this.numOfStores = numOfStores;
    }

    public String getSuperString(){
        return "Area Supervisor Employee:\n" + 
                super.toString() + "\n"+
                "* Managed Stored: " +  numOfStores;
    }
    
    public boolean getEquals(Object obj){      
        return super.equals(obj);
    }
    
}
