package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends GeneratedMessageLite.Builder implements j {
    public i clearNumFiniteBuckets() {
        copyOnWrite();
        ((Distribution.BucketOptions.Linear) this.instance).clearNumFiniteBuckets();
        return this;
    }

    public i clearOffset() {
        copyOnWrite();
        ((Distribution.BucketOptions.Linear) this.instance).clearOffset();
        return this;
    }

    public i clearWidth() {
        copyOnWrite();
        ((Distribution.BucketOptions.Linear) this.instance).clearWidth();
        return this;
    }

    @Override // com.google.api.j
    public int getNumFiniteBuckets() {
        return ((Distribution.BucketOptions.Linear) this.instance).getNumFiniteBuckets();
    }

    @Override // com.google.api.j
    public double getOffset() {
        return ((Distribution.BucketOptions.Linear) this.instance).getOffset();
    }

    @Override // com.google.api.j
    public double getWidth() {
        return ((Distribution.BucketOptions.Linear) this.instance).getWidth();
    }

    public i setNumFiniteBuckets(int i10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Linear) this.instance).setNumFiniteBuckets(i10);
        return this;
    }

    public i setOffset(double d10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Linear) this.instance).setOffset(d10);
        return this;
    }

    public i setWidth(double d10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Linear) this.instance).setWidth(d10);
        return this;
    }
}
