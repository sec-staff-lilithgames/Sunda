package wr;

import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public c f90798a;

    /* renamed from: b, reason: collision with root package name */
    public IdentityHashMap f90799b;

    public a(c cVar) {
        this.f90798a = cVar;
    }

    public c build() {
        if (this.f90799b != null) {
            for (Map.Entry entry : this.f90798a.f90842a.entrySet()) {
                if (!this.f90799b.containsKey(entry.getKey())) {
                    this.f90799b.put((b) entry.getKey(), entry.getValue());
                }
            }
            this.f90798a = new c(this.f90799b);
            this.f90799b = null;
        }
        return this.f90798a;
    }

    public <T> a discard(b bVar) {
        if (this.f90798a.f90842a.containsKey(bVar)) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.f90798a.f90842a);
            identityHashMap.remove(bVar);
            this.f90798a = new c(identityHashMap);
        }
        IdentityHashMap identityHashMap2 = this.f90799b;
        if (identityHashMap2 != null) {
            identityHashMap2.remove(bVar);
        }
        return this;
    }

    public <T> a set(b bVar, T t10) {
        if (this.f90799b == null) {
            this.f90799b = new IdentityHashMap(1);
        }
        this.f90799b.put(bVar, t10);
        return this;
    }

    public a setAll(c cVar) {
        int size = cVar.f90842a.size();
        if (this.f90799b == null) {
            this.f90799b = new IdentityHashMap(size);
        }
        this.f90799b.putAll(cVar.f90842a);
        return this;
    }
}
