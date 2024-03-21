import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{

    int sayacInt;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("İlk JavaFX Pencerem");
        
        FlowPane root = new FlowPane();
        Scene ilkScene = new Scene(root,300,300);

        ObservableList<Node> rootNode = root.getChildren();
        
        Button buton1 = new Button("Tamam");
        Button buton2 = new Button("Hadi Bakalım Öyle Olsun");
        Button buton3 = new Button("Olur");

        Label label1 = new Label("Sen de mi Label?");
        Label label2 = new Label("Ben de...");
        Label label3 = new Label("");

        Label sayac = new Label("0");
        sayacInt = 0;

        rootNode.addAll(buton1,buton2,buton3,label1,label2,sayac,label3);

        buton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label1.setText(label1.getText() + " " + label2.getText());
            }
        });

        buton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                sayacInt++;
                sayac.setText("" + sayacInt);

                if(sayacInt > 5) {
                    sayac.setFont(Font.font("Bauhaus 93"));
                }
            }
        });

        ilkScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                label3.setText(label3.getText() + event.getText());
            }
        });
        

        stage.setScene(ilkScene);
        stage.show();
    }
}
