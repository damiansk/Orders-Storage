package application.java.dto;


import java.time.LocalDate;
import java.util.List;

public class RepairDTO {

    private PersonDTO customer;
    private VehicleDTO vehicle;
    private LocalDate date;
    private List<ServiceDTO> repairs;
    private List<ServiceDTO> parts;
    private EmployeeDTO employee;

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

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    public float getCost() {
        float cost = 0;

        for (ServiceDTO repair: repairs) {
            cost += repair.getPrice();
        }

        for (ServiceDTO part: parts) {
            cost += part.getPrice();
        }

        return cost;
    }

}
