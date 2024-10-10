package com.controllers;
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MainController {
    public void handleExit(ActionEvent event) {
        System.exit(0);
    }

    public void showCustomers(ActionEvent event) throws Exception {
        Parent customerView = FXMLLoader.load(getClass().getResource("/view/CustomersView.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(new Scene(customerView));
    }

    public void showStock(ActionEvent event) throws Exception {
        Parent stockView = FXMLLoader.load(getClass().getResource("/view/StockView.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(new Scene(stockView));
    }

    public void showOrders(ActionEvent event) throws Exception {
        Parent ordersView = FXMLLoader.load(getClass().getResource("/view/OrdersView.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(new Scene(ordersView));
    }

    public void showPayments(ActionEvent event) throws Exception {
        Parent paymentsView = FXMLLoader.load(getClass().getResource("/view/PaymentView.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(new Scene(paymentsView));
    }
}
