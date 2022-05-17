package task;

import model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.LoginSection;
import java.util.List;
import static userinterface.LoginSection.*;

public class Login implements Task {
    private LoginSection loginSection;
    private List<StartSharpData> startSharpDataList;


    public Login(List<StartSharpData> credentials) {
        this.startSharpDataList = credentials;
    }

    public static Login inThePageWithThe(List<StartSharpData> credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginSection),
                /*Enter.theValue(startSharpDataList.get(0).getUsuario()).into(INPUT_NAME_LOGIN),
                Enter.theValue(startSharpDataList.get(0).getContrasena()).into(INPUT_PASSWORD_LOGIN),*/
                Click.on(SIGN_IN_BUTTON)
        );

    }
}
