package mudanzas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TrackingModel {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "traking")
    private Set<TrackModel> track = new HashSet<>();

    private int idLoader;
    private Date date;
    private int numDays;

    public Long getId() {
        return id;
    }

    public Set<TrackModel> getTrack() {
        return track;
    }

    public int getIdLoader() {
        return idLoader;
    }

    public void setIdLoader(int idLoader) {
        this.idLoader = idLoader;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }
}
