package io.odeeo.internal.a;

import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b<V> extends c {

    /* renamed from: b, reason: collision with root package name */
    public final V f62202b;

    public b(V v10) {
        super(null);
        this.f62202b = v10;
    }

    @Override // io.odeeo.internal.a.c
    public V component1() {
        return this.f62202b;
    }

    @Override // io.odeeo.internal.a.c
    public Void component2() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e0.areEqual(c1.getOrCreateKotlinClass(b.class), c1.getOrCreateKotlinClass(obj.getClass())) && e0.areEqual(this.f62202b, ((b) obj).f62202b);
    }

    public final V getValue() {
        return this.f62202b;
    }

    public int hashCode() {
        V v10 = this.f62202b;
        if (v10 != null) {
            return v10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Ok(" + this.f62202b + ')';
    }
}
