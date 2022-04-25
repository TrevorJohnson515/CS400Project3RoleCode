import java.util.*;

public class ShortestPathFD implements IShortestPathFD {

    //private final CityDistanceBD backend;
    private String input;
    private int num;
    private final Scanner scnr;
    private List<String> availableCities; // data wrangler's job
    private int city1;
    private int city2;

    public ShortestPathFD(CityDistanceBD backend) {
        scnr = new Scanner(System.in);
        this.city1 = 21;
        this.city2 = 42;

        //this.city1 = city1;
        //this.city2 = city2;
    }


    @Override
    public void runCommandLoop() {
        System.out.println("Welcome to the City Shortest Path App!\n=================================");
        boolean running = true;
        do {
            displayCommandMenu();
            switch (scnr.next()) {
                case "a":
                case "1":
                    try {
                        listCities();
                    } catch (Exception e) {
                        System.out.println("can't list the cities, sorry m8");
                    }
                    break;
                case "c":
                case "2":
                    try {
                        addCities(city1, city2); //TODO implement method
                    } catch (Exception e) {
                        System.out.println("That city isn't here dude");
                    }
                    break;
                case "p":
                case "3":
                    try {
                        CityDistanceBD.getPathCities(listCityPath); // backend's job, not mine
                    } catch (Exception e) {
                        System.out.println("No cities in between or smth idk");
                    }
                    break;
                case "q":
                case "4":
                    System.out.println("see ya later dude");
                    running = false;
                    break;
                default:
                    displayCommandMenu();
                    break;
            }
        } while (running);
    }


    @Override
    public void displayCommandMenu() {
        System.out.println("Command Menu:\n1) [A]vailable cities\n2) [C]hoose an origin and destination city\n" +
                "3) [P]rint the shortest distance between cities\n4) [Q]uit");

    }

    // call method to read txt file || print all cities manually
    @Override
    public List<String> listCities() {
        List<String> listCities = new ArrayList<>();
        listCities.add(1, "Chicago");
        listCities.add(2, "New York");

        return listCities;

    }

    // TODO: need to work on placeholder class for backend to see how cities are being added
    @Override
    public int addCities(int city1, int city2) {
        return city1 + city2;
    }

    // TODO: figure out how algo engineer is doing this
    @Override
    public List<String> citiesBetween() {

        return null;
    }

    // TODO: figure out how algo engineer is doing this
    @Override
    public List<String> highwayNames() {
        return null;
    }
}
