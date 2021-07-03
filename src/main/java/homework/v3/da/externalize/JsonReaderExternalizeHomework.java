package homework.v3.da.externalize;

import homework.v3.externalize.JsonFileClassExternalize;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReaderExternalizeHomework {
    public JsonFileClassExternalize read(String url) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        final JsonFileClassExternalize jsonFileClassExternalize = mapper.readValue(new File(url), JsonFileClassExternalize.class);
        return jsonFileClassExternalize;
    }
}
