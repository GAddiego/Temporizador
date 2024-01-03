package language;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Gonzalo
 */
public class Language extends Properties {
    
    private static final long serialVersionUID = 1L;
 
    public Language(String language){
 
        switch(language){
            case "spanish":
                    getProperties("espanol.properties");
                    break;
            case "english":
                    getProperties("english.properties");
                    break;
            default:
                    getProperties("espanol.properties");
        }
 
    }
 
    private void getProperties(String language) {
        try {
            this.load( getClass().getResourceAsStream(language) );
        } catch (IOException ex) {
 
        }
   }
}
    

