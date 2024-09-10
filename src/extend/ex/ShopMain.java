package extend.ex;

public class ShopMain {
    public static void main(String[] args) {
        Album album = new Album("java", 10000, "kim", "sdfsd");
        Book book = new Book("album", 15000, "soe");
        Movie movie = new Movie("movie", 1232, "kim", "seo");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("sum = " + sum);
    }
}

/*
* class Child extends Parent {
    String name = "Child";

    void printNames() {
        System.out.println("Child name: " + name); // 자식 클래스의 name 참조
        System.out.println("Parent name: " + super.name); // 부모 클래스의 name 참조
    }
}
*
* class Parent {
    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display method");
    }

    void show() {
        super.display(); // 부모 클래스의 display() 호출
        display(); // 자식 클래스의 display() 호출
    }
}*
*  */