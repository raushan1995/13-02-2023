class Employee {
   
	float salary = 25000;
}

class Analyst extends Employee{
	
	int bonus = 2000;
	
	public static void main(String args[]) {
		Analyst a = new Analyst();
		
		System.out.println("Salary"+a.salary);
		System.out.println("Bonus"+a.bonus);
	}
}
