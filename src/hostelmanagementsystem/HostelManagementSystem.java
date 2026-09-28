package hostelmanagementsystem;
public class HostelManagementSystem {
    public static void main(String[] args) {
        Hostel hostel1 = new Hostel(
        "H24",
        "Legacy Hostel",
        "Self-contained (Single)",
        800000,
        "Occupied",
        0.60398557,
        32.47622200
);

Hostel hostel2 = new Hostel(
        "H25",
        "Divine Hostel",
        "Self-contained (Single)",
        700000,
        "Occupied",
        0.60363355,
        32.47482400
);

Hostel hostel3 = new Hostel(
        "H26",
        "Vanessa Hostel",
        "Not self-contained (Single)",
        500000,
        "Occupied",
        0.60272031,
        32.47546300
);

Hostel hostel4 = new Hostel(
        "H27",
        "Mwegale Hostel",
        "Not self-contained (Single)",
        500000,
        "Partially Occupied",
        0.60115667,
        32.47451400
);
System.out.println("HOSTEL 1");
System.out.println("ID: " + hostel1.hostelId);
System.out.println("Name: " + hostel1.hostelName);
System.out.println("Accommodation Type: " + hostel1.accommodationType);
System.out.println("Rental Price: " + hostel1.rentalPrice);
System.out.println("Occupancy Status: " + hostel1.occupancyStatus);
System.out.println("Latitude: " + hostel1.latitude);
System.out.println("Longitude: " + hostel1.longitude);

System.out.println();

System.out.println("HOSTEL 2");
System.out.println("ID: " + hostel2.hostelId);
System.out.println("Name: " + hostel2.hostelName);
System.out.println("Accommodation Type: " + hostel2.accommodationType);
System.out.println("Rental Price: " + hostel2.rentalPrice);
System.out.println("Occupancy Status: " + hostel2.occupancyStatus);
System.out.println("Latitude: " + hostel2.latitude);
System.out.println("Longitude: " + hostel2.longitude);

System.out.println();

System.out.println("HOSTEL 3");
System.out.println("ID: " + hostel3.hostelId);
System.out.println("Name: " + hostel3.hostelName);
System.out.println("Accommodation Type: " + hostel3.accommodationType);
System.out.println("Rental Price: " + hostel3.rentalPrice);
System.out.println("Occupancy Status: " + hostel3.occupancyStatus);
System.out.println("Latitude: " + hostel3.latitude);
System.out.println("Longitude: " + hostel3.longitude);

System.out.println();

System.out.println("HOSTEL 4");
System.out.println("ID: " + hostel4.hostelId);
System.out.println("Name: " + hostel4.hostelName);
System.out.println("Accommodation Type: " + hostel4.accommodationType);
System.out.println("Rental Price: " + hostel4.rentalPrice);
System.out.println("Occupancy Status: " + hostel4.occupancyStatus);
System.out.println("Latitude: " + hostel4.latitude);
System.out.println("Longitude: " + hostel4.longitude);
double totalRentalPrice = hostel1.rentalPrice
        + hostel2.rentalPrice
        + hostel3.rentalPrice
        + hostel4.rentalPrice;

System.out.println();
System.out.println("Total Rental Price: " + totalRentalPrice);
// Calculate average rental price
double averageRentalPrice = totalRentalPrice / 4;

System.out.println("Average Rental Price: " + averageRentalPrice);


// Count fully occupied hostels
int fullyOccupied = 0;

if (hostel1.occupancyStatus.equals("Occupied")) {
    fullyOccupied++;
}

if (hostel2.occupancyStatus.equals("Occupied")) {
    fullyOccupied++;
}

if (hostel3.occupancyStatus.equals("Occupied")) {
    fullyOccupied++;
}

if (hostel4.occupancyStatus.equals("Occupied")) {
    fullyOccupied++;
}

System.out.println("Number of Fully Occupied Hostels: " + fullyOccupied);


// Count not fully occupied hostels
int notFullyOccupied = 0;

if (!hostel1.occupancyStatus.equals("Occupied")) {
    notFullyOccupied++;
}

if (!hostel2.occupancyStatus.equals("Occupied")) {
    notFullyOccupied++;
}

if (!hostel3.occupancyStatus.equals("Occupied")) {
    notFullyOccupied++;
}

if (!hostel4.occupancyStatus.equals("Occupied")) {
    notFullyOccupied++;
}

System.out.println("Number of Not Fully Occupied Hostels: " + notFullyOccupied);
    }
}
