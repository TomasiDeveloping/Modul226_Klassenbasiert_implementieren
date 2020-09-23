package application;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ButtonHandling {
	// Funktion um den Button zu vergrössern wenn mit der Maus in den Button gefahren wird
	public void zoomIn(Button button) {
		button.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				button.setScaleX(1.1);
				button.setScaleY(1.1);
				}
		});
		}
	// Funktion um den Button zu verkleinern wen die Maus den Button verlässt
	public void zoomOut(Button button) {
		button.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				button.setScaleX(1.0);
				button.setScaleY(1.0);
			}
		});	
}
	
}