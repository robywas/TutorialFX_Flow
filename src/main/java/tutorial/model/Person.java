package tutorial.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty propertyTextField = new SimpleStringProperty(this, "nameProperty","Jon Snow");


    public StringProperty getPropertyTextField() {
        return propertyTextField;
    }

    public StringProperty propertyTextFieldProperty() {
        return propertyTextField;
    }

    public void setPropertyTextField(StringProperty propertyTextField) {
        this.propertyTextField = propertyTextField;
    }
}
