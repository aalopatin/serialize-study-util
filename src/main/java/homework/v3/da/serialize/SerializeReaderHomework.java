package homework.v3.da.serialize;

import homework.v3.entity.JsonFileClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializeReaderHomework {
    public JsonFileClass read(String fileName) throws IOException, ClassNotFoundException {
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (JsonFileClass) ois.readObject();
        }
    }
}
