package homework.v3.externalize;

import java.io.*;
import java.util.List;

public class Bundle implements Externalizable {
    
    public static final long SerialVersionUID = 1L;
    
    private List<Path> path;
    private List<String> values;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(path);
        out.writeObject(values);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.setPath((List<Path>) in.readObject());
        this.setValues((List<String>) in.readObject());
    }

    public List<Path> getPath() {
        return path;
    }
    public void setPath(List<Path> path) {
        this.path = path;
    }

    public List<String> getValues() {
        return values;
    }
    public void setValues(List<String> values) {
        this.values = values;
    }
}
