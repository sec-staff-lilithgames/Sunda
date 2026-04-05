package com.google.api;

import com.google.api.Billing;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import kh.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends GeneratedMessageLite.Builder implements a0 {
    public a addAllMetrics(Iterable<String> iterable) {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).addAllMetrics(iterable);
        return this;
    }

    public a addMetrics(String str) {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).addMetrics(str);
        return this;
    }

    public a addMetricsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).addMetricsBytes(byteString);
        return this;
    }

    public a clearMetrics() {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).clearMetrics();
        return this;
    }

    public a clearMonitoredResource() {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).clearMonitoredResource();
        return this;
    }

    @Override // kh.a0
    public String getMetrics(int i10) {
        return ((Billing.BillingDestination) this.instance).getMetrics(i10);
    }

    @Override // kh.a0
    public ByteString getMetricsBytes(int i10) {
        return ((Billing.BillingDestination) this.instance).getMetricsBytes(i10);
    }

    @Override // kh.a0
    public int getMetricsCount() {
        return ((Billing.BillingDestination) this.instance).getMetricsCount();
    }

    @Override // kh.a0
    public List<String> getMetricsList() {
        return Collections.unmodifiableList(((Billing.BillingDestination) this.instance).getMetricsList());
    }

    @Override // kh.a0
    public String getMonitoredResource() {
        return ((Billing.BillingDestination) this.instance).getMonitoredResource();
    }

    @Override // kh.a0
    public ByteString getMonitoredResourceBytes() {
        return ((Billing.BillingDestination) this.instance).getMonitoredResourceBytes();
    }

    public a setMetrics(int i10, String str) {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).setMetrics(i10, str);
        return this;
    }

    public a setMonitoredResource(String str) {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).setMonitoredResource(str);
        return this;
    }

    public a setMonitoredResourceBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Billing.BillingDestination) this.instance).setMonitoredResourceBytes(byteString);
        return this;
    }
}
