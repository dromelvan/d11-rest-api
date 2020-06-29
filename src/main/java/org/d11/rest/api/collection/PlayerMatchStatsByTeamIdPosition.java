package org.d11.rest.api.collection;

import java.util.*;

import org.d11.rest.api.D11RestApiVersion;
import org.d11.rest.api.model.PlayerMatchStatDTO;

public class PlayerMatchStatsByTeamIdPosition extends LinkedHashMap<Long, Map<String, List<PlayerMatchStatDTO>>> {

    private static final long serialVersionUID = D11RestApiVersion.SERIAL_VERSION_UID;
    
}
