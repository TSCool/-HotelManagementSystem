package hotel.serviceimp;

import java.util.List;

import hotel.entity.Custom;
import hotel.entity.Home;
import hotel.service.HomeMapper;
import hotel.util.GetSession;

public class HomeMapperimp implements HomeMapper {
	private hotel.dao.HomeMapper ho = GetSession.getsqlsession(true).getMapper(hotel.dao.HomeMapper.class);
	@Override
	public List<Home> selectall() {
		List<Home> list = ho.selectall();
		return list;
	}

	@Override
	public void insertone(Home home) {
		ho.insertone(home);
	}
	
}
