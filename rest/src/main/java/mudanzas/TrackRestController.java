package mudanzas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
class TrackRestController {

	private final int MIN_WEIGHT = 50;

	@Autowired
	TrackRestController() {
	}

	@RequestMapping(method = RequestMethod.POST, value = "/trackings")
	Collection<ResultJsonDto> readTrackings(@RequestBody DataDto data) {
		List<ResultJsonDto> listResultJsonDto = new ArrayList<ResultJsonDto>();

		Integer totalWeight = 0;

		for (int _index = 0; _index < data.getItems().size(); _index++){
			ResultJsonDto resultJsonDto = new ResultJsonDto();
			DataItemDto weightItems = data.getItems().get(_index);
			List<Integer> weightItemsAux = new ArrayList<>(data.getItems().get(_index).getValues());

			Collections.sort(weightItems.getValues());

			Integer higherWeight = Collections.max(weightItemsAux);
			Integer numTravels = 0;
			Integer numItemInBox = 1;

			for (int _indexWeight = 0; _indexWeight < weightItems.getValues().size(); _indexWeight++){
				totalWeight += weightItems.getValues().get(_indexWeight);

				if((higherWeight * numItemInBox) >= MIN_WEIGHT){
					numTravels++;
					weightItemsAux.remove(higherWeight);
					numItemInBox = 0;
					if((_indexWeight + 1) < weightItems.getValues().size()){
						higherWeight = Collections.max(weightItemsAux);
					}else{
						higherWeight = Collections.max(weightItemsAux);
					}
				}

				numItemInBox++;
			}

			resultJsonDto.setId(_index + 1);
			resultJsonDto.setMaxTravels(numTravels);
			resultJsonDto.setTotalWeight(totalWeight);

			listResultJsonDto.add(resultJsonDto);
		}

		return listResultJsonDto;
	}
}