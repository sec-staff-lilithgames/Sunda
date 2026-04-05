package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e4 extends wt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10251b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f10252c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10253e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10254f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10255g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10256h;

    public e4(mt.i0 i0Var, Iterator it) {
        this.f10251b = i0Var;
        this.f10252c = it;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public void clear() {
        this.f10255g = true;
    }

    @Override // wt.c, vt.j, pt.c
    public void dispose() {
        this.f10253e = true;
    }

    @Override // wt.c, vt.j, pt.c
    public boolean isDisposed() {
        return this.f10253e;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f10255g;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public Object poll() {
        if (this.f10255g) {
            return null;
        }
        boolean z10 = this.f10256h;
        Iterator it = this.f10252c;
        if (!z10) {
            this.f10256h = true;
        } else if (!it.hasNext()) {
            this.f10255g = true;
            return null;
        }
        return ut.o0.requireNonNull(it.next(), "The iterator returned a null value");
    }

    @Override // wt.c, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 1) == 0) {
            return 0;
        }
        this.f10254f = true;
        return 1;
    }
}
