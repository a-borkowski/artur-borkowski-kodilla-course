package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Transactional
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product p1 = new Product("Iron");
        Product p2 = new Product("Towel");
        Invoice invoice = new Invoice("FV1/2020");
        Item i1 = new Item(p1, new BigDecimal(100), 1,new BigDecimal(100));
        Item i2 = new Item(p2, new BigDecimal(200), 2,new BigDecimal(400));
        invoice.getItems().add(i1);
        invoice.getItems().add(i2);
        i1.setInvoice(invoice);
        i2.setInvoice(invoice);

        //When
        productDao.save(p1);
        productDao.save(p2);
        invoiceDao.save(invoice);
        itemDao.save(i1);
        itemDao.save(i2);

        //Then
        Assert.assertNotEquals(null, i1.getId());
        Assert.assertNotEquals(null, i1.getProduct().getId());

        //CleanUp
        itemDao.delete(i2);
        itemDao.delete(i1);
        invoiceDao.delete(invoice);
        productDao.delete(p2);
        productDao.delete(p1);
    }
}