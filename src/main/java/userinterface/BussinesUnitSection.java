package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F")

public class BussinesUnitSection extends PageObject {

    public static final Target ORGANIZATION_BUTTON = Target.the("Boton para acceder al componente de organizaciones").locatedBy(
            "//*[@id=\"nav_menu1_3\"]/li[1]/a/span");
    public static final Target BU_BUTTOM = Target.the("Boton para acceder a las unidades de negocio").locatedBy(
            "//*[@id=\"nav_menu1_3_1\"]/li[1]/a/span");
    public static final Target CREATE_BU_BUTTON = Target.the("Boton para crear unidades de negocio").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");
    public static final Target INPUT_NAME = Target.the("donde escribimos el nombre de la unidad de negocio").locatedBy(
            "//div[@role='dialog']//div[2]//div//div[2]//form//div//div//div//div//div//input[@name='Name']");
    public static final Target INPUT_NAME_UNIT = Target.the("donde escribimos a cual unidad de negocio pertenece").locatedBy(
            "//div[@role='dialog']//div[2]//div//div[2]//form//div//div//div//div//div//input[@name='Name']");
    public static final Target INPUT_UNIT = Target.the("donde elegimos a cual unidad de negocio pertenece").locatedBy(
            "//div[@role=\"dialog\"][2]/div[2]/div/div[2]/form/div/div[1]/div/div/div[2]/div[1]/a/span[1]");
    public static final Target INPUT_SELECT_UNIT = Target.the("donde seleccionamos a cual unidad de negocio pertenece").locatedBy(
            "//div[@id=\"select2-drop\"]/ul/li");
    public static final Target SAVE_BUTTON = Target.the("donde guardamos la nueva unidad").locatedBy(
            "//div[@role=\"dialog\"][2]/div[2]/div/div[1]/div/div/div/div[1]/div/span");
    public static final Target SEARCH_BUTTON = Target.the("donde buscamos la nueva unidad").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[1]/input");
    public static final Target INPUT_SEARCH = Target.the("donde escrbimos la nueva unidad").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[1]/input");
    public static final Target BU_LIST = Target.the("donde validamos la nueva unidad").locatedBy(
            "//a[contains(text(), 'Testing')]");

}
