package b1;

import b1.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 implements p0.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.a f8625a;

    public k0(l0.a aVar) {
        this.f8625a = aVar;
    }

    @Override // p0.e1
    public void done(p0.d1 d1Var) {
        l0.a aVar = this.f8625a;
        aVar.f8648j--;
    }

    @Override // p0.e1
    public void start(p0.d1 d1Var) {
        this.f8625a.f8648j++;
    }
}
