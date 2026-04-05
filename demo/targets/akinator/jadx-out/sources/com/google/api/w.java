package com.google.api;

import com.google.api.Monitoring;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w extends GeneratedMessageLite.Builder implements y {
    public w addAllConsumerDestinations(Iterable<? extends Monitoring.MonitoringDestination> iterable) {
        copyOnWrite();
        ((Monitoring) this.instance).addAllConsumerDestinations(iterable);
        return this;
    }

    public w addAllProducerDestinations(Iterable<? extends Monitoring.MonitoringDestination> iterable) {
        copyOnWrite();
        ((Monitoring) this.instance).addAllProducerDestinations(iterable);
        return this;
    }

    public w addConsumerDestinations(Monitoring.MonitoringDestination monitoringDestination) {
        copyOnWrite();
        ((Monitoring) this.instance).addConsumerDestinations(monitoringDestination);
        return this;
    }

    public w addProducerDestinations(Monitoring.MonitoringDestination monitoringDestination) {
        copyOnWrite();
        ((Monitoring) this.instance).addProducerDestinations(monitoringDestination);
        return this;
    }

    public w clearConsumerDestinations() {
        copyOnWrite();
        ((Monitoring) this.instance).clearConsumerDestinations();
        return this;
    }

    public w clearProducerDestinations() {
        copyOnWrite();
        ((Monitoring) this.instance).clearProducerDestinations();
        return this;
    }

    @Override // com.google.api.y
    public Monitoring.MonitoringDestination getConsumerDestinations(int i10) {
        return ((Monitoring) this.instance).getConsumerDestinations(i10);
    }

    @Override // com.google.api.y
    public int getConsumerDestinationsCount() {
        return ((Monitoring) this.instance).getConsumerDestinationsCount();
    }

    @Override // com.google.api.y
    public List<Monitoring.MonitoringDestination> getConsumerDestinationsList() {
        return Collections.unmodifiableList(((Monitoring) this.instance).getConsumerDestinationsList());
    }

    @Override // com.google.api.y
    public Monitoring.MonitoringDestination getProducerDestinations(int i10) {
        return ((Monitoring) this.instance).getProducerDestinations(i10);
    }

    @Override // com.google.api.y
    public int getProducerDestinationsCount() {
        return ((Monitoring) this.instance).getProducerDestinationsCount();
    }

    @Override // com.google.api.y
    public List<Monitoring.MonitoringDestination> getProducerDestinationsList() {
        return Collections.unmodifiableList(((Monitoring) this.instance).getProducerDestinationsList());
    }

    public w removeConsumerDestinations(int i10) {
        copyOnWrite();
        ((Monitoring) this.instance).removeConsumerDestinations(i10);
        return this;
    }

    public w removeProducerDestinations(int i10) {
        copyOnWrite();
        ((Monitoring) this.instance).removeProducerDestinations(i10);
        return this;
    }

    public w setConsumerDestinations(int i10, Monitoring.MonitoringDestination monitoringDestination) {
        copyOnWrite();
        ((Monitoring) this.instance).setConsumerDestinations(i10, monitoringDestination);
        return this;
    }

    public w setProducerDestinations(int i10, Monitoring.MonitoringDestination monitoringDestination) {
        copyOnWrite();
        ((Monitoring) this.instance).setProducerDestinations(i10, monitoringDestination);
        return this;
    }

    public w addConsumerDestinations(int i10, Monitoring.MonitoringDestination monitoringDestination) {
        copyOnWrite();
        ((Monitoring) this.instance).addConsumerDestinations(i10, monitoringDestination);
        return this;
    }

    public w addProducerDestinations(int i10, Monitoring.MonitoringDestination monitoringDestination) {
        copyOnWrite();
        ((Monitoring) this.instance).addProducerDestinations(i10, monitoringDestination);
        return this;
    }

    public w setConsumerDestinations(int i10, x xVar) {
        copyOnWrite();
        ((Monitoring) this.instance).setConsumerDestinations(i10, (Monitoring.MonitoringDestination) xVar.build());
        return this;
    }

    public w setProducerDestinations(int i10, x xVar) {
        copyOnWrite();
        ((Monitoring) this.instance).setProducerDestinations(i10, (Monitoring.MonitoringDestination) xVar.build());
        return this;
    }

    public w addConsumerDestinations(x xVar) {
        copyOnWrite();
        ((Monitoring) this.instance).addConsumerDestinations((Monitoring.MonitoringDestination) xVar.build());
        return this;
    }

    public w addProducerDestinations(x xVar) {
        copyOnWrite();
        ((Monitoring) this.instance).addProducerDestinations((Monitoring.MonitoringDestination) xVar.build());
        return this;
    }

    public w addConsumerDestinations(int i10, x xVar) {
        copyOnWrite();
        ((Monitoring) this.instance).addConsumerDestinations(i10, (Monitoring.MonitoringDestination) xVar.build());
        return this;
    }

    public w addProducerDestinations(int i10, x xVar) {
        copyOnWrite();
        ((Monitoring) this.instance).addProducerDestinations(i10, (Monitoring.MonitoringDestination) xVar.build());
        return this;
    }
}
