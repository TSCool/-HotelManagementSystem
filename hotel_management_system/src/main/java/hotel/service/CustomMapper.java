package hotel.service;

import java.util.List;

import hotel.entity.Custom;

public interface CustomMapper {
	public List<Custom> selectall();
	public void insertone(Custom custom);
}
