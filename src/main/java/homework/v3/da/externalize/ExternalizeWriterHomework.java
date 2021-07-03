package homework.v3.da.externalize;

import homework.v3.externalize.JsonFileClassExternalize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizeWriterHomework {
    public void write(JsonFileClassExternalize parameters, String fileName) throws IOException {
        try(
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(parameters);
        }
    }
}
