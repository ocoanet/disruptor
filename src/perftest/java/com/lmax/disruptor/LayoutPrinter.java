package com.lmax.disruptor;

import org.openjdk.jol.info.ClassLayout;

public class LayoutPrinter
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(ClassLayout.parseClass(RingBuffer.class).toPrintable());
        System.out.println(ClassLayout.parseClass(SingleProducerSequencer.class).toPrintable());
        System.out.println(ClassLayout.parseClass(Sequence.class).toPrintable());
    }
}
