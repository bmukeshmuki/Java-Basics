package org.RBI;

public class IndianBank {
private void customerName ()  {
	System.out.println("Customer name is Arun");
}
private void customerAddress() {
	System.out.println("Customer Address is Vellore");
}	

public static void main(String[] args) {
IndianBank x = new IndianBank();
x.customerName();x.customerAddress();
byte age = 25;
System.out.println("Customer age is" + age);
short birthYear = 1995;
System.out.println("Birth year :" + birthYear);
int adharNumber = 12345678;
System.out.println("Adhar number : " + adharNumber);
long accountNumber = 78945612345789l;
System.out.println("Account Number :" + accountNumber);
float accountBalance = 123.53f;
System.out.println("Account Balance =" + accountBalance);
double ledgerBalance = 100000.789546;
System.out.println("Ledger Balance :" + ledgerBalance);
char initial = 'A';
System.out.println("Customer Initial is " + initial);
boolean y = true;
System.out.println("Account is active : " + y);
String status = "Account is still active";
System.out.println(status);

}

}



