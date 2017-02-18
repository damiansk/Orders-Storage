package application.java.model;


import application.java.dto.RepairDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OrdersOverviewModel {

    private ObservableList<RepairDTO> repairs;

    public OrdersOverviewModel() {
        repairs = FXCollections.observableArrayList();
    }

    public ObservableList<RepairDTO> getRepairs() {
        return repairs;
    }
    
}
