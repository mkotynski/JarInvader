package types;

public class MyClass {
    private Class<?> xClass;
    private boolean added;

    public MyClass(Class<?> xClass, boolean added) {
        this.xClass = xClass;
        this.added = added;
    }

    public void setxClass(Class<?> xClass) {
        this.xClass = xClass;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }

    public Class<?> getxClass() {
        return xClass;
    }

    public boolean isAdded() {
        return added;
    }
}
