/**
 * This abstract class is the super class for programmer
 * include constructor, get and set method, toString method
 * <p>Name: 22F Lab 6</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 16, 2022</p>
 * <p>Section: 313</p>
 * @author Rick Zhang
 * @version 1.0
 * @since 11.0.15
 */

public abstract class Programmer implements Payme{

private String firstName;
private String lastName;
private String socialSecurityNumber;
private int year;
private int month;

/** three-argument constructor 
 *  @param first first name of the programmer
 *  @param last last name of the programmer
 *  @param ssn social security number of the programmer
 *  @param year the current year
 *  @param month the current month
 */

public Programmer(String first, String last, String ssn, int year, int month) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
 year = 0;
 month = 0;
}

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the socialSecurityNumber
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * @param socialSecurityNumber the socialSecurityNumber to set
 */
public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

/**
 * @return the year
 */
public int getYear() {
	return year;
}

/**
 * @param year the year to set
 */
public void setYear(int year) {
	this.year = year;
}

/**
 * @return the month
 */
public int getMonth() {
	return month;
}

/**
 * @param month the month to set
 */
public void setMonth(int month) {
	this.month = month;
}

/** return String representation of Programmer object */
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n", 
  getFirstName(),getLastName(),"social security number",getSocialSecurityNumber());
} 
public abstract double getPaymentAmount();/** No implementation here. DO YOU KNOW WHY? What should this method be?  */


} 


