package application.java.controllers;

import application.java.dto.RepairDTO;
import application.java.dto.ServiceDTO;
import application.java.model.OrdersOverviewModel;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class OrdersOverviewController {

    @FXML
    private TableView<RepairDTO> ordersTable;
    @FXML
    private TableColumn<RepairDTO, LocalDate> dataColumn;
    @FXML
    private TableColumn<RepairDTO, String> personColumn;

    @FXML
    private Label dataLabel;
    @FXML
    private Label personLabel;
    @FXML
    private Label brandLabel;
    @FXML
    private Label modelLabel;
    @FXML
    private Label registrationLabel;
    @FXML
    private Label capacityLabel;

    @FXML
    private TableView<ServiceDTO> partsTable;
    @FXML
    private TableColumn<ServiceDTO, String> partsColumn;
    @FXML
    private TableColumn<ServiceDTO, String> costPartsColumn;

    @FXML
    private TableView<ServiceDTO> repairsTable;
    @FXML
    private TableColumn<ServiceDTO, String> repairsColumn;
    @FXML
    private TableColumn<ServiceDTO, String> costRepairsColumn;

    @FXML
    private Label allCostsLabel;

    private OrdersOverviewModel ordersOverviewModel;

    public OrdersOverviewController() {
        ordersOverviewModel = new OrdersOverviewModel();
    }

    @FXML
    private void initialize() {
        setupRepairsList();

        if (!ordersOverviewModel.getRepairs().isEmpty()) {
            showRepairDetails(ordersOverviewModel.getRepairs().get(0));
        }
    }

    private void setupRepairsList() {
        dataColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDate()));
        personColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getCustomer().toString()));

        ordersTable.setItems(ordersOverviewModel.getRepairs());
        ordersTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showRepairDetails(newValue)
        );
    }

    private void showRepairDetails(RepairDTO repair) {
        dataLabel.setText(String.valueOf(repair.getDate()));
        personLabel.setText(repair.getCustomer().toString());
        brandLabel.setText(repair.getVehicle().getBrand());
        modelLabel.setText(repair.getVehicle().getModel());
        registrationLabel.setText(repair.getVehicle().getRegistration());
        capacityLabel.setText(repair.getVehicle().getCapacity());

        partsColumn.setCellValueFactory(cellData ->
                                    new SimpleObjectProperty<String>(cellData.getValue().getDescription()));
        costPartsColumn.setCellValueFactory(cellData ->
                                        new SimpleObjectProperty<String>(String.format("%.2f", cellData.getValue().getPrice())));
        partsTable.setItems(FXCollections.observableArrayList(repair.getParts()));

        repairsColumn.setCellValueFactory(cellData ->
                                        new SimpleObjectProperty<String>(cellData.getValue().getDescription()));
        costRepairsColumn.setCellValueFactory(cellData ->
                                            new SimpleObjectProperty<String>(String.format("%.2f", cellData.getValue().getPrice())));
        repairsTable.setItems(FXCollections.observableArrayList(repair.getRepairs()));

        allCostsLabel.setText(String.format("%.2f", repair.getCost()));
    }

    @FXML
    private void deleteChosenOrder() {

    }

    @FXML
    private void addNewOrder() {

    }

    @FXML
    private void openInExplorer() {
        try {
            String AbsolutePath = new File("").getAbsolutePath();
            Runtime.getRuntime().exec("explorer " + AbsolutePath + "\\Zlecenia\\");
        } catch (IOException e) {
            System.out.println(e.getClass().getName() + ": "
                    + e.getMessage());
        }
    }

    @FXML
    private void makePDFDocument() {

    }

}
