module com.example.mcqueencop3330assignment4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.example.mcqueencop3330assignment4 to javafx.fxml;
    exports com.example.mcqueencop3330assignment4;
}