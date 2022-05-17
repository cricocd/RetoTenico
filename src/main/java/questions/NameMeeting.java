package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.MeetingSection;

public class AnswerMeeting implements Question<Boolean> {

    private String question;

    public AnswerMeeting(String question) {
        this.question = question;
    }

    public static AnswerMeeting toThe(String question) {
        return new AnswerMeeting(question);
    }


    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String meetingName = Text.of(MeetingSection.MEETING_LIST).viewedBy(actor).asString();
        if(question.equals(meetingName)){
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}

