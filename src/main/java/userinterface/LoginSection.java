package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F")

public class LoginInterface extends PageObject {

    public static final Target SIGN_IN_BUTTON = Target.the("Boton para iniciar sesion").locatedBy(
            "//*[@id=\"StartSharp_Membership_LoginPanel0_LoginButton\"]");
    public static final Target INPUT_NAME_LOGIN = Target.the("donde se escribe el usuario").located(By.id(
            "//input[@id=\"StartSharp_Membership_LoginPanel0_Username\"]")
    );
    public static final Target INPUT_PASSWORD_LOGIN = Target.the("donde se escribe el usuario").located(By.id(
            "//input[@id=\"StartSharp_Membership_LoginPanel0_Username\"]")
    );


}
