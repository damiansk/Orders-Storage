package application.java.dto;


public class VehicleDTO {

    private String brand;
    private String model;
    private String registration;
    private String capacity;

    public VehicleDTO() {
        brand = "";
        model = "";
        registration = "";
        capacity = "";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
