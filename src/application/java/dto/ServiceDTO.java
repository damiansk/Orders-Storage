package application.java.dto;


public class ServiceDTO {

    private String description;
    private float price;


    public ServiceDTO() {
        description = "";
        price = 0.00f;
    }

    public ServiceDTO(String description, float price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
