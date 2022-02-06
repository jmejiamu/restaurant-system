/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        // Tes
        RegularEmployee regDuplicate =  new RegularEmployee("cook", "JJ", "kk", "k", "77-777-777", "5106897755", "F123", 34);
        
        // Testing Duplicates
        System.out.println(reg == regDuplicate);
        System.out.println(reg.equals(regDuplicate));
        
        Person[] employees = new Person[3];
        
        employees[0] = areasup;
        employees[1] = reg;
        employees[2] = manager;
        
        for (Person employee : employees) {
            
            if(employee instanceof AreaSupervisor){
                AreaSupervisor  as =  (AreaSupervisor)employee;
                
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
                // Methos in the sub class
                m.clockIn();
                m.doInventory();
                m.doSchedule();
            }
            
            if(employee instanceof RegularEmployee){
                System.out.println("---------------------");
                RegularEmployee rgEmp = (RegularEmployee)employee;
                
                System.out.println(rgEmp);
                
                rgEmp.callOrder();
                
            }
        }
        
        
    }
}
