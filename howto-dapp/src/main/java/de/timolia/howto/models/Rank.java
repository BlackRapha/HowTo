package de.timolia.howto.models;

public enum Rank {

    administrator(       161,  true, "administrator",  "Administrator",          "Administratorin", "%rank.administrator.description%"),
    administrator_city(  160,  true, "administrator",  "Administrator City",     null),
    builder(              80,  true, "builder",        "Builder",                "Builderin",    "%rank.builder.description%"),
    builder_plus(         85,  true, "builder-plus",   "Builder+",               null,           "%rank.builder_plus.description%"),
    creator(              70,  true, "creator",        "Creator",                null,           "%rank.creator.description%"),
    developer(           135,  true, "developer",      "Developer",              null,           "%rank.developer.description%"),
    developer_city(      131,  true, "developer",      "Developer City",         null),
    developer_games(     130,  true, "developer",      "Developer Games",        null),
    developer_plus(      140,  true, "developer-plus", "Developer+",             null,           "%rank.developer_plus.description%"),
    expert(               50, false, "expert",         "Expert",                 null),
    head_builder(         90 , true, "headbuilder",    "HeadBuilder",            null,           "%rank.head_builder.description%"),
    mvp(                  30, false, "mvp",            "MVP",                    null),
    mvp_plus(             40, false, "mvp",            "MVP+",                   null),
    management(          180,  true, "management",     "Management",             null),
    moderator(           125,  true, "moderator",      "Moderator",              "Moderatorin",  "%rank.moderator.description%"),
    moderator_city(      121,  true, "moderator",      "Moderator City",         null),
    moderator_games(     120,  true, "moderator",      "Moderator Games",        "Moderatorin Games"),
    native_expert(        55, false, "expert",         "Native Expert",          null),
    native_mvp(           35, false, "mvp",            "Native MVP",             null),
    native_mvp_plus(      45, false, "mvp",            "Native MVP+",            null),
    native_youtuber(      60, false, "youtuber",       "Native YouTuber",        null),
    pro(                  10, false, "pro",            "Pro",                    null),
    pro_plus(             20, false, "pro",            "Pro+",                   null),
    spieler(               0, false, "user",           "Spieler",                "Spielerin"),
    supporter(           105,  true, "supporter",      "Supporter",              "Supporterin",  "%rank.supporter.description%"),
    supporter_city(      102,  true, "supporter",      "Supporter City",         "Supporterin City"),
    supporter_games(     101,  true, "supporter",      "Supporter Games",        "Supporterin Games"),
    supporter_plus(      110,  true, "supporter-plus", "Supporter+",             "Supporterin+", "%rank.supporter_plus.description%"),
    supporter_city_games(100,  true, "supporter",      "Supporter City & Games", "Supporterin City & Games"),
    sysadmin(            150,  true, "sysadmin",       "SysAdmin",               null);

    private final int value;
    private final boolean inTeam;
    private final String male;
    private final String female;
    private final String cssClass;
    private final String description;

    Rank(int value, boolean inTeam, String cssClass, String male, String female) {
        this.value = value;
        this.inTeam = inTeam;
        this.male = male;
        this.female = female;
        this.cssClass = cssClass;
        this.description = null;
    }

    Rank(int value, boolean inTeam, String cssClass, String male, String female, String description) {
        this.value = value;
        this.inTeam = inTeam;
        this.male = male;
        this.female = female;
        this.cssClass = cssClass;
        this.description = description;
    }

    public String getString(Sex sex) {
        if (sex.equals(Sex.female)) {
            if (this.female != null) {
                return this.female;
            } else {
                return this.male;
            }
        } else if (sex.equals(Sex.male)) {
            return this.male;
        } else {
            return this.male;
        }
    }


    public int getValue() {
        return value;
    }

    public boolean isInTeam() {
        return inTeam;
    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female == null ? "undefined" : female;
    }

    public String getCssClass() {
        return cssClass;
    }

    public String getDescription() {
        return description;
    }

    public int compare(Rank o) {
        return Integer.compare(o.value, this.value);
    }

}
