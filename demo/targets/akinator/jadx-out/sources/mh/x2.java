package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x2 implements v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final transient Object f74715b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final v2 f74716c;

    /* renamed from: e, reason: collision with root package name */
    public volatile transient boolean f74717e;

    /* renamed from: f, reason: collision with root package name */
    public transient Object f74718f;

    public x2(v2 v2Var) {
        this.f74716c = (v2) p1.checkNotNull(v2Var);
    }

    @Override // mh.v2
    public Object get() {
        if (!this.f74717e) {
            synchronized (this.f74715b) {
                try {
                    if (!this.f74717e) {
                        Object obj = this.f74716c.get();
                        this.f74718f = obj;
                        this.f74717e = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f74718f;
    }

    public String toString() {
        return w0.i.e(new StringBuilder("Suppliers.memoize("), this.f74717e ? w0.i.e(new StringBuilder("<supplier that returned "), this.f74718f, ">") : this.f74716c, ")");
    }
}
