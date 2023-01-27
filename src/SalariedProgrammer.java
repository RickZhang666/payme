/**
 * This instance class is the sub class of Programmer
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

public class SalariedProgrammer extends Programmer  {
private double weeklySalary; /** salary every week */

/** constructor 
 * {@inheritDoc}
 *  @param weeklySalary every week to programmer
 */ 
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double weeklySalary) {
super(firstName, lastName, socialSecurityNumber, month, year); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/** set salary 
 * @param weeklySalary every week to programmer*/
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/** @return weeklySalary salary */
public double getWeeklySalary() {
return weeklySalary;
} 

/** calculate earnings; override abstract method earnings in Programmer */

@Override                                                           
public double getPaymentAmount() {                                          
return getWeeklySalary();                                        
	}                                             

/** return String representation of CommissionProgrammer object 
 * {@inheritDoc}
 */ 
@Override        
public String toString() {
	return String.format("%s: %s%s: $%.2f",
			"salaried Programmer",super.toString(),
			"weekly salary",getWeeklySalary());
	}

}
                                    
