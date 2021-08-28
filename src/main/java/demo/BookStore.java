package demo;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        Customer customer = new Customer();

        BookStore bookStore = new BookStore();

        bookStore.buy(customer);
    }

    private void buy(Customer customer) {
        Book book1 = new Book();
        Book book2 = new Book();

        // add book to basket
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Basket basket = new Basket(customer);
        basket.addBooks(books);

        //calculate max discount
        Discount discount = new Discount();
        int maxDiscount = discount.calculate(basket);
    }
}
