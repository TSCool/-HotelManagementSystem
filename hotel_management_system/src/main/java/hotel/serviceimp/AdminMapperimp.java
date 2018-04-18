package hotel.serviceimp;

import java.util.List;

import hotel.dao.AdminMapper;
import hotel.entity.Admin;
import hotel.util.GetSession;

public class AdminMapperimp implements AdminMapper {
	private AdminMapper admin;

	@Override
	public List selectall() {
		admin = GetSession.getsqlsession(false).getMapper(AdminMapper.class);
		List<Admin> list = admin.selectall();
		return list;
	}
	
}
