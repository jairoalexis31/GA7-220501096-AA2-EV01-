package inventory.dao;

import inventory.model.Product;
import java.util.List;

public interface ProductDao {
    void insertProduct(Product product);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(int productId);
}
