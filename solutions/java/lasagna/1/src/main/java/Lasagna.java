public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int actualMinutes) {
        return 40-actualMinutes;
    }
    public int preparationTimeInMinutes(int numberOfLayers) {
        return 2*numberOfLayers;
    }
    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes) {
        return numberOfMinutes + 2*numberOfLayers;
    }
}
