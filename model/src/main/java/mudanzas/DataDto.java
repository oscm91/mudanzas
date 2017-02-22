package mudanzas;

import java.util.List;

public class DataDto {

    private Integer days;
    private List<DataItemDto> items;

    public int getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public List<DataItemDto> getItems() {
        return items;
    }

    public void setItems(List<DataItemDto> items) {
        this.items = items;
    }
}
