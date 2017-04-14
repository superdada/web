package com.db;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.table.*;

/**
 * Created by dada on 17-4-12.
 */
public class DatainfoMapper implements RowMapper<Datainfo>{
    public Datainfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Datainfo datainfo = new Datainfo();
        datainfo.setData_type(rs.getString("data_type"));
        datainfo.setData_name(rs.getString("data_name"));
        datainfo.setData_desc(rs.getString("data_desc"));
        datainfo.setData_time(rs.getString("data_time"));
        datainfo.setData_size(rs.getInt("data_size"));
        datainfo.setData_scope(rs.getString("data_scope"));
        return datainfo;
    }
}
