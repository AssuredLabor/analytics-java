package com.github.segmentio.stats;

import com.github.segmentio.Analytics;

public class AnalyticsStatistics extends Statistics {

	private static final long serialVersionUID = 5469315718941515883L;

	private static String IDENTIFY_KEY = "Identify";
	private static String TRACK_KEY = "Track";
	private static String ALIAS_KEY = "Alias";
	private static String GROUP_KEY = "Group";
	private static String PAGE_KEY = "Page";
	private static String SCREEN_KEY = "Screen";

	private static String FLUSHED_ATTEMPTS_KEY = "Flushed Attempts";

	private static String REQUEST_TIME_KEY = "Request Time";

	private static String QUEUED_KEY = "Queued";
	private static String INSERTED_KEY = "Inserted";
	private static String DROPPED_KEY = "Dropped";
	
	private static String SUCCESSFUL_KEY = "Successful";
	private static String FAILED_KEY = "Failed";


	/**
	 * Returns the statistic representing how many 
	 * {@link Analytics#identify(String, com.github.segmentio.models.Traits)} 
	 * calls happened
	 * @return
	 */
	public Statistic getIdentifies() {
		return ensure(IDENTIFY_KEY);
	}

	public void updateIdentifies(double val) {
		update(IDENTIFY_KEY, val);
	}


	public Statistic getTracks() {
		return ensure(TRACK_KEY);
	}

	public void updateTracks(double val) {
		update(TRACK_KEY, val);
	}


	public Statistic getAlias() {
		return ensure(ALIAS_KEY);
	}

	public void updateAlias(double val) {
		update(ALIAS_KEY, val);
	}

	public Statistic getGroup() {
		return ensure(GROUP_KEY);
	}

	public void updateGroup(double val) {
		update(GROUP_KEY, val);
	}

	public Statistic getPage() {
		return ensure(PAGE_KEY);
	}

	public void updatePage(double val) {
		update(PAGE_KEY, val);
	}
	public Statistic getScreen() {
		return ensure(SCREEN_KEY);
	}

	public void updateScreen(double val) {
		update(SCREEN_KEY, val);
	}

	public Statistic getInserted() {
		return ensure(INSERTED_KEY);
	}

	public void updateInserted(double val) {
		update(INSERTED_KEY, val);
	}
	
	public Statistic getQueued() {
		return ensure(QUEUED_KEY);
	}

	public void updateQueued(double val) {
		update(QUEUED_KEY, val);
	}
	
	/**
	 * Get the amount of messages that were dropped because
	 * the queue was too high
	 * @return
	 */
	public Statistic getDropped() {
		return ensure(DROPPED_KEY);
	}

	public void updateDropped(double val) {
		update(DROPPED_KEY, val);
	}


	public Statistic getFlushAttempts() {
		return ensure(FLUSHED_ATTEMPTS_KEY);
	}

	public void updateFlushAttempts(double val) {
		update(FLUSHED_ATTEMPTS_KEY, val);
	}



	public Statistic getRequestTime() {
		return ensure(REQUEST_TIME_KEY);
	}

	public void updateRequestTime(double val) {
		update(REQUEST_TIME_KEY, val);
	}


	public Statistic getSuccessful() {
		return ensure(SUCCESSFUL_KEY);
	}

	public void updateSuccessful(double val) {
		update(SUCCESSFUL_KEY, val);
	}


	public Statistic getFailed() {
		return ensure(FAILED_KEY);
	}

	public void updateFailed(double val) {
		update(FAILED_KEY, val);
	}
}