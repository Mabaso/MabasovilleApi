package rest.domain.doa.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by User on 2016-10-21.
 */
@Entity
public class Areas {

    @Id
    int id;
    String description;
    Date effective_from;
    Date effective_to;
    String img_url;

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

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
