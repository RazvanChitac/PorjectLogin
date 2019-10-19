package sda.java.loginproject.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Stock")
public class Stock {
    private static final String STOCK_SEQUENCE = "stock_id_seq";
    private static final String STOCK_GENERATOR = "stock_generator";

    @Id
    @SequenceGenerator(name = STOCK_GENERATOR , sequenceName = STOCK_SEQUENCE )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = STOCK_GENERATOR )
    private int id;

    @Column(name = "nrPieces")
    private String nrPieces;

    public Stock() {
    }

    public Stock(int id, String nrPieces) {
        this.id = id;
        this.nrPieces = nrPieces;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrPieces() {
        return nrPieces;
    }

    public void setNrPieces(String nrPieces) {
        this.nrPieces = nrPieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return id == stock.id &&
                Objects.equals(nrPieces, stock.nrPieces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nrPieces);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", nrPieces='" + nrPieces + '\'' +
                '}';
    }
}
