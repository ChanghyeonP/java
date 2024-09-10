package extend.ex;

import extend.ex.Item;

public class Book extends Item {
    private String artist;

    public Book(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("아티스트 : " + artist );
    }
}