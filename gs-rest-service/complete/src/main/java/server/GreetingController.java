package server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.db.DatainfoJDBCTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.table.Datainfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private DatainfoJDBCTemplate datainfoJDBCTemplate;
    @Autowired
    public GreetingController(DatainfoJDBCTemplate datainfoJDBCTemplate){
        this.datainfoJDBCTemplate = datainfoJDBCTemplate;
    }
    @RequestMapping("/haha")
    public String haha(){
        return "haha";
    }



    @RequestMapping("/testing")
    public String testing() throws JsonProcessingException {
        System.out.println("test");
        List<Datainfo> datainfos = datainfoJDBCTemplate.listdatainfos();

        Map<String,List<Datainfo>> dataintros = new HashMap<String,List<Datainfo>>();
        List<Datainfo> datainfos_type = null;

        String data_type = null;

        for (Datainfo record : datainfos) {
            if(data_type == null) {
                datainfos_type = new ArrayList<Datainfo>();
                data_type = record.getData_type();
            }else if(!data_type.equals(record.getData_type())){
                dataintros.put(data_type,datainfos_type);
                data_type = record.getData_type();
                datainfos_type = new ArrayList<Datainfo>();
            }
            datainfos_type.add(record);
        }
        dataintros.put(data_type,datainfos_type);

        ObjectMapper mapper = new ObjectMapper();
        String jsonfromMap =  mapper.writeValueAsString(dataintros);
        System.out.println(jsonfromMap);

        return jsonfromMap;
    }
}
