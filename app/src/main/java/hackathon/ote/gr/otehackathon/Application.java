package hackathon.ote.gr.otehackathon;

import java.util.ArrayList;

import hackathon.ote.gr.otehackathon.objects.SymptomItemObj;

/**
 * Created by elias on 5/15/2018.
 */

public class Application extends android.app.Application {


    private String sessionID;
    private String token;
    private ArrayList<SymptomItemObj> symptomItemObjArrayList;


    public ArrayList<SymptomItemObj> getSymptomItemObjArrayList() {
        return symptomItemObjArrayList;
    }

    public void setSymptomItemObjArrayList(ArrayList<SymptomItemObj> symptomItemObjArrayList) {
        this.symptomItemObjArrayList = symptomItemObjArrayList;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
