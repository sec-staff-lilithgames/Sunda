package com.google.api;

import com.google.api.Logging;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q extends GeneratedMessageLite.Builder implements s {
    public q addAllConsumerDestinations(Iterable<? extends Logging.LoggingDestination> iterable) {
        copyOnWrite();
        ((Logging) this.instance).addAllConsumerDestinations(iterable);
        return this;
    }

    public q addAllProducerDestinations(Iterable<? extends Logging.LoggingDestination> iterable) {
        copyOnWrite();
        ((Logging) this.instance).addAllProducerDestinations(iterable);
        return this;
    }

    public q addConsumerDestinations(Logging.LoggingDestination loggingDestination) {
        copyOnWrite();
        ((Logging) this.instance).addConsumerDestinations(loggingDestination);
        return this;
    }

    public q addProducerDestinations(Logging.LoggingDestination loggingDestination) {
        copyOnWrite();
        ((Logging) this.instance).addProducerDestinations(loggingDestination);
        return this;
    }

    public q clearConsumerDestinations() {
        copyOnWrite();
        ((Logging) this.instance).clearConsumerDestinations();
        return this;
    }

    public q clearProducerDestinations() {
        copyOnWrite();
        ((Logging) this.instance).clearProducerDestinations();
        return this;
    }

    @Override // com.google.api.s
    public Logging.LoggingDestination getConsumerDestinations(int i10) {
        return ((Logging) this.instance).getConsumerDestinations(i10);
    }

    @Override // com.google.api.s
    public int getConsumerDestinationsCount() {
        return ((Logging) this.instance).getConsumerDestinationsCount();
    }

    @Override // com.google.api.s
    public List<Logging.LoggingDestination> getConsumerDestinationsList() {
        return Collections.unmodifiableList(((Logging) this.instance).getConsumerDestinationsList());
    }

    @Override // com.google.api.s
    public Logging.LoggingDestination getProducerDestinations(int i10) {
        return ((Logging) this.instance).getProducerDestinations(i10);
    }

    @Override // com.google.api.s
    public int getProducerDestinationsCount() {
        return ((Logging) this.instance).getProducerDestinationsCount();
    }

    @Override // com.google.api.s
    public List<Logging.LoggingDestination> getProducerDestinationsList() {
        return Collections.unmodifiableList(((Logging) this.instance).getProducerDestinationsList());
    }

    public q removeConsumerDestinations(int i10) {
        copyOnWrite();
        ((Logging) this.instance).removeConsumerDestinations(i10);
        return this;
    }

    public q removeProducerDestinations(int i10) {
        copyOnWrite();
        ((Logging) this.instance).removeProducerDestinations(i10);
        return this;
    }

    public q setConsumerDestinations(int i10, Logging.LoggingDestination loggingDestination) {
        copyOnWrite();
        ((Logging) this.instance).setConsumerDestinations(i10, loggingDestination);
        return this;
    }

    public q setProducerDestinations(int i10, Logging.LoggingDestination loggingDestination) {
        copyOnWrite();
        ((Logging) this.instance).setProducerDestinations(i10, loggingDestination);
        return this;
    }

    public q addConsumerDestinations(int i10, Logging.LoggingDestination loggingDestination) {
        copyOnWrite();
        ((Logging) this.instance).addConsumerDestinations(i10, loggingDestination);
        return this;
    }

    public q addProducerDestinations(int i10, Logging.LoggingDestination loggingDestination) {
        copyOnWrite();
        ((Logging) this.instance).addProducerDestinations(i10, loggingDestination);
        return this;
    }

    public q setConsumerDestinations(int i10, r rVar) {
        copyOnWrite();
        ((Logging) this.instance).setConsumerDestinations(i10, (Logging.LoggingDestination) rVar.build());
        return this;
    }

    public q setProducerDestinations(int i10, r rVar) {
        copyOnWrite();
        ((Logging) this.instance).setProducerDestinations(i10, (Logging.LoggingDestination) rVar.build());
        return this;
    }

    public q addConsumerDestinations(r rVar) {
        copyOnWrite();
        ((Logging) this.instance).addConsumerDestinations((Logging.LoggingDestination) rVar.build());
        return this;
    }

    public q addProducerDestinations(r rVar) {
        copyOnWrite();
        ((Logging) this.instance).addProducerDestinations((Logging.LoggingDestination) rVar.build());
        return this;
    }

    public q addConsumerDestinations(int i10, r rVar) {
        copyOnWrite();
        ((Logging) this.instance).addConsumerDestinations(i10, (Logging.LoggingDestination) rVar.build());
        return this;
    }

    public q addProducerDestinations(int i10, r rVar) {
        copyOnWrite();
        ((Logging) this.instance).addProducerDestinations(i10, (Logging.LoggingDestination) rVar.build());
        return this;
    }
}
