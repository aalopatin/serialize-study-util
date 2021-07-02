package homework.v3.da.serialize;

import homework.v3.entity.JsonFileClass;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonWriterHomework {
    public void write(JsonFileClass jsonFileClass, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), jsonFileClass);
    }
}
