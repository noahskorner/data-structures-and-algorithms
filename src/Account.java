import java.util.UUID;

public class Account {
	private UUID id;
	private String name;
	private String email;
	private String username;
	private String password;
	private String address;
	private String city;
	private String state;
	private String zip;
	private int paymentInfo;
	private Orders orders;
	
	public Account(UUID _id, String _name, String _email, String _username, String _password, String _address, 
			String _city, String _state, String _zip, int _paymentInfo, Orders _orders) 
	{
		this.id = _id;
		this.name = _name;
		this.username = _username;
		this.email = _email;
		this.password = _password;
		this.address = _address;
		this.city = _city;
		this.state = _state;
		this.zip = _zip;
		this.paymentInfo = _paymentInfo;
		this.orders = _orders;
	}
	
	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public int getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(int paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nId: " + this.id;
	}
}
