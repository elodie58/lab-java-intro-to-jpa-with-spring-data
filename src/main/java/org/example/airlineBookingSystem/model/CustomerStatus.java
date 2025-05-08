package org.example.airlineBookingSystem.model;
public enum CustomerStatus {
    GOLD,
    SILVER,
    NONE;


    public String getStatusMessage() {
        switch(this) {
            case GOLD:
                return "Gold member status";
            case SILVER:
                return "Silver member status";
            case NONE:
                return "No member status";
            default:
                return "Unknown status";
        }
    }
}
