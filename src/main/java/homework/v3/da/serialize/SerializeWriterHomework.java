package homework.v3.da.serialize;

import homework.v3.entity.JsonFileClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeWriterHomework {
    public void write(JsonFileClass parameters, String fileName) throws IOException {
        try(
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(parameters);
        }
    }

}
