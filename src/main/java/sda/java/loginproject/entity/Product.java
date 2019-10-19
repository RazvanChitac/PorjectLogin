package sda.java.loginproject.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Product")
public class Product {
    private static final String PRODUCT_SEQUENCE = "product_id_seq";
    private static final String PRODUCT_GENERATOR = "product_generator";


    @Id
    @SequenceGenerator(name = PRODUCT_GENERATOR, sequenceName = PRODUCT_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PRODUCT_GENERATOR)

    private int id;

    @Column(name = "denumire")
    private String denumire;


    @Column(name = "pret")
    private int pret;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                pret == product.pret &&
                Objects.equals(denumire, product.denumire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, denumire, pret);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
