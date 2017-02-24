package rest.domain.doa.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by User on 2016-10-22.
 */
@Entity
public class Price {

    @Id
    private int id;
    private String description;
    private int rank_id;
    private float price;
    private int area_from;
    private int area_to;
    private Date effective_from;
    private Date effective_to;

    public Price() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRank_id() {
        return rank_id;
    }

    public void setRank_id(int rank_id) {
        this.rank_id = rank_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getArea_from() {
        return area_from;
    }

    public void setArea_from(int area_from) {
        this.area_from = area_from;
    }

    public int getArea_to() {
        return area_to;
    }

    public void setArea_to(int area_to) {
        this.area_to = area_to;
    }

    public Date getEffective_from() {
        return effective_from;
    }

    public void setEffective_from(Date effective_from) {
        this.effective_from = effective_from;
    }

    public Date getEffective_to() {
        return effective_to;
    }

    public void setEffective_to(Date effective_to) {
        this.effective_to = effective_to;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
