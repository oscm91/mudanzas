package mudanzas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TrackModel {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne
    private TrackingModel traking;

    public Long getId() {
        return id;
    }

    private float weight;
    private int maxTravels;


    public TrackingModel getTraking() {
        return traking;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getMaxTravels() {
        return maxTravels;
    }

    public void setMaxTravels(int maxTravels) {
        this.maxTravels = maxTravels;
    }
}
