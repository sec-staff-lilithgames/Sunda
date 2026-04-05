package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w2 implements v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final transient Object f74707b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final v2 f74708c;

    /* renamed from: e, reason: collision with root package name */
    public final long f74709e;

    /* renamed from: f, reason: collision with root package name */
    public volatile transient Object f74710f;

    /* renamed from: g, reason: collision with root package name */
    public volatile transient long f74711g;

    public w2(v2 v2Var, long j10) {
        this.f74708c = v2Var;
        this.f74709e = j10;
    }

    @Override // mh.v2
    public Object get() {
        long j10 = this.f74711g;
        long jNanoTime = System.nanoTime();
        if (j10 == 0 || jNanoTime - j10 >= 0) {
            synchronized (this.f74707b) {
                try {
                    if (j10 == this.f74711g) {
                        Object obj = this.f74708c.get();
                        this.f74710f = obj;
                        long j11 = jNanoTime + this.f74709e;
                        if (j11 == 0) {
                            j11 = 1;
                        }
                        this.f74711g = j11;
                        return obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f74710f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Suppliers.memoizeWithExpiration(");
        sb2.append(this.f74708c);
        sb2.append(", ");
        return a.b.g(this.f74709e, ", NANOS)", sb2);
    }
}
