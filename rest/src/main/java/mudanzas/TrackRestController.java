package mudanzas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.sound.midi.Track;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

@RestController
@RequestMapping("/api")
class TrackRestController {

	private final TrackRepository trackRepository;

	private final TrackingRepository trackingRepository;

	@Autowired
	TrackRestController(TrackRepository trackRepository, TrackingRepository trackingRepository) {
		this.trackRepository = trackRepository;
		this.trackingRepository = trackingRepository;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/trackings")
	Collection<TrackingModel> readTrackings() {
		TrackingModel trackingModel = new TrackingModel();
		trackingModel.setDate(new Date());
		trackingModel.setNumDays(5);
		return Arrays.asList(trackingModel);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/tracking/{idTracking}")
	TrackingModel readTrackingId(@PathVariable Long idTracking) {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/tracking/{idTracking}/tracks")
	Collection<TrackModel> readTracks() {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/tracking/{idTracking}/track/{idTrack}")
	TrackModel readTrackId(@PathVariable Long idTrack) {
		return null;
	}

	private void validateTracking(int idLoader) {
		this.trackingRepository.findByIdLoader(idLoader).orElseThrow(() -> new TrackNotFoundException(idLoader));
	}
}