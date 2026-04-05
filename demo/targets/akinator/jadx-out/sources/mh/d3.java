package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d3 implements v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final v2 f74606b;

    public d3(v2 v2Var) {
        this.f74606b = (v2) p1.checkNotNull(v2Var);
    }

    @Override // mh.v2
    public Object get() {
        Object obj;
        synchronized (this.f74606b) {
            obj = this.f74606b.get();
        }
        return obj;
    }

    public String toString() {
        return "Suppliers.synchronizedSupplier(" + this.f74606b + ")";
    }
}
