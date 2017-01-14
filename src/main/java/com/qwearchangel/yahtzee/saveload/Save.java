package com.qwearchangel.yahtzee.saveload;

import com.qwearchangel.yahtzee.model.Player;
import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author Filip Ferm
 */
public class Save {

    public Save() {
    }
    
    public JSONObject createSave(List<Player> players) {
        JSONObject json = new JSONObject();
        
        //Go thru each player
        
        /**
         * {
         * "players": 2
         * }
         * {
         * "playername": "name",
         * "points":
         * [{
         * "one": 3,
         * "two": 6
         * }]
         * }
         **/ 

        
        return json;
    }
    
    public void writeFile() {
        
    }
}
