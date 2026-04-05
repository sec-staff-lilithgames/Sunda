package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends GeneratedMessageLite.Builder implements f {
    public e addAllBounds(Iterable<? extends Double> iterable) {
        copyOnWrite();
        ((Distribution.BucketOptions.Explicit) this.instance).addAllBounds(iterable);
        return this;
    }

    public e addBounds(double d10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Explicit) this.instance).addBounds(d10);
        return this;
    }

    public e clearBounds() {
        copyOnWrite();
        ((Distribution.BucketOptions.Explicit) this.instance).clearBounds();
        return this;
    }

    @Override // com.google.api.f
    public double getBounds(int i10) {
        return ((Distribution.BucketOptions.Explicit) this.instance).getBounds(i10);
    }

    @Override // com.google.api.f
    public int getBoundsCount() {
        return ((Distribution.BucketOptions.Explicit) this.instance).getBoundsCount();
    }

    @Override // com.google.api.f
    public List<Double> getBoundsList() {
        return Collections.unmodifiableList(((Distribution.BucketOptions.Explicit) this.instance).getBoundsList());
    }

    public e setBounds(int i10, double d10) {
        copyOnWrite();
        ((Distribution.BucketOptions.Explicit) this.instance).setBounds(i10, d10);
        return this;
    }
}
