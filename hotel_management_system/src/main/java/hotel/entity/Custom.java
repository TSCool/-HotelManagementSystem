package hotel.entity;

public class Custom {
	private String name;
	private String phone;
	private String sex;
	private String address;
	private String idcard;
	public Custom() {
		
	}
	public Custom(String name,String phone,String sex,String address,String idcard) {
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.address = address;
		this.idcard = idcard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	@Override
	public String toString() {
		return "Custom [name=" + name + ", phone=" + phone + ", sex=" + sex + ", address=" + address + ", idcard="
				+ idcard + "]";
	}
}
