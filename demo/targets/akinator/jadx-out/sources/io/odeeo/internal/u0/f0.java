package io.odeeo.internal.u0;

import io.odeeo.internal.u0.p2;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0<T> extends p2<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j1<T, Integer> f66767a;

    public f0(List<T> list) {
        this(d2.a(list));
    }

    public final int a(T t10) {
        Integer num = this.f66767a.get(t10);
        if (num != null) {
            return num.intValue();
        }
        throw new p2.c(t10);
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(T t10, T t11) {
        return a(t10) - a(t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            return this.f66767a.equals(((f0) obj).f66767a);
        }
        return false;
    }

    public int hashCode() {
        return this.f66767a.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f66767a.keySet() + ")";
    }

    public f0(j1<T, Integer> j1Var) {
        this.f66767a = j1Var;
    }
}
