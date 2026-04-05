package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;
import kh.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o extends GeneratedMessageLite.Builder implements v0 {
    public o clearMax() {
        copyOnWrite();
        ((Distribution.Range) this.instance).clearMax();
        return this;
    }

    public o clearMin() {
        copyOnWrite();
        ((Distribution.Range) this.instance).clearMin();
        return this;
    }

    @Override // kh.v0
    public double getMax() {
        return ((Distribution.Range) this.instance).getMax();
    }

    @Override // kh.v0
    public double getMin() {
        return ((Distribution.Range) this.instance).getMin();
    }

    public o setMax(double d10) {
        copyOnWrite();
        ((Distribution.Range) this.instance).setMax(d10);
        return this;
    }

    public o setMin(double d10) {
        copyOnWrite();
        ((Distribution.Range) this.instance).setMin(d10);
        return this;
    }
}
