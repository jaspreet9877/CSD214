module com.example.csdd214 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.csd214 to javafx.fxml;
    exports com.example.csd214;
    exports Model;
    opens Model to javafx.fxml;

    //exports com.example.csd214;
    opens com.example.csd214.Model to javafx.fxml;
    exports com.example.csd214.Model;
}