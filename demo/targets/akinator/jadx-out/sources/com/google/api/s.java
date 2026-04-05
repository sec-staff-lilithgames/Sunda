package com.google.api;

import com.google.api.Logging;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface s extends MessageLiteOrBuilder {
    Logging.LoggingDestination getConsumerDestinations(int i10);

    int getConsumerDestinationsCount();

    List<Logging.LoggingDestination> getConsumerDestinationsList();

    Logging.LoggingDestination getProducerDestinations(int i10);

    int getProducerDestinationsCount();

    List<Logging.LoggingDestination> getProducerDestinationsList();
}
