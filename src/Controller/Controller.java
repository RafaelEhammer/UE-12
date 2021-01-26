package Controller;

import Model.ColorCode;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import Model.Model;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML
    Button color = new Button();
    @FXML
    Label hex = new Label();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {}
    public static void show(Stage stage) throws IOException
    {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
            Parent root = fxmlLoader.load();

            stage.setTitle("Welcome");
            stage.setScene(new Scene(root,350,250));
            stage.show();

    }
    public void absoluteInput (KeyEvent event)
    {
        TextField txt = (TextField) event.getSource();
        if (event.getCode().getCode() >= 48 && event.getCode().getCode() <= 57)         //Auf Tipp von Kollege Bretbacher
        {
            if (txt.getId().contains("red"))
            {
                Model.changeColorViaAbsoluteValue(ColorCode.RED, Integer.parseInt(txt.getText()));
            }
            else if (txt.getId().contains("green"))
            {
                Model.changeColorViaAbsoluteValue(ColorCode.GREEN, Integer.parseInt(txt.getText()));
            }
            else{
                Model.changeColorViaAbsoluteValue(ColorCode.BLUE, Integer.parseInt(txt.getText()));
            }
        }
        else{
            txt.clear();
        }
        String hexCode = Model.getHex();
        hex.setText(hexCode);
        color.setStyle("-fx-background-color: " + hexCode + ";");
    }
    public static void relativeInput (Event event)
    {

    }
}
