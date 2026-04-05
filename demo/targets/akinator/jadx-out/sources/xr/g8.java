package xr;

import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g8 extends p4.b {

    /* renamed from: a, reason: collision with root package name */
    public final d8 f92559a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.p4 f92560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f92561c;

    public g8(u8 u8Var, d8 d8Var, p4 p4Var) {
        this.f92561c = u8Var;
        this.f92559a = (d8) mh.p1.checkNotNull(d8Var, "helperImpl");
        this.f92560b = (wr.p4) mh.p1.checkNotNull(p4Var, "resolver");
    }

    @Override // wr.p4.b, wr.q4
    public void onError(wr.m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "the error status must not be OK");
        this.f92561c.f93126s.execute(new e8(this, m6Var));
    }

    @Override // wr.p4.b
    public void onResult(wr.s4 s4Var) {
        this.f92561c.f93126s.execute(new f8(this, s4Var));
    }
}
