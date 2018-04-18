package hotel.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class MyDruid_util implements DataSourceFactory {
	private Properties pro;

	@Override
	public DataSource getDataSource() {
		DruidDataSource data = null;
		try {
			data = (DruidDataSource) DruidDataSourceFactory.createDataSource(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void setProperties(Properties pro) {
		this.pro = pro;
		
	}

}
