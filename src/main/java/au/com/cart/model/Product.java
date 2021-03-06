package au.com.cart.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @Column(length = 20, nullable = false)
    @NotNull
    @NotEmpty
    private String code;
    @Column(nullable = false)
    private BigDecimal price;
    @Lob
    @Column(length = Integer.MAX_VALUE, nullable = true)
    private byte[] image;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @NotNull
    @NotEmpty
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
