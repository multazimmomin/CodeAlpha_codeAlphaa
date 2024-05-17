package task3;

import java.util.*;

// Class to represent a destination with its details
class Destination {
    private String name;
    private String description;

    public Destination(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

// Class to represent a travel itinerary
class TravelItinerary {
    private List<Destination> destinations;
    private Date startDate;
    private Date endDate;
    private double budget;

    public TravelItinerary(Date startDate, Date endDate, double budget) {
        this.destinations = new ArrayList<>();
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getBudget() {
        return budget;
    }
}

public class TravelPlanner {
    public static void main(String[] args) {
        // Sample destinations
        Destination paris = new Destination("Paris", "The city of lights");
        Destination rome = new Destination("Rome", "The eternal city");

        // Sample dates and budget
        Date startDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        Date endDate = calendar.getTime();
        double budget = 2000.0;

        // Create a travel itinerary
        TravelItinerary itinerary = new TravelItinerary(startDate, endDate, budget);
        itinerary.addDestination(paris);
        itinerary.addDestination(rome);

        // Display the travel itinerary
        System.out.println("Travel Itinerary:");
        System.out.println("Start Date: " + itinerary.getStartDate());
        System.out.println("End Date: " + itinerary.getEndDate());
        System.out.println("Budget: $" + itinerary.getBudget());
        System.out.println("Destinations:");
        for (Destination destination : itinerary.getDestinations()) {
            System.out.println(destination.getName() + ": " + destination.getDescription());
        }
    }
}
