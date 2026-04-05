package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f80139a;

    public a0(z zVar) {
        this.f80139a = zVar;
    }

    @Override // p0.e1
    public void done(d1 d1Var) {
        z zVar = this.f80139a;
        zVar.B--;
    }

    @Override // p0.e1
    public void start(d1 d1Var) {
        this.f80139a.B++;
    }
}
