package com.example.store;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;
    private String details;
    private String image;

    public Product() {}

    public Product(int id, String name, double price, String details, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.details = details;
        this.image = image;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}

@Controller
public class ProductController {

    private List<Product> products = new ArrayList<>();

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("pageTitle", "قائمة المنتجات");
        model.addAttribute("products", products);
        return "products";
    }


    @GetMapping("/products/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }


    @PostMapping("/products/add")
    public String addProduct(@ModelAttribute Product product) {
        products.add(product);
        return "redirect:/products";
    }


    @GetMapping("/products/{id}")
    public String showProductDetails(@PathVariable int id, Model model) {
        Product selectedProduct = products.get(id);
        model.addAttribute("product", selectedProduct);
        return "product-details";
    }
}