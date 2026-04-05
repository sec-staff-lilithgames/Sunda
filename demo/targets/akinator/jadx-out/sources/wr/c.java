package wr;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f90841b = new c(new IdentityHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f90842a;

    public c(IdentityHashMap identityHashMap) {
        this.f90842a = identityHashMap;
    }

    @Deprecated
    public static a newBuilder(c cVar) {
        mh.p1.checkNotNull(cVar, "base");
        return new a(cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((c) obj).f90842a;
        IdentityHashMap identityHashMap2 = this.f90842a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !mh.h1.equal(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public <T> T get(b bVar) {
        return (T) this.f90842a.get(bVar);
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f90842a.entrySet()) {
            iHashCode += mh.h1.hashCode(entry.getKey(), entry.getValue());
        }
        return iHashCode;
    }

    @Deprecated
    public Set<b> keys() {
        return Collections.unmodifiableSet(this.f90842a.keySet());
    }

    public a toBuilder() {
        return new a(this);
    }

    public String toString() {
        return this.f90842a.toString();
    }

    public static a newBuilder() {
        return new a(f90841b);
    }
}
