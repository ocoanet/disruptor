package com.lmax.disruptor.dsl;

import org.junit.Assert;
import org.junit.Test;

public class IssueTest
{
    @Test
    public void workHandlerIssue() throws Exception
    {
        for (int i = 0; i < 100; ++i)
        {
            DisruptorTest t = new DisruptorTest();
            t.setUp();
            t.shouldProvideEventsToWorkHandlers();
            t.tearDown();
        }
    }
}
