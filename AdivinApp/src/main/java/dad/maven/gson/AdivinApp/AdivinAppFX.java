package dad.maven.gson.AdivinApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AdivinAppFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// creamos la etiqueta para mostrar el texto
		Label saludoLabel = new Label();
		saludoLabel.setText("Introduce un numero del 1 al 100");
		saludoLabel.setLayoutX(20); // coordenada x de la etiqueta
		saludoLabel.setLayoutY(20); // coordenada y de la etiqueta
		
		// creamos el botón para saludar
		Button comprobarButton = new Button();
		comprobarButton.setText("Comprobar");
		comprobarButton.setTooltip(new Tooltip("Cuando me pulses te saludo")); // establecemos un tooltip para el botón de saludar
		comprobarButton.setLayoutX(20); // coordenada x del botón
		comprobarButton.setLayoutY(80); // coordenada y del botón
		comprobarButton.setOnAction(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!"));
		
//		saludarButton.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent e) {
//				saludoLabel.setText("¡¡¡Hola Mundo!!!");
//			}
//		});
		
		// creamos el panel
		Pane root = new Pane();
		root.getChildren().addAll(saludoLabel, comprobarButton); // añadimos los componentes al panel

		// creamos la escena con su panel raíz
		Scene escena = new Scene(root, 320, 200);
		
		// en este caso el Stage no lo creamos nosotros, nos lo da JavaFX
		primaryStage.setScene(escena); // ponemos la escena
		primaryStage.setTitle("Hola Mundo con JavaFX"); // ponemos título a la ventana
		primaryStage.setResizable(false); // hacer que la ventana no sea redimensionable
		primaryStage.show(); // mostramos la escena
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
