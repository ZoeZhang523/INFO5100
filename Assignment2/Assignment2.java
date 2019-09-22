package assignment2;

public class Assignment2 {
	
public static void main(String[] args) {
	
}
	/*
    This method should return the sum of salaries of employees having salary greater than 5000
    Note: Employee array is passed, not employee
 */
public double salaryGreaterThanFiveThousand(Employee[] employees) {
	double totalSalaries = 0;
	for(int i = 0, length = employees.length; i<length; i++){
		if(employees[i].getSalary() > 5000)
			totalSalaries = employees[i].getSalary() + totalSalaries;
	}
	return totalSalaries;
}


/*
    This method should print either "Fizz", "Buzz" or "FizzBuzz"
    "Fizz" - if id of employee is divisible by 3
    "Buzz" - if id of employee is divisible by 5
    "FizzBuzz" - if id of employee is divisible by both 3 and 5
 */
public void fizzBuzz(Employee employee) {
	if (employee.getId() % 3 == 0)
		System.out.println("Fizz");
	else if (employee.getId() % 5 == 0)
		System.out.println("Buzz");
	else 
		System.out.println("Fizzbuzz");
}


/*
    This method should calculate tax for an employee in dollars
    If salary of employee is less than or equal to 2500, tax should be 10%
    If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
    If salary of employee is greater than 5000, tax should be 35%
*/
public double calculateTax(Employee employee) {
	double tax = 0;
	double salary = employee.getSalary();
	if (salary <= 2500) {
		return tax = 0.1 * salary;
	}
	else if ((2500 < salary) && (salary <= 5000))
		return tax = 0.25 * salary;
	else return tax = 0.35 * salary;
    //System.out.println("The amount of the employee's tax is: " + tax);
}


/*
    We are given two employee objects.
    Implement this method to swap salaries of employees
*/
public void swap(Employee firstEmployee, Employee secondEmployee) {
	double firstSalary = firstEmployee.getSalary();
	double secondSalary = secondEmployee.getSalary();
	System.out.println("Before swapping, the fisrt employee's salary is: " + firstSalary); 
	System.out.println("The second employee's salary is: " + secondSalary);
	double temp = firstSalary;
	firstSalary = secondSalary;
	secondSalary = temp;
	System.out.println("After swapping, the fisrt employee's salary is: " + firstSalary); 
	System.out.println("The second employee's salary is: " + secondSalary);
}


/*
    Return number of employees whose age is greater than 50
    Note: Employee array is passed, not employee
 */
public int employeesAgeGreaterThan50(Employee[] employees) {
	int totalNum = 0;
	for(int i = 0, length = employees.length; i<length; i++){
		if(employees[i].getAge() > 50) {
			totalNum ++;
		}
	}
		return totalNum;
}


/*
    Implement this method to reverse firstName of employee.
    Ex. Before: employee.getFirstName() -> "John"
    After : employee.getFirstName() -> "nhoJ"
 */
public void reverseFirstName(Employee employee) {
	String reviseName = new StringBuffer(employee.getFirstName()).reverse().toString();
	System.out.println("The first name changes from " + employee.getFirstName() + " to " + reviseName);
}

/*
    Print "true" if employee's first name contain one or more digits
    Print "false" if employee's first name doesn't contain any digit
    Ex: employee.getFirstName() -> "ha8l" == true
    employee.getFirstName() -> "hail" == false
 */
public void isContainDigit(Employee employee) {
	String isDigit = employee.getFirstName();
	String num = ".*[0-9].*"; 
	if(isDigit.matches(num) == true)
		System.out.println("True");
	else
		System.out.println("False");
}


 /*
    Write a method to raise an employee's salary to three times of his/her original salary.
    Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
    DO NOT change the input in this method.
    Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
    Call this new method.
 */
public void tripleSalary(Employee employee) {
	employee.raiseSalary(3);
}


//Additional question for extra credit
/*
    Implement this method to convert String[] to employees array.
    Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
    This String array of length 2 contains 2 employees in form of string, where
    id = 1
    firstName=John
    age=24
    salary=7500
    convert each string to employee object.
    Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */
public Employee[] createEmployees(String[] employeesStr) {
    Employee[] employees = new Employee[employeesStr.length];
    for(int i = 0; i < employeesStr.length; i++) {
    	String eStr = employeesStr[i];
    	String[] eArr = eStr.split(",");
    	
    	int id = Integer.parseInt(eArr[0]);
    	String firstName = eArr[1];
    	int age = Integer.parseInt(eArr[2]);
    	double salary = Double.parseDouble(eArr[3]);
    	employees[i]= new Employee(id, firstName, age, salary);
    }   
    return employees;
} 
}
