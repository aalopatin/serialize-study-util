package homework.v3.externalize;

import java.io.*;

public class Path  implements Externalizable {
    
    public static final long SerialVersionUID = 1L;
    
    private String code;
    private String value;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(code);
        out.writeObject(value);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.setCode((String) in.readObject());
        this.setValue((String) in.readObject());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
