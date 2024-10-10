package com.controllers;

package controller;

import dao.CustomerDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Customers;

public class CustomersController {
    @FXML
    private TableView<Customers> customersTable;
    @FXML
    private TableColumn<Customers, Integer> columnCustomerId;
    @FXML
    private TableColumn<Customers, String> columnName;
    @FXML
    private TableColumn<Customers, String> columnAddress;
    @FXML
    private TableColumn<Customers, Integer> columnPhone;
    @FXML
    private TableColumn<Customers, String> columnEmail;
    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField emailField;

    private CustomerDAO customerDAO = new CustomerDAO();
    private ObservableList<Customers> customersList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        columnCustomerId.setCellValueFactory(cellData -> cellData.getValue().getCustomerId().asObject());
        columnName.setCellValueFactory(cellData -> cellData.getValue().getNameCustomer());
        columnAddress.setCellValueFactory(cellData -> cellData.getValue().getAddress());
        columnPhone.setCellValueFactory(cellData -> cellData.getValue().getPhone().asObject());
        columnEmail.setCellValueFactory(cellData -> cellData.getValue().getEmail());
        loadCustomersData();
    }

    private void loadCustomersData() {
        customersList.clear();
        customersList.addAll(customerDAO.getAllCustomers());
        customersTable.setItems(customersList);
    }

    @FXML
    private void addCustomer() {
        Customers newCustomer = new Customers(
                0,
                nameField.getText(),
                addressField.getText(),
                Integer.parseInt(phoneField.getText()),
                emailField.getText());
        customerDAO.addCustomer(newCustomer);
        loadCustomersData();
    }
}
