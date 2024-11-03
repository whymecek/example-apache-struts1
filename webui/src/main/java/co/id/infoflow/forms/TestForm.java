package co.id.infoflow.forms;
 
import org.apache.struts.action.ActionForm;

public class TestForm extends ActionForm {
    private String value;

    public TestForm() {
        value = "XX";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
