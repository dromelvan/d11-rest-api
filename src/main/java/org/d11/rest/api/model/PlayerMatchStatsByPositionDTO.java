package org.d11.rest.api.model;

import java.util.*;

import org.d11.rest.api.D11RestApiVersion;

public class PlayerMatchStatsByPositionDTO extends HashMap<Long, Map<String, List<PlayerMatchStatDTO>>> {

    private static final long serialVersionUID = D11RestApiVersion.SERIAL_VERSION_UID;

}
