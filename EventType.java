public enum EventType {

    BIRTH(300_000),
    DEATH(500_000),
    WEDDING(600_000);

    private final int budget;

    EventType(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
