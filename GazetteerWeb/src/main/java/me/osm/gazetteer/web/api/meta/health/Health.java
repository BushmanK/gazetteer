package me.osm.gazetteer.web.api.meta.health;

import java.util.Map;

import org.elasticsearch.common.joda.time.Period;
import org.elasticsearch.common.joda.time.format.PeriodFormatter;
import org.elasticsearch.common.joda.time.format.PeriodFormatterBuilder;

public class Health {

	private long uptime;
	private String uptimeHR;
	
	private long freeMemMB;
	private long maxMemMB;
	
	private long features;
	private Map<String, Long> counters;
	
	private String esnodeError;
	
	private BackgroundExecution backgroundTasks;
	
	private Map<String, String> versions;
	
	public static final PeriodFormatter PERIOD_FORMATTER = 
			new PeriodFormatterBuilder()
				.appendYears()
				.appendSuffix("yrs")
				.appendSeparator(" ")
				.appendMonths()
				.appendSuffix("mth")
				.appendSeparator(" ")
				.appendDays()
				.appendSuffix("dys")
				.appendSeparator(" ")
				.appendHours()
				.appendSuffix("hrs")
				.appendSeparator(" ")
				.appendMinutes()
				.appendSuffix("min")
				.appendSeparator(" ")
				.appendSeconds()
				.appendSuffix("s")
				.toFormatter();

	public long getUptime() {
		return uptime;
	}

	public void setUptime(long uptime) {
		this.uptime = uptime;
		this.uptimeHR = new Period(uptime).toString(PERIOD_FORMATTER);
	}

	public String getUptimeHR() {
		return uptimeHR;
	}

	public void setUptimeHR(String uptimeHR) {
		this.uptimeHR = uptimeHR;
	}

	public long getFreeMemMB() {
		return freeMemMB;
	}

	public void setFreeMemMB(long freeMemMB) {
		this.freeMemMB = freeMemMB;
	}

	public long getMaxMemMB() {
		return maxMemMB;
	}

	public void setMaxMemMB(long maxMemMB) {
		this.maxMemMB = maxMemMB;
	}

	public long getFeatures() {
		return features;
	}

	public void setFeatures(long features) {
		this.features = features;
	}

	public Map<String, Long> getCounters() {
		return counters;
	}

	public void setCounters(Map<String, Long> counters) {
		this.counters = counters;
	}

	public BackgroundExecution getBackgroundTasks() {
		return backgroundTasks;
	}

	public void setBackgroundTasks(BackgroundExecution backgroundTasks) {
		this.backgroundTasks = backgroundTasks;
	}

	public String getEsnodeError() {
		return esnodeError;
	}

	public void setEsnodeError(String esnodeError) {
		this.esnodeError = esnodeError;
	}

	public Map<String, String> getVersions() {
		return versions;
	}

	public void setVersions(Map<String, String> versions) {
		this.versions = versions;
	}
	
}
