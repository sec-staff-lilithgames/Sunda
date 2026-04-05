package com.google.api;

import com.google.api.Monitoring;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import kh.j3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x extends GeneratedMessageLite.Builder implements j3 {
    public x addAllMetrics(Iterable<String> iterable) {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).addAllMetrics(iterable);
        return this;
    }

    public x addMetrics(String str) {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).addMetrics(str);
        return this;
    }

    public x addMetricsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).addMetricsBytes(byteString);
        return this;
    }

    public x clearMetrics() {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).clearMetrics();
        return this;
    }

    public x clearMonitoredResource() {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).clearMonitoredResource();
        return this;
    }

    @Override // kh.j3
    public String getMetrics(int i10) {
        return ((Monitoring.MonitoringDestination) this.instance).getMetrics(i10);
    }

    @Override // kh.j3
    public ByteString getMetricsBytes(int i10) {
        return ((Monitoring.MonitoringDestination) this.instance).getMetricsBytes(i10);
    }

    @Override // kh.j3
    public int getMetricsCount() {
        return ((Monitoring.MonitoringDestination) this.instance).getMetricsCount();
    }

    @Override // kh.j3
    public List<String> getMetricsList() {
        return Collections.unmodifiableList(((Monitoring.MonitoringDestination) this.instance).getMetricsList());
    }

    @Override // kh.j3
    public String getMonitoredResource() {
        return ((Monitoring.MonitoringDestination) this.instance).getMonitoredResource();
    }

    @Override // kh.j3
    public ByteString getMonitoredResourceBytes() {
        return ((Monitoring.MonitoringDestination) this.instance).getMonitoredResourceBytes();
    }

    public x setMetrics(int i10, String str) {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).setMetrics(i10, str);
        return this;
    }

    public x setMonitoredResource(String str) {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).setMonitoredResource(str);
        return this;
    }

    public x setMonitoredResourceBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Monitoring.MonitoringDestination) this.instance).setMonitoredResourceBytes(byteString);
        return this;
    }
}
