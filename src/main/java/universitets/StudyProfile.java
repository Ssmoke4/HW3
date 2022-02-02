package universitets;

public enum StudyProfile {
    MUSIC ("Музыкальный"),
    PHISIC ("Физический"),
    MATHEMATIC("Математический");


    public String getProfile_name() {
        return Profile_name;
    }

    private final String Profile_name;


    StudyProfile(String profile_name) {
        Profile_name = profile_name;
    }
}
