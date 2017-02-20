package mudanzas;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class TrackNotFoundException extends RuntimeException {
	public TrackNotFoundException(int idLoader) {
		super("could not find track '" + String.valueOf(idLoader) + "'.");
	}
}