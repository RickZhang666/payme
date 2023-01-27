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

public class HourlyProgrammer extends Programmer {
private double wage; /** wage per hour */
private double hours; /** hours worked for week */

/** constructor 
 * {@inheritDoc}
 *  @param wage wage per hour
 *  @param hours hours worked for week
 */ 
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, int month, int year, 
double wage, double hours) {
super(firstName, lastName, socialSecurityNumber, month, year);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/** set wage 
 * @param wage wage per hour*/
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/** @return wage wage per hour*/
public double getWage() {
return wage;
} 

/** set hours worked 
 * @param hours hours worked for week*/

public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/** @return hours hours worked */
public double getHours() {
return hours;
} 

/** calculate earnings; override abstract method earnings in Programmer */

@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          
/** return String representation of CommissionProgrammer object 
 * {@inheritDoc}
 */         
@Override                                                             
public String toString() {
return String.format("%s: %s%s: $%.2f; %s: %.2f",
		"hourly Programmer",super.toString(),
		"hourly wage",getWage(),"hours worked",getHours());
}

}

