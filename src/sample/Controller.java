package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField chatTextField;
    public TextArea chatTextArea;

    public void sendMessage(ActionEvent actionEvent) {
        Object source = (Button) actionEvent.getSource();
        final String message = chatTextField.getText();
        chatTextField.clear();
        chatTextArea.appendText("You: " + message + "\n");
    }
}