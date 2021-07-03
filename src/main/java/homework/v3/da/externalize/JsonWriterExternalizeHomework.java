package homework.v3.da.externalize;

import homework.v3.externalize.JsonFileClassExternalize;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonWriterExternalizeHomework {
    public void write(JsonFileClassExternalize jsonFileClass, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), jsonFileClass);
    }
}
