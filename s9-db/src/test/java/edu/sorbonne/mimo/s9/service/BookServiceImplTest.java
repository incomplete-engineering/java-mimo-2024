package edu.sorbonne.mimo.s9.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookServiceImplTest {

    @Test
    void testComputePrice() {

        int price = 9;
        int units = 2;

        BookServiceImpl bookService = new BookServiceImpl(null, null, null);
        int computed = bookService.computePrice(price, units);

        Assertions.assertEquals(54, computed);
    }
}
