package com.microsoft.azure.servicebus;

import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ReceiveWorkItem extends WorkItem<Collection<MessageWithDeliveryTag>>
{
	private final int maxMessageCount;

	public ReceiveWorkItem(CompletableFuture<Collection<MessageWithDeliveryTag>> completableFuture, Duration timeout, final int maxMessageCount)
	{
		super(completableFuture, timeout);
		this.maxMessageCount = maxMessageCount;
	}
	
	public int getMaxMessageCount()
	{
		return this.maxMessageCount;
	}
}
