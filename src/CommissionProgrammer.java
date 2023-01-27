import java.text.DecimalFormat;
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


public class CommissionProgrammer extends Programmer { 

private double grossSales; /** gross weekly sales */
private double commissionRate; /** commission percentage */

/** constructor 
 * {@inheritDoc}
 *  @param grossSales gross weekly sales to the programmer
 *  @param commissionRate commission percentage
 */ 
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber, month, year);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/** set gross sales amount on the creation of apps 
 * @param grossSales gross weekly sales to the programmer*/
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

/** @return getGrossSales gross sales amount */
public double getGrossSales() {
return grossSales;
} 

/** set commission rate 
 * @param commissionRate commission percentage*/
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/** @return commissionRate commission rate */
public double getCommissionRate() {
return commissionRate;
} 

/** calculate earnings; override abstract method earnings in Programmer.*/

@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

/** return String representation of CommissionProgrammer object 
 * {@inheritDoc}
 */
@Override      
public String toString() {
	DecimalFormat df = new DecimalFormat("#,##0.00");
	String grossSalesText = df.format(getGrossSales());

	return String.format("%s: %s%s: $%s; %s: %.2f",
			"commission Programmer",super.toString(),
			"gross sales",grossSalesText,"commission rate",getCommissionRate());
}   

}


