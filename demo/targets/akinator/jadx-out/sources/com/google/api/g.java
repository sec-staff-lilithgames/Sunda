package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends GeneratedMessageLite.Builder implements h {
    public g clearGrowthFactor() {
        copyOnWrite();
        ((Distribution.BucketOptions.Exponential) this.instance).clearGrowthFactor();
        return this;
    }

    public g clearNumFiniteBuckets() {
        copyOnWrite();
        ((Distribution.BucketOptions.Exponential) this.instance).clearNumFiniteBuckets();
        return this;
    }

    public g clearScale() {
        copyOnWrite();
        ((Distribution.BucketOptions.Exponential) this.instance).clearScale();
        return this;
    }

    @Override // com.google.api.h
    public double getGrowthFactor() {
        return ((Distribution.BucketOptions.Exponential) this.instance).getGrowthFactor();
    }

    @Override // com.google.api.h
    public int getNumFiniteBuckets() {
        return ((Distribution.BucketOptions.Exponential) this.instance).getNumFiniteBuckets();
    }

    @Override // com.google.api.h
    public double getScale() {
        return ((Distribution.BucketOptions.Exponential) this.instance).getScale();
    }

    public g setGrowthFactor(double d10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Exponential) this.instance).setGrowthFactor(d10);
        return this;
    }

    public g setNumFiniteBuckets(int i10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Exponential) this.instance).setNumFiniteBuckets(i10);
        return this;
    }

    public g setScale(double d10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Exponential) this.instance).setScale(d10);
        return this;
    }
}
