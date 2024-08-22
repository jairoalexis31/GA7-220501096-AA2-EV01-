package inventory.Controller;

import inventory.dao.ProductDao;
import inventory.dao.ProductDaoimpl;
import inventory.model.Product;

import java.util.List;

public class ProductController {
    private ProductDao productDao;

    public ProductController() {
        this.productDao = new ProductDaoimpl();
    }

    public void addProduct(String name, int quantity, double price) {
        Product product = new Product(0, name, quantity, price);
        productDao.insertProduct(product);
    }

    public List<Product> viewAllProducts() {
        return productDao.getAllProducts();
    }

    public void updateProduct(int id, String name, int quantity, double price) {
        Product product = new Product(id, name, quantity, price);
        productDao.updateProduct(product);
    }

    public void removeProduct(int id) {
        productDao.deleteProduct(id);
    }
}
