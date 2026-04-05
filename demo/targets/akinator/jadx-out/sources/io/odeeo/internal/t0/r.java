package io.odeeo.internal.t0;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r<T> extends i<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final i<? super T> f66451a;

    public r(i<? super T> iVar) {
        this.f66451a = (i) u.checkNotNull(iVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f66451a.equals(((r) obj).f66451a);
        }
        return false;
    }

    public int hashCode() {
        return this.f66451a.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.f66451a + ".pairwise()";
    }

    @Override // io.odeeo.internal.t0.i
    public boolean a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f66451a.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // io.odeeo.internal.t0.i
    public int a(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.f66451a.hash(it.next());
        }
        return iHash;
    }
}
