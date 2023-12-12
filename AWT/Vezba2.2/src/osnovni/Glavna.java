package osnovni;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Glavna {

	Frame f = new Frame();
	Label l = new Label("Unesi ime i prezime");	
	TextField tf = new TextField();
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox c1 = new  Checkbox();
	Checkbox c2 = new  Checkbox();
	Button b = new Button();
	TextArea ta = new TextArea();	
	
	Glavna(){
		//Nije zavrseno / Not finished
	}
	
	public static void main(String[] args) {
		new Glavna();

	}

}
