package hackfort.merryband.model;

public class Event {
  private String activityName;
  private String locationName;

  public Event(String locName, String actName) {
    activityName = actName;
    locationName = locName;
  }

  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String actName) {
    this.activityName = actName;
  }

  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locName) {
    this.locationName = locName;
  }

}
