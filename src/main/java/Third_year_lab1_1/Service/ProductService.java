package Third_year_lab1_1.Service;

import Third_year_lab1_1.Model.Product;
import Third_year_lab1_1.Repo.ProductRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public Product create(Product product) {
        product.setId(null);
        return productRepo.save(product);
    }
}
