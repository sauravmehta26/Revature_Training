package Lab.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Spring uses Object Relational Mapping (ORM) to simplify database interactions. 
 * This class is mapped to a database table, and its fields correspond to table columns.
 */

@Entity // ✅ Marks this class as a JPA entity.
public class Product {
    
    @Id // ✅ Marks productID as the primary key.
    private long productID;
    
    private String name;
    private String description;

    public Product(long productID, String name, String description) {
        this.productID = productID;
        this.name = name;
        this.description = description;
    }

    public Product() {
        // No-args constructor required by JPA.
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
