package com.db;
import javax.sql.DataSource;
import java.util.List;
import com.table.*;
/**
 * Created by dada on 17-4-12.
 */

public interface DatainfoDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to list down
     * all the records from the datainfo table.
     */
    public List<Datainfo> listdatainfos();
}
