package com.google.api;

import com.google.api.Logging;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import kh.g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r extends GeneratedMessageLite.Builder implements g2 {
    public r addAllLogs(Iterable<String> iterable) {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).addAllLogs(iterable);
        return this;
    }

    public r addLogs(String str) {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).addLogs(str);
        return this;
    }

    public r addLogsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).addLogsBytes(byteString);
        return this;
    }

    public r clearLogs() {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).clearLogs();
        return this;
    }

    public r clearMonitoredResource() {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).clearMonitoredResource();
        return this;
    }

    @Override // kh.g2
    public String getLogs(int i10) {
        return ((Logging.LoggingDestination) this.instance).getLogs(i10);
    }

    @Override // kh.g2
    public ByteString getLogsBytes(int i10) {
        return ((Logging.LoggingDestination) this.instance).getLogsBytes(i10);
    }

    @Override // kh.g2
    public int getLogsCount() {
        return ((Logging.LoggingDestination) this.instance).getLogsCount();
    }

    @Override // kh.g2
    public List<String> getLogsList() {
        return Collections.unmodifiableList(((Logging.LoggingDestination) this.instance).getLogsList());
    }

    @Override // kh.g2
    public String getMonitoredResource() {
        return ((Logging.LoggingDestination) this.instance).getMonitoredResource();
    }

    @Override // kh.g2
    public ByteString getMonitoredResourceBytes() {
        return ((Logging.LoggingDestination) this.instance).getMonitoredResourceBytes();
    }

    public r setLogs(int i10, String str) {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).setLogs(i10, str);
        return this;
    }

    public r setMonitoredResource(String str) {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).setMonitoredResource(str);
        return this;
    }

    public r setMonitoredResourceBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Logging.LoggingDestination) this.instance).setMonitoredResourceBytes(byteString);
        return this;
    }
}
