module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens br.sapiens to javafx.fxml;
    exports br.sapiens;
    exports br.sapiens.modelo;
    opens br.sapiens.modelo to javafx.fxml;
}