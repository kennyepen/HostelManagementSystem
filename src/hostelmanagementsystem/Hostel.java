package hostelmanagementsystem;
public class Hostel {
    String hostelId;
    String hostelName;
    String accommodationType;
    double rentalPrice;
    String occupancyStatus;
    double latitude;
    double longitude;
    
    public Hostel(String hostelId, String hostelName, String accommodationType,
              double rentalPrice, String occupancyStatus,
              double latitude, double longitude) {

    this.hostelId = hostelId;
    this.hostelName = hostelName;
    this.accommodationType = accommodationType;
    this.rentalPrice = rentalPrice;
    this.occupancyStatus = occupancyStatus;
    this.latitude = latitude;
    this.longitude = longitude;
  }
}
