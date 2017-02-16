package application.java.dto;


import java.time.LocalDate;
import java.util.List;

public class RepairDTO {

    private PersonDTO customer;
    private VehicleDTO vehicle;
    private LocalDate date;
    private List<ServiceDTO> repairs;
    private List<ServiceDTO> parts;

    public PersonDTO getCustomer() {
        return customer;
    }

    public void setCustomer(PersonDTO customer) {
        this.customer = customer;
    }

    public VehicleDTO getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDTO vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<ServiceDTO> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<ServiceDTO> repairs) {
        this.repairs = repairs;
    }

    public List<ServiceDTO> getParts() {
        return parts;
    }

    public void setParts(List<ServiceDTO> parts) {
        this.parts = parts;
    }
}
