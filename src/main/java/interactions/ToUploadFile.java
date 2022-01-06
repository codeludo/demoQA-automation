package interactions;

import com.sun.glass.ui.SystemClipboard;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PracticeFormUI.BTN_UPLOAD_PICTURE;

@AllArgsConstructor
public class ToUploadFile implements Interaction {

    private final Map<String, String> data;

    public static ToUploadFile withFile(Map<String, String> data) {
        return instrumented(ToUploadFile.class, data);
    }

    public static void setClipboard(String string){
        StringSelection stringSelection = new StringSelection(string);
        java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try{
            setClipboard("C:\\Users\\USUARIO\\Desktop\\notas_diarias.txt");
            Robot bot = new Robot();
            bot.keyPress(KeyEvent.VK_CONTROL);
            bot.keyPress(KeyEvent.VK_V);
            bot.keyRelease(KeyEvent.VK_V);
            bot.keyRelease(KeyEvent.VK_CONTROL);
            bot.keyPress(KeyEvent.VK_ENTER);
            bot.keyRelease(KeyEvent.VK_ENTER);
        }catch(SerenityManagedException | AWTException exception){
            exception.printStackTrace();
        }


    }
}
