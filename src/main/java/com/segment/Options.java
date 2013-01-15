package com.segment;

import com.ning.http.client.AsyncHttpClientConfig;

/**
 * Segment.io client options
 *
 */
public class Options {
	
	/**
	 * The REST API endpoint (with scheme)
	 */
	private String host;
	
	/**
	 * Flush after these many messages are added to the queue
	 */
	private int flushAt;
	
	/**
	 * Flush after this many milliseconds have passed without a flush
	 */
	private int flushAfter;
	
	/**
	 * Stop accepting messages after the queue reaches this capacity
	 */
	private int queueCapacity;
	
	/**
	 * The HTTP Client used to flush
	 */
	private AsyncHttpClientConfig httpConfig;

	/**
	 * Creates a default options
	 */
	public Options() {
		this(Defaults.HOST, 
		     Defaults.FLUSH_AT, 
		     Defaults.FLUSH_AFTER, 
		     Defaults.QUEUE_CAPACITY,
		     Defaults.CONFIG);
	}
	
	/**
	 * Creates an option with the provided settings
	 * @param flushAt
	 * @param flushAfter
	 * @param queueCapacity
	 * @param httpConfig
	 */
	Options(String host,
				   int flushAt,
				   int flushAfter,
				   int queueCapacity,
				   AsyncHttpClientConfig httpConfig) {
		
		this.host = host;
		this.flushAt = flushAt;
		this.flushAfter = flushAfter;
		this.queueCapacity = queueCapacity;
		this.httpConfig = httpConfig;
	}

	
	public int getFlushAt() {
		return flushAt;
	}
	
	public int getFlushAfter() {
		return flushAfter;
	}
	
	public String getHost() {
		return host;
	}
	
	public int getQueueCapacity() {
		return queueCapacity;
	}
	
	public AsyncHttpClientConfig getHttpConfig() {
		return httpConfig;
	}
	
	/**
	 * Sets the amount of messages that need to be in the queue before it is flushed
	 * @param flushAt
	 */
	public void setFlushAt(int flushAt) {
		this.flushAt = flushAt;
	}
	
	/**
	 * Sets the maximum amount of time to queue before invoking a flush (in milliseconds)
	 * @param flushAfter
	 */
	public void setFlushAfter(int flushAfter) {
		this.flushAfter = flushAfter;
	}
	
	/**
	 * Sets the maximum queue capacity, which is an emergency pressure relief valve. If we're unable
	 * to flush messages fast enough, the queue will stop accepting messages after this capacity is reached.
	 * @param queueCapacity
	 */
	public void setQueueCapacity(int queueCapacity) {
		this.queueCapacity = queueCapacity;
	}
	
	/**
	 * Sets the REST API endpoint
	 * @param host
	 */
	public void setHost(String host) {
		this.host = host;
	}
	
	/**
	 * Sets the HTTP client async configuration
	 * @param httpConfig
	 */
	public void setHttpConfig(AsyncHttpClientConfig httpConfig) {
		this.httpConfig = httpConfig;
	}
	
	
}