package hotel.service;

import java.util.List;

import hotel.entity.Home;

public interface HomeMapper {
	public List<Home> selectall();
	public void insertone(Home home);
}
