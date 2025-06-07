package src.main.java.org.retrohaven.libusernames;

import org.retrohaven.libusernames.libUsernamesDesc;

import java.util.List;
import java.util.UUID;

import org.json.JSONObject;

public class libUsernames implements libUsernamesDesc {
    private JSONObject getFromMojangAPI(String endpoint, String argument) {
        return null;
    }

    public String getUsername(UUID uuid) {
        return null;
    }

    public UUID getUUID(String username) {
        return null;
    }

    public List<String> getUsernames(UUID uuid) {
        return null;
    }
}
