/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package verify_voter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author SR Kuhin
 */
public class FXMLDocumentController implements Initializable {

	@FXML
	private TextField name;
	@FXML
	private TextField age;
	@FXML
	private ChoiceBox<String> gender;
	@FXML
	private ChoiceBox<String> division;
	@FXML
	private Label result;
	@FXML
	private Button btn;
	@FXML
	private Text icon;
	@FXML
	private Circle c1;
	@FXML
	private Circle c2;

	private String gender1[] = {"Male", "Female", "Other"};
	private String division1[] = {"Barishal", "Chattogram", "Dhaka", "Khulna", "Rajshahi", "Rangpur", "Mymensingh", "Sylhet"};

	String name1;
  	int age1;

	@FXML
	private void btnAction(ActionEvent event) {
		try {
			name1 = name.getText();
			age1 = Integer.parseInt(age.getText());
			if (age1 >= 18) {
				result.setText("You are Eligible");
			} else {
				result.setText("You are not Eligible");
			}
		} catch (NumberFormatException e) {
			result.setText("Enter Only Numbers");
		} catch (Exception e) {
			result.setText("error");
		}

		age.clear();
		name.clear();
	

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		gender.getItems().addAll(gender1);
		division.getItems().addAll(division1);

		//TranslateTransition for c1=circle1
		TranslateTransition translatec1 = new TranslateTransition();

		translatec1.setNode(c1);
		translatec1.setDuration(Duration.millis(10000));
		translatec1.setCycleCount(TranslateTransition.INDEFINITE);
		translatec1.setByX(-250);
		translatec1.play();
		//TranslateTransition for c2=circle2
		TranslateTransition translatec2 = new TranslateTransition();

		translatec2.setNode(c2);
		translatec2.setDuration(Duration.millis(10000));
		translatec2.setCycleCount(TranslateTransition.INDEFINITE);
		translatec2.setByX(250);
		translatec2.play();
		//TranslateTransition for icon
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(icon);
		translate.setDuration(Duration.millis(1000));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByY(10);
		translate.play();
	}

}
