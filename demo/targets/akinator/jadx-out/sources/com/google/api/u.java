package com.google.api;

import com.google.api.MetricDescriptor;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import kh.b2;
import kh.l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u extends GeneratedMessageLite.Builder implements l2 {
    public u clearIngestDelay() {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).clearIngestDelay();
        return this;
    }

    @Deprecated
    public u clearLaunchStage() {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).clearLaunchStage();
        return this;
    }

    public u clearSamplePeriod() {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).clearSamplePeriod();
        return this;
    }

    @Override // kh.l2
    public Duration getIngestDelay() {
        return ((MetricDescriptor.MetricDescriptorMetadata) this.instance).getIngestDelay();
    }

    @Override // kh.l2
    @Deprecated
    public b2 getLaunchStage() {
        return ((MetricDescriptor.MetricDescriptorMetadata) this.instance).getLaunchStage();
    }

    @Override // kh.l2
    @Deprecated
    public int getLaunchStageValue() {
        return ((MetricDescriptor.MetricDescriptorMetadata) this.instance).getLaunchStageValue();
    }

    @Override // kh.l2
    public Duration getSamplePeriod() {
        return ((MetricDescriptor.MetricDescriptorMetadata) this.instance).getSamplePeriod();
    }

    @Override // kh.l2
    public boolean hasIngestDelay() {
        return ((MetricDescriptor.MetricDescriptorMetadata) this.instance).hasIngestDelay();
    }

    @Override // kh.l2
    public boolean hasSamplePeriod() {
        return ((MetricDescriptor.MetricDescriptorMetadata) this.instance).hasSamplePeriod();
    }

    public u mergeIngestDelay(Duration duration) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).mergeIngestDelay(duration);
        return this;
    }

    public u mergeSamplePeriod(Duration duration) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).mergeSamplePeriod(duration);
        return this;
    }

    public u setIngestDelay(Duration duration) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).setIngestDelay(duration);
        return this;
    }

    @Deprecated
    public u setLaunchStage(b2 b2Var) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).setLaunchStage(b2Var);
        return this;
    }

    @Deprecated
    public u setLaunchStageValue(int i10) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).setLaunchStageValue(i10);
        return this;
    }

    public u setSamplePeriod(Duration duration) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).setSamplePeriod(duration);
        return this;
    }

    public u setIngestDelay(Duration.Builder builder) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).setIngestDelay(builder.build());
        return this;
    }

    public u setSamplePeriod(Duration.Builder builder) {
        copyOnWrite();
        ((MetricDescriptor.MetricDescriptorMetadata) this.instance).setSamplePeriod(builder.build());
        return this;
    }
}
