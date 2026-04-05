package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y2 implements v2 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.android.exoplayer2.w f74722f = new com.google.android.exoplayer2.w(3);

    /* renamed from: b, reason: collision with root package name */
    public final Object f74723b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public volatile v2 f74724c;

    /* renamed from: e, reason: collision with root package name */
    public Object f74725e;

    public y2(v2 v2Var) {
        this.f74724c = (v2) p1.checkNotNull(v2Var);
    }

    @Override // mh.v2
    public Object get() {
        v2 v2Var = this.f74724c;
        com.google.android.exoplayer2.w wVar = f74722f;
        if (v2Var != wVar) {
            synchronized (this.f74723b) {
                try {
                    if (this.f74724c != wVar) {
                        Object obj = this.f74724c.get();
                        this.f74725e = obj;
                        this.f74724c = wVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f74725e;
    }

    public String toString() {
        Object objE = this.f74724c;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (objE == f74722f) {
            objE = w0.i.e(new StringBuilder("<supplier that returned "), this.f74725e, ">");
        }
        return w0.i.e(sb2, objE, ")");
    }
}
