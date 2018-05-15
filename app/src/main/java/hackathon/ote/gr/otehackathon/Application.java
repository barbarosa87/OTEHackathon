package hackathon.ote.gr.otehackathon;

/**
 * Created by elias on 5/15/2018.
 */

public class Application extends android.app.Application {


    private String sessionID;
    private String token;

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
