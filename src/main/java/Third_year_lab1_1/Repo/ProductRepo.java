package Third_year_lab1_1.Repo;

import Third_year_lab1_1.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product,Long> {
}
