package poly.basic;

public class CastingMain5 {
    public static void main(String[] args){
        Parent poly = new Child();
        System.out.println("poly");
        call(poly);

        System.out.println("parent");
        Parent parent = new Parent();
        call(parent);
    }

    private static void call(Parent parent){
        parent.parentMethod();

        if(parent instanceof Child){
            System.out.println("child instance");
            Child child = (Child)parent;
            child.childMethod();
        }
    }
}
