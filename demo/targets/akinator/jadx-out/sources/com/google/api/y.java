package com.google.api;

import com.google.api.Monitoring;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface y extends MessageLiteOrBuilder {
    Monitoring.MonitoringDestination getConsumerDestinations(int i10);

    int getConsumerDestinationsCount();

    List<Monitoring.MonitoringDestination> getConsumerDestinationsList();

    Monitoring.MonitoringDestination getProducerDestinations(int i10);

    int getProducerDestinationsCount();

    List<Monitoring.MonitoringDestination> getProducerDestinationsList();
}
