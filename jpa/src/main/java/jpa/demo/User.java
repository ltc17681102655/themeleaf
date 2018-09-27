package jpa.demo;

import sun.dc.pr.PRError;

import java.util.List;

public class User {

	private List<String> tags ;

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	private Integer id ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private ReportEnum reportEnum ;

	private String name ;

	private Integer month ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public ReportEnum getReportEnum() {
		return reportEnum;
	}

	public void setReportEnum(ReportEnum reportEnum) {
		this.reportEnum = reportEnum;
	}

	@Override
	public String toString() {
		return "User{" +
				"tags=" + tags +
				", id=" + id +
				", reportEnum=" + reportEnum +
				", name='" + name + '\'' +
				", month=" + month +
				'}';
	}
}
