package nh;

import java.io.Serializable;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class kc implements mh.v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f76424b;

    public kc(int i10) {
        jh.i.o(i10, "expectedValuesPerKey");
        this.f76424b = i10;
    }

    @Override // mh.v2
    public Set<Object> get() {
        return h2.createWithExpectedSize(this.f76424b);
    }
}
