package mudanzas;

public class ResultJsonDto {
    private int Id;
    private int maxTravels;
    private int totalWeight;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMaxTravels() {
        return maxTravels;
    }

    public void setMaxTravels(int maxTravels) {
        this.maxTravels = maxTravels;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
}
