/**
 * This instance class is the sub class of CommissionProgrammer
 * include constructor, get, set, calculate payment and make a report
 * <p>Name: 22F Lab 6</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 16, 2022</p>
 * <p>Section: 313</p>
 * @author Rick Zhang
 * @version 1.0
 * @since 11.0.15
 */

public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; /** base salary per week */

/** constructor 
 * {@inheritDoc}
 *  @param baseSalary base salary to the programmer
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, 
  month, year, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

/** set base salary 
 *  @param baseSalary base salary to the programmer*/
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/** @return getBaseSalary base salary */
public double getBaseSalary() {
return baseSalary;
}

/** calculate earnings; override method earnings in CommissionProgrammer*/
@Override                                                            
public double getPaymentAmount() {                                             
return getBaseSalary() + super.getPaymentAmount();                        
} 

/** return String representation of CommissionProgrammer object 
 * {@inheritDoc}
 */
@Override    
public String toString() {
	return "base-plus " + super.toString()+ String.format("; %s: $%.2f","base salary",getBaseSalary());
}   


}



