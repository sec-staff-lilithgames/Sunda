package mh;

import java.io.Serializable;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v1 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f74702b;

    public v1(Collection collection) {
        this.f74702b = (Collection) p1.checkNotNull(collection);
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        try {
            return this.f74702b.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (obj instanceof v1) {
            return this.f74702b.equals(((v1) obj).f74702b);
        }
        return false;
    }

    public int hashCode() {
        return this.f74702b.hashCode();
    }

    public String toString() {
        return "Predicates.in(" + this.f74702b + ")";
    }
}
