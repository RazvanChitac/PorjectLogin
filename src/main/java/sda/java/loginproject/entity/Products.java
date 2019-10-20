package sda.java.loginproject.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Products")
public class Products {
    private static final String PRODUCT_SEQUENCE = "product_id_seq";
    private static final String PRODUCT_GENERATOR = "product_generator";


    @Id
    @SequenceGenerator(name = PRODUCT_GENERATOR, sequenceName = PRODUCT_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PRODUCT_GENERATOR)

    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private int price;

    public Products() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return productName;
    }

    public void setDenumire(String denumire) {
        this.productName = denumire;
    }

    public int getPret() {
        return price;
    }

    public void setPret(int pret) {
        this.price = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return id == products.id &&
                price == products.price &&
                Objects.equals(productName, products.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, price);
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
