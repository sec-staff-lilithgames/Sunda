package io.odeeo.internal.u0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t3 extends p2<Object> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final t3 f67085a = new t3();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f67085a;
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
