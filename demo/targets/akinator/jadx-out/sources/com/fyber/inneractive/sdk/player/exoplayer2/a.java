package com.fyber.inneractive.sdk.player.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24481a;

    /* renamed from: b, reason: collision with root package name */
    public t f24482b;

    /* renamed from: c, reason: collision with root package name */
    public int f24483c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.v f24484d;

    /* renamed from: e, reason: collision with root package name */
    public long f24485e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24486f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24487g;

    public a(int i10) {
        this.f24481a = i10;
    }

    public abstract void a(int i10, Object obj);

    public abstract void a(long j10, long j11);

    public abstract void a(boolean z10, long j10);

    public void a(o[] oVarArr) {
    }

    public final void c() {
        if (this.f24483c != 1) {
            throw new IllegalStateException();
        }
        this.f24483c = 0;
        this.f24484d = null;
        this.f24487g = false;
        g();
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return null;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public final int a(p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        int iA = this.f24484d.a(pVar, cVar, z10);
        if (iA == -4) {
            if (cVar.b(4)) {
                this.f24486f = true;
                return this.f24487g ? -4 : -3;
            }
            cVar.f24630d += this.f24485e;
            return iA;
        }
        if (iA == -5) {
            o oVar = pVar.f25722a;
            long j10 = oVar.f25718w;
            if (j10 != Long.MAX_VALUE) {
                pVar.f25722a = new o(oVar.f25696a, oVar.f25700e, oVar.f25701f, oVar.f25698c, oVar.f25697b, oVar.f25702g, oVar.f25705j, oVar.f25706k, oVar.f25707l, oVar.f25708m, oVar.f25709n, oVar.f25711p, oVar.f25710o, oVar.f25712q, oVar.f25713r, oVar.f25714s, oVar.f25715t, oVar.f25716u, oVar.f25717v, oVar.f25719x, oVar.f25720y, oVar.f25721z, j10 + this.f24485e, oVar.f25703h, oVar.f25704i, oVar.f25699d);
            }
        }
        return iA;
    }
}
