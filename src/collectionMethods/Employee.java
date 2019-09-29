package collectionMethods;

public class Employee implements Comparable<Employee>{
	
	//veza Application2 klasa
	
	//nakon sto smo implementirali Comparable interface, addamo unimplemented metode preko klika na Employee kad pokaze podcrtano(nize gdje pocinje override)
	
	String name;
	int salary;
	String department;
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	//definiramo kriterij po kojem zelimo sortirati, u ovom slucaju je placa zaposlenika
	@Override
	public int compareTo(Employee o) {
		if(this.salary < o.salary) {
			return -1;
		} else if(this.salary > o.salary) {
			return 1;
			//sa ovim usporedbama i return -1 pa return 1, komanda ce sortirati od manje prema vecoj placi
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	

}
