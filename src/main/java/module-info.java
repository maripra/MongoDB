module marta.miprimermongo {
    requires javafx.controls;
    requires javafx.fxml;


    opens marta.miprimermongo to javafx.fxml;
    exports marta.miprimermongo;
}