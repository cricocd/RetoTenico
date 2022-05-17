package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/Meeting/Meeting")

public class CreateMeeting extends PageObject {

    public static final Target MEETING_BUTTON = Target.the("donde validamos el nombre de la nueva unidad").locatedBy(
            "//*[@id=\"nav_menu1_3\"]/li[2]/a/span");

    public static final Target MEETINGS_BUTTON = Target.the("donde validamos el nombre de la nueva unidad").locatedBy(
            "//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span");

    public static final Target CREATE_MEETING_BUTTON = Target.the("Boton para crear una reunion").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");

    //meeting name input
    public static final Target INPUT_MEETING_NAME = Target.the("donde se ingresa el nombre de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[1]/input");

    //meeting type
    public static final Target SELECT_MEETING_TYPE = Target.the("donde se ingresa el nombre de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[2]/div[1]/a/span[1]");

    public static final Target INPUT_NAME_MEETING_TYPE = Target.the("donde se ingresa el tipo de la reunion").locatedBy(
            "/html/body/div[6]/div/input");

    public static final Target INPUT_SELECT_MEETING_TYPE = Target.the("donde se selecciona el tipo de la reunion").locatedBy(
            "/html/body/div[6]/ul/li[1]/div");

    //meeting number
    public static final Target INPUT_MEETING_NUMBER = Target.the("donde se ingresa el numero de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[3]/input");

    //meeting start date
    public static final Target START_CALENDAR_BUTTON = Target.the("donde se valida el calendario de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/button/i");

    public static final Target START_MONTH_LIST = Target.the("donde se verifica el mes de la reunion").located(
            By.className("ui-datepicker-month"));

    public static final Target SELECT_START_MONTH_BUTTON = Target.the("donde se selecciona el mes de la reunion").locatedBy(
            "/html/body/div[4]/div[1]/div/select[1]/option[7]");

    public static final Target SELECT_START_DAY_BUTTON = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "/html/body/div[4]/table/tbody/tr[2]/td[6]/a");

    public static final Target START_TIME_LIST = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select");

    public static final Target SELECT_START_TIME_LIST = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select/option[169]");

    //meeting final date
    public static final Target FINAL_CALENDAR_BUTTON = Target.the("donde se valida el calendario de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/button/i");

    public static final Target FINAL_MONTH_LIST = Target.the("donde se verifica el mes de la reunion").locatedBy(
            "/html/body/div[4]/div[1]/div/select[1]");

    public static final Target SELECT_FINAL_MONTH_BUTTON = Target.the("donde se selecciona el mes de la reunion").locatedBy(
            "/html/body/div[4]/div[1]/div/select[1]/option[7]");

    public static final Target SELECT_FINAL_DAY_BUTTON = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "/html/body/div[4]/table/tbody/tr[2]/td[7]/a");

    public static final Target FINAL_TIME_LIST = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/select");

    public static final Target SELECT_FINAL_TIME_LIST = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/select/option[193]");

    //meeting location
    public static final Target SELECT_MEETING_LOCATION = Target.the("donde se valida la localizacion de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[6]/div[1]/a/span[1]");

    public static final Target INPUT_NAME_MEETING_LOCATION = Target.the("donde se ingresa la localizacion de la reunion").locatedBy(
            "/html/body/div[7]/div/input");

    public static final Target INPUT_SELECT_MEETING_LOCATION = Target.the("donde se selecciona la localizacion de la reunion").locatedBy(
            "/html/body/div[7]/ul/li/div");

    //meeting unit
    public static final Target SELECT_MEETING_UNIT = Target.the("donde se valida la unidad de negocio de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[7]/div[1]/a/span[1]");

    public static final Target INPUT_NAME_MEETING_UNIT = Target.the("donde se ingresa la unidad de negocio de la reunion").located(
            By.id("s2id_autogen8_search"));

    public static final Target INPUT_SELECT_MEETING_UNIT = Target.the("donde se selecciona la unidad de negocio de la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");

    //meeting owner
    public static final Target SELECT_MEETING_OWNER = Target.the("donde se valida el organizador de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[8]/div[1]/a/span[1]");

    public static final Target INPUT_NAME_MEETING_OWNER = Target.the("donde se ingresa el organizador de negocio de la reunion").located(
            By.id("s2id_autogen9_search"));

    public static final Target INPUT_SELECT_MEETING_OWNER = Target.the("donde se selecciona el organizador de negocio de la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");

    //meeting reporter
    public static final Target SELECT_MEETING_REPORTED = Target.the("donde se valida quien reporto la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[9]/div[1]/a/span[1]");

    public static final Target INPUT_NAME_MEETING_REPORTED = Target.the("donde se ingresa quien reporto la reunion").locatedBy(
            "//div[@id='select2-drop']//input");

    public static final Target INPUT_SELECT_MEETING_REPORTED = Target.the("donde se selecciona quien reporto la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");

    //meeting attendee
    public static final Target SELECT_MEETING_ATTENDEE = Target.the("donde se validan los invitados de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[1]/div[2]/a/span[1]");

    public static final Target INPUT_NAME_MEETING_ATTENDEE = Target.the("donde se ingresan los invitados de la reunion").locatedBy(
            "//div[@id='select2-drop']//input");

    public static final Target INPUT_SELECT_MEETING_ATTENDEE = Target.the("donde se seleccionan los invitados de la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");

    //meeting attendee type
    public static final Target SELECT_MEETING_ATTENDEE_TYPE = Target.the("donde se valida el organizador de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[2]/div[4]/div[3]/div/div/div[3]/select");

    public static final Target INPUT_SELECT_MEETING_ATTENDEE_TYPE = Target.the("donde se selecciona el organizador de negocio de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[2]/div[4]/div[3]/div/div/div[3]/select/option[2]");

    //meeting attendee status
    public static final Target SELECT_MEETING_ATTENDEE_STATUS = Target.the("donde se valida el organizador de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[2]/div[4]/div[3]/div/div/div[4]/select");

    public static final Target INPUT_SELECT_MEETING_ATTENDEE_STATUS = Target.the("donde se selecciona el organizador de negocio de la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[2]/div[4]/div[3]/div/div/div[4]/select/option[2]");

    //meeting save button
    public static final Target SAVE_BUTTON = Target.the("donde se guarda la reunion").locatedBy(
            "/html/body/main/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]/div");

    //meeting search
    public static final Target SEARCH_BUTTON = Target.the("donde se busca la reunion").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[1]/input");
    public static final Target MEETING_LIST = Target.the("donde se valida la reunion").locatedBy(
            "//a[contains(text(), 'Planning')]");



}
