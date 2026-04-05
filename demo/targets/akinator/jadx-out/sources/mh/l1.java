package mh;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l1 extends u0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f74650b;

    public l1(u0 u0Var) {
        this.f74650b = (u0) p1.checkNotNull(u0Var);
    }

    @Override // mh.u0
    public final boolean a(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f74650b.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // mh.u0
    public final int b(Object obj) {
        Iterator it = ((Iterable) obj).iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.f74650b.hash(it.next());
        }
        return iHash;
    }

    @Override // mh.u0
    public boolean equals(Object obj) {
        if (obj instanceof l1) {
            return this.f74650b.equals(((l1) obj).f74650b);
        }
        return false;
    }

    public int hashCode() {
        return this.f74650b.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.f74650b + ".pairwise()";
    }
}
