package extend.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("publicMethod = " + publicValue);

    }

    protected void protectedMethod() {
        System.out.println("protectedMethod = " + protectedValue);

    }

    void defaultMethod() {
        System.out.println("11defaultMethod = " + defaultValue);
    }
    protected void privateMethod() {
        System.out.println("11privateMethod = " + privateValue);
    }
    public void printParent() {
        System.out.println("print parent");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        defaultMethod();
        privateMethod();
    }
}
