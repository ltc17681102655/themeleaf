package jpa.demo;

/**
 * @Auther: yym
 * @Date: 2018/9/3
 * @Description: 报告类别
 */
public enum ReportEnum {
    CITY_MARKET("城市行情"),
    NEW_HOUSE("城市新房"),
    SECOND_HOUSE("城市二手房")
    ;
    private String name;

    public String getName() {
        return name;
    }

    public static ReportEnum val(String name) {
        for(ReportEnum s : values()) {    //values()方法返回enum实例的数组
            if(s.getName().equals(name))
                return s;
        }
        return null;
    }

    ReportEnum(String name) {
        this.name = name;
    }

}
