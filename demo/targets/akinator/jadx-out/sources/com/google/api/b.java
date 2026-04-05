package com.google.api;

import com.google.api.Billing;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b addAllConsumerDestinations(Iterable<? extends Billing.BillingDestination> iterable) {
        copyOnWrite();
        ((Billing) this.instance).addAllConsumerDestinations(iterable);
        return this;
    }

    public b addConsumerDestinations(Billing.BillingDestination billingDestination) {
        copyOnWrite();
        ((Billing) this.instance).addConsumerDestinations(billingDestination);
        return this;
    }

    public b clearConsumerDestinations() {
        copyOnWrite();
        ((Billing) this.instance).clearConsumerDestinations();
        return this;
    }

    @Override // com.google.api.c
    public Billing.BillingDestination getConsumerDestinations(int i10) {
        return ((Billing) this.instance).getConsumerDestinations(i10);
    }

    @Override // com.google.api.c
    public int getConsumerDestinationsCount() {
        return ((Billing) this.instance).getConsumerDestinationsCount();
    }

    @Override // com.google.api.c
    public List<Billing.BillingDestination> getConsumerDestinationsList() {
        return Collections.unmodifiableList(((Billing) this.instance).getConsumerDestinationsList());
    }

    public b removeConsumerDestinations(int i10) {
        copyOnWrite();
        ((Billing) this.instance).removeConsumerDestinations(i10);
        return this;
    }

    public b setConsumerDestinations(int i10, Billing.BillingDestination billingDestination) {
        copyOnWrite();
        ((Billing) this.instance).setConsumerDestinations(i10, billingDestination);
        return this;
    }

    public b addConsumerDestinations(int i10, Billing.BillingDestination billingDestination) {
        copyOnWrite();
        ((Billing) this.instance).addConsumerDestinations(i10, billingDestination);
        return this;
    }

    public b setConsumerDestinations(int i10, a aVar) {
        copyOnWrite();
        ((Billing) this.instance).setConsumerDestinations(i10, (Billing.BillingDestination) aVar.build());
        return this;
    }

    public b addConsumerDestinations(a aVar) {
        copyOnWrite();
        ((Billing) this.instance).addConsumerDestinations((Billing.BillingDestination) aVar.build());
        return this;
    }

    public b addConsumerDestinations(int i10, a aVar) {
        copyOnWrite();
        ((Billing) this.instance).addConsumerDestinations(i10, (Billing.BillingDestination) aVar.build());
        return this;
    }
}
