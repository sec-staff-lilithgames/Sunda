package pu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends wt.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f81850b;

    public g(h hVar) {
        this.f81850b = hVar;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public void clear() {
        this.f81850b.f81851b.clear();
    }

    @Override // wt.b, vt.j, pt.c
    public void dispose() {
        if (this.f81850b.f81855g) {
            return;
        }
        this.f81850b.f81855g = true;
        this.f81850b.d();
        this.f81850b.f81852c.lazySet(null);
        if (this.f81850b.f81859k.getAndIncrement() == 0) {
            this.f81850b.f81852c.lazySet(null);
            h hVar = this.f81850b;
            if (hVar.f81860l) {
                return;
            }
            hVar.f81851b.clear();
        }
    }

    @Override // wt.b, vt.j, pt.c
    public boolean isDisposed() {
        return this.f81850b.f81855g;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f81850b.f81851b.isEmpty();
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        return this.f81850b.f81851b.poll();
    }

    @Override // wt.b, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f81850b.f81860l = true;
        return 2;
    }
}
