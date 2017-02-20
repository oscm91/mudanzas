package mudanzas;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Collection;

public interface TrackRepository extends JpaRepository<TrackModel, Long>{
    Collection<TrackModel> findByTrakingIdLoader(int idLoader);
}
