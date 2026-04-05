package ao;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class p0 implements io.bidmachine.media3.common.util.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f7774c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f7775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f7776f;

    public /* synthetic */ p0(r0 r0Var, b0 b0Var, g0 g0Var, int i10) {
        this.f7773b = i10;
        this.f7774c = r0Var;
        this.f7775e = b0Var;
        this.f7776f = g0Var;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public final void accept(Object obj) {
        s0 s0Var = (s0) obj;
        switch (this.f7773b) {
            case 0:
                r0 r0Var = this.f7774c;
                s0Var.onLoadCompleted(r0Var.f7805a, r0Var.f7806b, this.f7775e, this.f7776f);
                break;
            default:
                r0 r0Var2 = this.f7774c;
                s0Var.onLoadCanceled(r0Var2.f7805a, r0Var2.f7806b, this.f7775e, this.f7776f);
                break;
        }
    }
}
