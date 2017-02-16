package application.java.dto;


public class EmployeeDTO extends PersonDTO {

    private String address;
    private String phone;
    private String nip;
    private String regon;
    private String company;

    public EmployeeDTO() {
        address = "";
        phone = "";
        nip = "";
        regon = "";
        company = "";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
