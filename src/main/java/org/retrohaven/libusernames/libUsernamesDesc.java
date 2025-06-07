package org.retrohaven.libusernames;

import java.util.List;
import java.util.UUID;

public interface libUsernamesDesc {
    /**
     * Get username from UUID
     *
     * @return String, or null if not found
     */
    String getUsername(UUID uuid);

    /**
     * Get UUID from username
     * Checks past usernames as well
     *
     * @return UUID, or null if not found.
     */
    UUID getUUID(String username);

    /**
     * Get all usernames that we can find from a UUID
     * Checks past usernames as well
     *
     * @return List<String>, or null if not found
     */
    List<String> getUsernames(UUID uuid);
}
