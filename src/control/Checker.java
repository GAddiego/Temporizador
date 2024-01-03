package control;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class Checker extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {

        if (input instanceof JTextField) {

            String text = ((JTextField) input).getText();

            try {
                Integer.parseInt(text);
                return true;

            } catch (Exception e) {
                return false;
            }

        }else{
            return true;
        }

    }
}
    


