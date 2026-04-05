package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o0 extends q0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f74663c = new o0();

    @Override // mh.q0
    public final q0 c(q0 q0Var) {
        return (q0) p1.checkNotNull(q0Var, "otherConverter");
    }

    public String toString() {
        return "Converter.identity()";
    }

    @Override // mh.q0
    public o0 reverse() {
        return this;
    }

    @Override // mh.q0
    public final Object d(Object obj) {
        return obj;
    }

    @Override // mh.q0
    public final Object e(Object obj) {
        return obj;
    }
}
