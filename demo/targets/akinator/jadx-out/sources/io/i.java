package io;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn.p f62125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f62127c;

    public i(k kVar, xn.p pVar, int i10, long j10) {
        this.f62127c = kVar;
        this.f62125a = pVar;
        this.f62126b = i10;
    }

    @Override // io.j0
    public void render(long j10) {
        this.f62127c.q0(this.f62125a, this.f62126b, j10);
    }

    @Override // io.j0
    public void skip() {
        this.f62127c.t0(this.f62125a, this.f62126b);
    }
}
