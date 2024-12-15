package com.bytmasoft.common.enums;

public enum ReportType {
	PDF(1,"pdf"), CSV(2,"csv"), EXCEL(3,"excel");
private final int code;
private final String description;
ReportType(int code, String description) {
	this.code = code;
	this.description = description;
}

public int getCode() {
	return code;
}
public String getDescription() {
	return description;
}
public static ReportType getReportType(int code) {
	for (ReportType reportType : ReportType.values()) {
		if (reportType.getCode() == code) {
			return reportType;
		}
	}
	throw new IllegalArgumentException("No matching status for code: " + code);

}


}
