package hotel.serviceimp;

import java.util.List;
import hotel.entity.Custom;
import hotel.service.CustomMapper;
import hotel.util.GetSession;

public class CustomMapperimp implements CustomMapper {
	private hotel.dao.CustomMapper cus = GetSession.getsqlsession(true).getMapper(hotel.dao.CustomMapper.class);
	@Override
	public List<Custom> selectall() {
		List<Custom> list = cus.selectall();
		return list;
	}

	@Override
	public void insertone(Custom custom) {
		cus.insertone(custom);
	}
}
