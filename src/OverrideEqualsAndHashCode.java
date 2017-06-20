/**
 * Created by java_dev on 24.04.17.
 */
public class OverrideEqualsAndHashCode {
    private int id = 12345;
    private String name = "Name";

    public OverrideEqualsAndHashCode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        //You can finish here, if it does not matter what's inside.
        if (!(o instanceof OverrideEqualsAndHashCode)) {
            return false;
        }
        OverrideEqualsAndHashCode over = (OverrideEqualsAndHashCode) o;
        return id == over.id && name.equals(over.name);

    }

    @Override
    public  int hashCode()  {
        final int PRIME = 31;
        int result = 1;
        result = PRIME*result + id;
        return result;
    }
}

