package homework.v3.da.externalize;

import homework.v3.externalize.JsonFileClassExternalize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizeReaderHomework {
    public JsonFileClassExternalize read(String fileName) throws IOException, ClassNotFoundException {
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (JsonFileClassExternalize) ois.readObject();
        }
    }
}
