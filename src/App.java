import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.layout.StackPane;  
import javafx.scene.text.Text;  
import javafx.stage.Stage;  
public class App extends Application{  
@Override  
public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    Text text = new Text();  
    text.setText("Hello !! Welcome Vignesh");  
    StackPane root = new StackPane();  
    Scene scene = new Scene(root,300,400);  
    root.getChildren().add(text);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Java Fx");  
    primaryStage.show();  
}  
public static void main(String[] args) {  
    launch(args);  
      
}  
} 