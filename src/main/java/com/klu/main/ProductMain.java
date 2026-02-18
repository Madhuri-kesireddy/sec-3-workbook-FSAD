package com.klu.main;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.entity.Product;
import com.klu.util.HibernateUtil;
public class ProductMain {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        
        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("Gaming Laptop");
        product.setPrice(75000);
        product.setQuantity(10);

        int productId = (int) session.save(product);
        System.out.println("Product inserted with ID: " + productId);

        Product fetchedProduct = session.get(Product.class, productId);
        System.out.println("Fetched Product: " + fetchedProduct.getName());

      
        fetchedProduct.setPrice(72000);
        fetchedProduct.setQuantity(8);
        session.update(fetchedProduct);
        System.out.println("Product updated");

     
        session.delete(fetchedProduct);
        System.out.println("Product deleted");

        tx.commit();
        session.close();

        HibernateUtil.getSessionFactory().close();
    }
}
