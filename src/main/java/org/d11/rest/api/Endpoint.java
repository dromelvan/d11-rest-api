package org.d11.rest.api;

public interface Endpoint {

    public final static String INDEX = "/";
    public final static String AUTHENTICATE = INDEX + "authenticate";

    public final static String COUNTRIES = INDEX + "countries";
    public final static String COUNTRIES_IDS = COUNTRIES + "/ids";
    public final static String COUNTRY = COUNTRIES + "/{id}";

    public final static String PLAYERS = INDEX + "players";
    public final static String PLAYERS_IDS = PLAYERS + "/ids";
    public final static String PLAYER = PLAYERS + "/{id}";

    public final static String POSITIONS = INDEX + "positions";
    public final static String POSITIONS_IDS = POSITIONS + "/ids";
    public final static String POSITION = POSITIONS + "/{id}";

    public final static String STADIA = INDEX + "stadia";
    public final static String STADIA_IDS = STADIA + "/ids";
    public final static String STADIUM = STADIA + "/{id}";

    public final static String TEAMS = INDEX + "teams";
    public final static String TEAMS_IDS = TEAMS + "/ids";
    public final static String TEAM = TEAMS + "/{id}";

    public final static String D11_TEAMS = INDEX + "d11-teams";
    public final static String D11_TEAMS_IDS = D11_TEAMS + "/ids";
    public final static String D11_TEAM = D11_TEAMS + "/{id}";

    public final static String SEASONS = INDEX + "seasons";
    public final static String SEASONS_IDS = SEASONS + "/ids";
    public final static String SEASON = SEASONS + "/{id}";
    public final static String SEASON_CURRENT = SEASONS + "/current";

    public final static String PREMIER_LEAGUES = INDEX + "premier-leagues";
    public final static String PREMIER_LEAGUES_IDS = PREMIER_LEAGUES + "/ids";
    public final static String PREMIER_LEAGUE = PREMIER_LEAGUES + "/{id}";
    public final static String PREMIER_LEAGUE_CURRENT = PREMIER_LEAGUES + "/current";

    public final static String MATCH_DAYS = INDEX + "match-days";
    public final static String MATCH_DAYS_IDS = MATCH_DAYS + "/ids";
    public final static String MATCH_DAY = MATCH_DAYS + "/{id}";
    public final static String MATCH_DAY_CURRENT = MATCH_DAYS + "/current";

    public final static String MATCHES = INDEX + "matches";
    public final static String MATCHES_IDS = MATCHES + "/ids";
    public final static String MATCH = MATCHES + "/{id}";
    public final static String MATCH_EVENTS = MATCHES + "/{id}/events";
    public final static String MATCH_STATS = MATCHES + "/{id}/stats";

    public final static String PLAYER_MATCH_STATS = INDEX + "player-match-stats";
    public final static String PLAYER_MATCH_STATS_IDS = PLAYER_MATCH_STATS + "/ids";
    public final static String PLAYER_MATCH_STAT = PLAYER_MATCH_STATS + "/{id}";
    public final static String PLAYER_MATCH_STAT_BY_D11_MATCH_ID = PLAYER_MATCH_STATS + "/d11-match/{id}";

    public final static String GOALS = INDEX + "goals";
    public final static String GOALS_IDS = GOALS + "/ids";
    public final static String GOAL = GOALS + "/{id}";

    public final static String CARDS = INDEX + "cards";
    public final static String CARDS_IDS = CARDS + "/ids";
    public final static String CARD = CARDS + "/{id}";

    public final static String SUBSTITUTIONS = INDEX + "substitutions";
    public final static String SUBSTITUTIONS_IDS = SUBSTITUTIONS + "/ids";
    public final static String SUBSTITUTION = SUBSTITUTIONS + "/{id}";

    public final static String D11_LEAGUES = INDEX + "d11-leagues";
    public final static String D11_LEAGUES_IDS = D11_LEAGUES + "/ids";
    public final static String D11_LEAGUE = D11_LEAGUES + "/{id}";
    public final static String D11_LEAGUE_CURRENT = D11_LEAGUES + "/current";

    public final static String D11_MATCH_DAYS = INDEX + "d11-match-days";
    public final static String D11_MATCH_DAYS_IDS = D11_MATCH_DAYS + "/ids";
    public final static String D11_MATCH_DAY = D11_MATCH_DAYS + "/{id}";
    public final static String D11_MATCH_DAY_CURRENT = D11_MATCH_DAYS + "/current";

    public final static String D11_MATCHES = INDEX + "d11-matches";
    public final static String D11_MATCHES_IDS = D11_MATCHES + "/ids";
    public final static String D11_MATCH = D11_MATCHES + "/{id}";

    public final static String TEAM_TABLE_STATS = INDEX + "team-table-stats";
    public final static String TEAM_TABLE_STATS_IDS = TEAM_TABLE_STATS + "/ids";
    public final static String TEAM_TABLE_STAT = TEAM_TABLE_STATS + "/{id}";
    public final static String TEAM_TABLE_STAT_BY_MATCH_DAY_ID = TEAM_TABLE_STATS + "/match-day/{id}";

    public final static String D11_TEAM_TABLE_STATS = INDEX + "d11-team-table-stats";
    public final static String D11_TEAM_TABLE_STATS_IDS = D11_TEAM_TABLE_STATS + "/ids";
    public final static String D11_TEAM_TABLE_STAT = D11_TEAM_TABLE_STATS + "/{id}";
    public final static String D11_TEAM_TABLE_STAT_BY_D11_MATCH_DAY_ID = D11_TEAM_TABLE_STATS + "/d11-match-day/{id}";
    
}
