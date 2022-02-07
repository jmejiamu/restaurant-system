
package Logic;

/**
 *
 * @author josemejia
 */
public class Main {
    public static void main(String[] args) {
        
        AreaSupervisor areasup =  new AreaSupervisor(2, "Marry", "Munez", "Y", "734-27-3867", "5196897745", "F3467", 35);
        
        RegularEmployee reg =  new RegularEmployee("Cook", "Joe", "Snowden", "k", "77-777-777", "5106897755", "F1237", 27);

        Manager manager =  new Manager(5, "Mariza", "Ortex", "J", "724-55-6667", "5106895544", "F45747", 30);

        // Testing Duplicates objects
        RegularEmployee regDuplicate =  new RegularEmployee("Cook", "Joe", "Snowden", "k", "77-777-777", "5106897755", "F1237", 27);
        Manager managerD =  new Manager(5, "Mariza", "Ortex", "J", "724-55-6667", "5106895544", "F45747", 30);
        AreaSupervisor areasupD =  new AreaSupervisor(2, "Marry", "Munez", "Y", "734-27-3867", "5196897745", "F3467", 35);
        
        // Testing Duplicates
        System.out.println(reg == regDuplicate);
        System.out.println(reg.equals(regDuplicate));
        System.out.println(manager.equals(managerD));
        System.out.println(areasup.equals(areasupD));
        
        Person[] employees = new Person[3];
        
        employees[0] = areasup;
        employees[1] = reg;
        employees[2] = manager;
        
        for (Person employee : employees) {
            
            if(employee instanceof AreaSupervisor){
                
                System.out.println("---------------------");
                
                AreaSupervisor  as =  (AreaSupervisor)employee;
                
                //Print info
                System.out.println(as);
                
                // Method in sub class
                as.clockIn();
                as.idGerated();
                
            }
            
            if(employee instanceof Manager){
                
                System.out.println("---------------------");
                
                Manager m =  (Manager)employee;
                
                //Printing info
                System.out.println(m);
                
                // Methods in the sub class
                m.clockIn();
                m.doInventory();
                m.doSchedule();
                m.clockOut();
            }
            
            if(employee instanceof RegularEmployee){
                
                System.out.println("---------------------");
                
                RegularEmployee rgEmp = (RegularEmployee)employee;
                
                //Print info
                System.out.println(rgEmp);
                
                //Method in sub Class
                rgEmp.callOrder();
                
            }
        }
        
        
    }
}
