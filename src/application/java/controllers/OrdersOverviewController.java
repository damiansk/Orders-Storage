package application.java.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class OrdersOverviewController {

	@FXML
	private TableView<Object> ordersTable;
	@FXML
	private TableColumn<Object, LocalDate> dataColumn;
	@FXML
	private TableColumn<Object, String> personColumn;
	
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
	private TableView<Object> partsTable;
	@FXML
	private TableColumn<Object, String> partsColumn;
	@FXML
	private TableColumn<Object, String> costPartsColumn;
	
	@FXML
	private TableView<Object> repairsTable;
	@FXML
	private TableColumn<Object, String> repairsColumn;
	@FXML
	private TableColumn<Object, String> costRepairsColumn;
	
	@FXML
	private Label allCostsLabel;

	
	
	public OrdersOverviewController() {}
	
	@FXML
	private void initialize() {

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
