package com.facebook.ads.redexgen.core;

import java.util.Objects;

/* renamed from: com.facebook.ads.redexgen.X.1X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1X extends AbstractC1081Am<Object> {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public C1X(Object[] alternatingKeysAndValues, int offset, int size) {
        this.A02 = alternatingKeysAndValues;
        this.A00 = offset;
        this.A01 = size;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public final boolean A0K() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int index) {
        AbstractC2279jA.A00(index, this.A01);
        return Objects.requireNonNull(this.A02[(index * 2) + this.A00]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
