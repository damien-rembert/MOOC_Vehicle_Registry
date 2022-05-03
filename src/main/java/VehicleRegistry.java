import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry = new HashMap<>();


    //    assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter.
    //    If the license plate doesn't have an owner, the method returns true.
    //    If the license already has an owner attached, the method returns false and does nothing.
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    //    public String get(LicensePlate licensePlate) returns the owner of the car corresponding to the license plate received as a parameter.
    //    If the car isn't in the registry, the method returns null.
    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    //    public boolean remove(LicensePlate licensePlate) removes the license plate and attached data from the registry.
    //    The method returns true if removed successfully and false if the license plate wasn't in the registry.
    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    //     public void printLicensePlates()prints the license plates in the registry.
    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }
        System.out.println(registry.keySet());
    }
    //    public void printOwners() prints the owners of the cars in the registry.
    //    Each name should only be printed once, even if a particular person owns more than one car.
    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String owner : registry.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }

    }


    //
    //    Useful tip! In the printOwners method, you can create a list used for remembering the owners that were already printed.
    //    If an owner is not on the list,
    //    their name is printed and they are added to the list; conversely, if an owner is on the list, their name isn't printed.




}
