package jpa.param;

import java.io.Serializable;

public class ReportParam implements Serializable {

    private Integer year ;

    private Integer month ;

    private Integer season ;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "ReportParam{" +
                "year=" + year +
                ", month=" + month +
                ", season=" + season +
                '}';
    }
}
