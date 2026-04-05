package com.google.api;

import com.google.api.Billing;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface c extends MessageLiteOrBuilder {
    Billing.BillingDestination getConsumerDestinations(int i10);

    int getConsumerDestinationsCount();

    List<Billing.BillingDestination> getConsumerDestinationsList();
}
