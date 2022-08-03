public enum Position {
    DEVELOPER(true)
    ,
    TECH_LEAD(true),
    MANAGER(false),
    RECRUITER(false);

    private final boolean isIt;
    Position(boolean isIt) {
        this.isIt=isIt;
    }

    public boolean isIt() {
        return isIt;
    }
}
