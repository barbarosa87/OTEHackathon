package hackathon.ote.gr.otehackathon.objects;

import java.io.Serializable;

/**
 * Created by elias on 5/9/2018.
 */

public class StatesObj implements Serializable {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
