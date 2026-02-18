package com.klu.entity;
<<<<<<< HEAD

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
=======
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> e212664d958e7acb6ddaabd89b9dc1d619ede427
    private int id;

    private String name;
    private String description;
    private double price;
    private int quantity;
<<<<<<< HEAD

    public Product() {}

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    
    public int getId() {
    	return id; 
    	}
    public String getName() { 
    	return name; 
    	}
    public void setName(String name) { 
    	this.name = name;
    	}

    public String getDescription() {
    	return description; 
    	}
    public void setDescription(String description) { 
    	this.description = description;
    	}

    public double getPrice() {
    	return price;
    }
    public void setPrice(double price) { 
    	this.price = price; 
    }

    public int getQuantity() { 
    	return quantity;
    	}
    public void setQuantity(int quantity) { 
    	this.quantity = quantity;
    	}
}

=======
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
>>>>>>> e212664d958e7acb6ddaabd89b9dc1d619ede427
