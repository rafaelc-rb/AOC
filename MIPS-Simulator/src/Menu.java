  
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fm = new FXMLLoader(getClass().getResource("scrns/Entry.fxml"));
        Parent root = fm.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("MIPS Processor Simulator");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
