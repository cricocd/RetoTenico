package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F")

public class StartSharpPage extends PageObject {

    //login
    public static final Target SIGN_IN_BUTTON = Target.the("Boton para iniciar sesion").locatedBy(
            "//*[@id=\"StartSharp_Membership_LoginPanel0_LoginButton\"]");

    //organization button
    public static final Target ORGANIZATION_BUTTON = Target.the("Boton para acceder al componente de organizaciones").locatedBy(
            "//*[@id=\"nav_menu1_3\"]/li[1]/a/span");

    //bu buttom
    public static final Target BU_BUTTOM = Target.the("Boton para acceder a las unidades de negocio").locatedBy(
            "//*[@id=\"nav_menu1_3_1\"]/li[1]/a/span");

    //bu creation
    public static final Target CREATE_BU_BUTTON = Target.the("Boton para crear unidades de negocio").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");

    //bu name
    public static final Target INPUT_NAME = Target.the("donde escribimos el nombre de la unidad de negocio").locatedBy(
            "//div[@role='dialog']//div[2]//div//div[2]//form//div//div//div//div//div//input[@name='Name']");
    public static final Target INPUT_NAME_UNIT = Target.the("donde escribimos a cual unidad de negocio pertenece").locatedBy(
            "//div[@role='dialog']//div[2]//div//div[2]//form//div//div//div//div//div//input[@name='Name']");

    //bu unit
    public static final Target INPUT_UNIT = Target.the("donde elegimos a cual unidad de negocio pertenece").locatedBy(
            "/html/body/div[4]/div[2]/div/div[2]/form/div/div[1]/div/div/div[2]/div[1]/a");
    public static final Target INPUT_SELECT_UNIT = Target.the("donde seleccionamos a cual unidad de negocio pertenece").locatedBy(
            "/html/body/div[7]/ul");
    public static final Target UNIT_NAME = Target.the("donde validamos el nombre de la nueva unidad").locatedBy(
            "/html/body/main/section/div/div[3]/div[4]/div[3]/div");

    //meeting buttom
    public static final Target MEETING_BUTTON = Target.the("donde validamos el nombre de la nueva unidad").locatedBy(
            "//*[@id=\"nav_menu1_3\"]/li[2]/a/span");

    //meetings buttom
    public static final Target MEETINGS_BUTTON = Target.the("donde validamos el nombre de la nueva unidad").locatedBy(
            "//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span");

    //save buttom
    public static final Target SAVE_BUTTON = Target.the("donde guardamos la nueva unidad").locatedBy(
            "/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[1]");

    //bu search
    public static final Target SEARCH_BUTTON = Target.the("donde buscamos la nueva unidad").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[1]/input");
    public static final Target INPUT_SEARCH = Target.the("donde escrbimos la nueva unidad").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[1]/input");
    public static final Target BU_LIST = Target.the("donde validamos la nueva unidad").locatedBy(
            "//a[contains(text(), 'Testing')]");

}
