package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f92494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f92495c;

    public f2(u2 u2Var, StringBuilder sb2) {
        this.f92495c = u2Var;
        this.f92494b = sb2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92495c.a(wr.m6.f91040h.withDescription(this.f92494b.toString()), true);
    }
}
