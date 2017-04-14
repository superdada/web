package com.db;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.table.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by dada on 17-4-12.
 */
@Component
public class DatainfoJDBCTemplate implements DatainfoDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public List<Datainfo> listdatainfos() {
        String SQL = "select * from supermarket_datainfo order by data_type";
        List <Datainfo> students = jdbcTemplateObject.query(SQL,
                new DatainfoMapper());
        return students;
    }
}
