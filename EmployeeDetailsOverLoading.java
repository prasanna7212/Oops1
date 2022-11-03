
public class EmployeeDetailsOverLoading {
	public void employeeDetails(String employeeName) {
		System.out.println(employeeName);
	}
	public void employeeDetails(int employeeId) {
		System.out.println(employeeId);
	}
	public void employeeDetails(double employeeSalary) {
		System.out.println(employeeSalary);
	}
	public void employeeDetails(long employeePhoneNo) {
		System.out.println(employeePhoneNo);
	}
	public void employeeDetails(String employeeName,int employeeId,double employeeSalary,long employeePhoneNo) {
		System.out.println("employeeName"+employeeName+" "+"employeeId"+employeeId+" "+employeeSalary+"employeeSalary"+" "+"employeePhoneNo"+employeePhoneNo);
	}
	public static void main(String[] args) {
		EmployeeDetailsOverLoading details= new EmployeeDetailsOverLoading();
		details.employeeDetails("sakthiprasnna");
		details.employeeDetails(159753);
		details.employeeDetails(499999.99);
		details.employeeDetails(8890127631239L);
	}
}

		
	