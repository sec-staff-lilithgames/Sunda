package io.odeeo.internal.a;

import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a<E> extends c {

    /* renamed from: b, reason: collision with root package name */
    public final E f62201b;

    public a(E e10) {
        super(null);
        this.f62201b = e10;
    }

    @Override // io.odeeo.internal.a.c
    public Void component1() {
        return null;
    }

    @Override // io.odeeo.internal.a.c
    public E component2() {
        return this.f62201b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e0.areEqual(c1.getOrCreateKotlinClass(a.class), c1.getOrCreateKotlinClass(obj.getClass())) && e0.areEqual(this.f62201b, ((a) obj).f62201b);
    }

    public final E getError() {
        return this.f62201b;
    }

    public int hashCode() {
        E e10 = this.f62201b;
        if (e10 != null) {
            return e10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Err(" + this.f62201b + ')';
    }
}
