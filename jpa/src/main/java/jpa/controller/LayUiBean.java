package jpa.controller;

import java.io.Serializable;

public class LayUiBean implements Serializable {
    private Integer id;
    private String username;
    private Integer experience;
    private String sex;
    private Integer score;
    private String title;
    private String sign ;
    private String classify ;
    private Integer wealth ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Integer getWealth() {
        return wealth;
    }

    public void setWealth(Integer wealth) {
        this.wealth = wealth;
    }

    @Override
    public String toString() {
        return "LayUiBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", experience=" + experience +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", title='" + title + '\'' +
                ", sign='" + sign + '\'' +
                ", classify='" + classify + '\'' +
                ", wealth=" + wealth +
                '}';
    }
}
