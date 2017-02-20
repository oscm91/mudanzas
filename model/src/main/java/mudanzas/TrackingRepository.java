package mudanzas;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TrackingRepository extends JpaRepository<TrackingModel, Long>{
    Optional<TrackingModel> findByIdLoader(int idLoader);
}
