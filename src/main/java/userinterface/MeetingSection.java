package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/Meeting/Meeting")

public class MeetingSection extends PageObject {

    public static final Target MEETING_BUTTON = Target.the("donde validamos el nombre de la nueva unidad").locatedBy(
            "//*[@id=\"nav_menu1_3\"]/li[2]/a/span");
    public static final Target MEETINGS_BUTTON = Target.the("donde validamos el nombre de la nueva unidad").locatedBy(
            "//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span");
    public static final Target CREATE_MEETING_BUTTON = Target.the("Boton para crear una reunion").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span");
    public static final Target INPUT_MEETING_NAME = Target.the("donde se ingresa el nombre de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div[1]/div[2]/form/div/div/div/div/div[1]/input");
    public static final Target SELECT_MEETING_TYPE = Target.the("donde se ingresa el nombre de la reunion").locatedBy(
            "//div[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId\"]/a/span");
    public static final Target INPUT_NAME_MEETING_TYPE = Target.the("donde se ingresa el tipo de la reunion").located(
            By.id("s2id_autogen6_search"));
    public static final Target INPUT_SELECT_MEETING_TYPE = Target.the("donde se selecciona el tipo de la reunion").locatedBy(
            "//div[@id=\"select2-drop\"]/ul/li[1]");
    public static final Target INPUT_MEETING_NUMBER = Target.the("donde se ingresa el numero de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[3]/input");
    public static final Target START_CALENDAR_BUTTON = Target.the("donde se valida el calendario de la reunion").locatedBy(
            "//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/button/i");
    public static final Target START_MONTH_LIST = Target.the("donde se verifica el mes de la reunion").located(
            By.className("ui-datepicker-month"));
    public static final Target SELECT_START_DAY_BUTTON = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a");
    public static final Target START_TIME_LIST = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/select");
    public static final Target FINAL_CALENDAR_BUTTON = Target.the("donde se valida el calendario de la reunion").locatedBy(
            "//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/button/i");
    public static final Target FINAL_MONTH_LIST = Target.the("donde se verifica el mes de la reunion").locatedBy(
            "//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]");
    public static final Target SELECT_FINAL_DAY_BUTTON = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a");
    public static final Target FINAL_TIME_LIST = Target.the("donde se selecciona el dia de la reunion").locatedBy(
            "//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/select");
    public static final Target SELECT_MEETING_LOCATION = Target.the("donde se valida la localizacion de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[6]/div[1]");
    public static final Target INPUT_NAME_MEETING_LOCATION = Target.the("donde se ingresa la localizacion de la reunion").located(
            By.id("s2id_autogen7_search"));
    public static final Target INPUT_SELECT_MEETING_LOCATION = Target.the("donde se selecciona la localizacion de la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");
    public static final Target SELECT_MEETING_UNIT = Target.the("donde se valida la unidad de negocio de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[7]/div[1]");
    public static final Target INPUT_NAME_MEETING_UNIT = Target.the("donde se ingresa la unidad de negocio de la reunion").located(
            By.id("s2id_autogen8_search"));
    public static final Target INPUT_SELECT_MEETING_UNIT = Target.the("donde se selecciona la unidad de negocio de la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");
    public static final Target SELECT_MEETING_OWNER = Target.the("donde se valida el organizador de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[8]/div[1]");
    public static final Target INPUT_NAME_MEETING_OWNER = Target.the("donde se ingresa el organizador de negocio de la reunion").located(
            By.id("s2id_autogen9_search"));
    public static final Target INPUT_SELECT_MEETING_OWNER = Target.the("donde se selecciona el organizador de negocio de la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");
    public static final Target SELECT_MEETING_REPORTED = Target.the("donde se valida quien reporto la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[9]/div[1]");
    public static final Target INPUT_NAME_MEETING_REPORTED = Target.the("donde se ingresa quien reporto la reunion").located(
            By.id("s2id_autogen10_search"));
    public static final Target INPUT_SELECT_MEETING_REPORTED = Target.the("donde se selecciona quien reporto la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");
    public static final Target SELECT_MEETING_ATTENDEE = Target.the("donde se validan los invitados de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[10]/div/div/div[2]/a");
    public static final Target INPUT_NAME_MEETING_ATTENDEE = Target.the("donde se ingresan los invitados de la reunion").locatedBy(
            "//div[@id='select2-drop']//input");
    public static final Target INPUT_SELECT_MEETING_ATTENDEE = Target.the("donde se seleccionan los invitados de la reunion").locatedBy(
            "//div[@id='select2-drop']//li[1]");
    public static final Target SELECT_MEETING_ATTENDEE_TYPE = Target.the("donde se valida el organizador de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[10]/div/div[2]/div[4]/div[3]/div/div/div[3]/select");
    public static final Target SELECT_MEETING_ATTENDEE_STATUS = Target.the("donde se valida el organizador de la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div[2]/form/div/div/div/div/div[10]/div/div[2]/div[4]/div[3]/div/div/div[4]/select");
    public static final Target SAVE_BUTTON = Target.the("donde se guarda la reunion").locatedBy(
            "//div[@id=\"Serenity_Pro_Meeting_MeetingDialog10\"]/div[2]/div/div/div/div/div/div/div/span[1]");
    public static final Target SEARCH_BUTTON = Target.the("donde se busca la reunion").locatedBy(
            "//*[@id=\"GridDiv\"]/div[2]/div[1]/input");
    public static final Target MEETING_LIST = Target.the("donde se valida la reunion").locatedBy(
            "//a[contains(text(), 'Planning')]");
}
