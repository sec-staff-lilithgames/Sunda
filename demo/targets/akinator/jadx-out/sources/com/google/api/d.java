package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends GeneratedMessageLite.Builder implements l {
    public d clearExplicitBuckets() {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).clearExplicitBuckets();
        return this;
    }

    public d clearExponentialBuckets() {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).clearExponentialBuckets();
        return this;
    }

    public d clearLinearBuckets() {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).clearLinearBuckets();
        return this;
    }

    public d clearOptions() {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).clearOptions();
        return this;
    }

    @Override // com.google.api.l
    public Distribution.BucketOptions.Explicit getExplicitBuckets() {
        return ((Distribution.BucketOptions) this.instance).getExplicitBuckets();
    }

    @Override // com.google.api.l
    public Distribution.BucketOptions.Exponential getExponentialBuckets() {
        return ((Distribution.BucketOptions) this.instance).getExponentialBuckets();
    }

    @Override // com.google.api.l
    public Distribution.BucketOptions.Linear getLinearBuckets() {
        return ((Distribution.BucketOptions) this.instance).getLinearBuckets();
    }

    @Override // com.google.api.l
    public k getOptionsCase() {
        return ((Distribution.BucketOptions) this.instance).getOptionsCase();
    }

    @Override // com.google.api.l
    public boolean hasExplicitBuckets() {
        return ((Distribution.BucketOptions) this.instance).hasExplicitBuckets();
    }

    @Override // com.google.api.l
    public boolean hasExponentialBuckets() {
        return ((Distribution.BucketOptions) this.instance).hasExponentialBuckets();
    }

    @Override // com.google.api.l
    public boolean hasLinearBuckets() {
        return ((Distribution.BucketOptions) this.instance).hasLinearBuckets();
    }

    public d mergeExplicitBuckets(Distribution.BucketOptions.Explicit explicit) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).mergeExplicitBuckets(explicit);
        return this;
    }

    public d mergeExponentialBuckets(Distribution.BucketOptions.Exponential exponential) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).mergeExponentialBuckets(exponential);
        return this;
    }

    public d mergeLinearBuckets(Distribution.BucketOptions.Linear linear) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).mergeLinearBuckets(linear);
        return this;
    }

    public d setExplicitBuckets(Distribution.BucketOptions.Explicit explicit) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).setExplicitBuckets(explicit);
        return this;
    }

    public d setExponentialBuckets(Distribution.BucketOptions.Exponential exponential) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).setExponentialBuckets(exponential);
        return this;
    }

    public d setLinearBuckets(Distribution.BucketOptions.Linear linear) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).setLinearBuckets(linear);
        return this;
    }

    public d setExplicitBuckets(e eVar) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).setExplicitBuckets((Distribution.BucketOptions.Explicit) eVar.build());
        return this;
    }

    public d setExponentialBuckets(g gVar) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).setExponentialBuckets((Distribution.BucketOptions.Exponential) gVar.build());
        return this;
    }

    public d setLinearBuckets(i iVar) {
        copyOnWrite();
        ((Distribution.BucketOptions) this.instance).setLinearBuckets((Distribution.BucketOptions.Linear) iVar.build());
        return this;
    }
}
