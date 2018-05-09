package hackathon.ote.gr.otehackathon.objects;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by elias on 5/9/2018.
 */

public class CaseObj implements Serializable {

    private String caseId;
    private String token;


    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
