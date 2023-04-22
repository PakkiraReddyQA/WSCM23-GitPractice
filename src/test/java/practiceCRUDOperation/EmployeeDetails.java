package practiceCRUDOperation;

public class EmployeeDetails {
	
	String name;
	String mail;
	int phone;
	String empID;
	public EmployeeDetails(String name, String mail, int phone, String empID) {
		this.name = name;
		this.mail = mail;
		this.phone = phone;
		this.empID = empID;
	}
	public EmployeeDetails()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	

}
