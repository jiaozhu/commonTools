package org.jiaozhu.commonTools.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 结果集处理类
 * @author gitview@gmail.com
 *
 */
public interface RsHandler<T> {
	public T handle(ResultSet rs) throws SQLException;
}
