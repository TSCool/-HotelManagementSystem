package hotel.entity;

import java.text.SimpleDateFormat;

public class Home {
	private Integer homenum;
	private String type;
	private String money;
	private String come;
	private String go;
	public Home() {
		
	}
	public Home(Integer homenum,String type,String money, String come,String go) {
		this.homenum = homenum;
		this.type = type;
		this.money = money;
		this.come = come;
		this.go = go;
	}
	public Integer getHomenum() {
		return homenum;
	}
	public void setHomenum(Integer homenum) {
		this.homenum = homenum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getCome() {
		return come;
	}
	public void setCome(String come) {
		this.come = come;
	}
	public String getGo() {
		return go;
	}
	public void setGo(String go) {
		this.go = go;
	}
	@Override
	public String toString() {
		return "Home [homenum=" + homenum + ", type=" + type + ", money=" + money + ", come=" + come + ", go=" + go
				+ "]";
	}
}
