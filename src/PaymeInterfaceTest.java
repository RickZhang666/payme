import java.text.DecimalFormat;
/**
 * This class is used to test class Programmer and its subclasses which have interface and inherit properties
 * <p>Name: 22F Lab 6</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Nov. 16, 2022</p>
 * <p>Section: 313</p>
 * @author Rick Zhang
 * @version 1.0
 * @since 11.0.15
 */
public class PaymeInterfaceTest  {

	/** This is the entrance for test these class 
	 * @param args Command line arguments are not used by this program.*/
public static void main(String[] args) { 
	
	Payme[] payme = new Payme[6];
	payme[0] = new Invoice("22776","brakes",3,300);
	payme[1] = new Invoice("33442","gear",5,90.99);
	payme[2] = new SalariedProgrammer("Chioma","Zhang","345-67-0001", 0, 0, 320);
	payme[3] = new HourlyProgrammer("Amara", "Zhang","234-56-7770", 0, 0, 18.95, 40);
	payme[4] = new CommissionProgrammer("Peter", "Zhang", "123-45-6999", 0, 0, 16500, 0.44);
	payme[5] = new BasePlusCommissionProgrammer("Esther", "Zhang", "102-34-5888", 0, 0, 1200, 0.04, 720);

 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : payme) {
     System.out.printf("%s \n", currentPayme.toString());
     if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
    	BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
        double oldBaseSalary = programmer.getBaseSalary();
        programmer.setBaseSalary(1.10 * oldBaseSalary);
        System.out.printf(
                "new base salary with 10%% increase is: $%,.2f\n",
                programmer.getBaseSalary());
    	} 
     DecimalFormat df = new DecimalFormat("#,##0.00");
 	 String aymentAmountText = df.format(currentPayme.getPaymentAmount());
     // output currentPayme and its appropriate payment amount
     System.out.printf("%s: $%s\n\n","payment due",aymentAmountText);



 	}	
}
}


