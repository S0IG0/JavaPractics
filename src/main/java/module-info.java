module ru.soigo.javamirea {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ru.soigo.javamirea to javafx.fxml;
    exports ru.soigo.javamirea;
}