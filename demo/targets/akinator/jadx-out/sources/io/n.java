package io;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f62192c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f62193e;

    public /* synthetic */ n(o oVar, i0 i0Var, int i10) {
        this.f62191b = i10;
        this.f62192c = oVar;
        this.f62193e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62191b) {
            case 0:
                o oVar = this.f62192c;
                oVar.getClass();
                this.f62193e.onFirstFrameRendered(oVar);
                break;
            default:
                o oVar2 = this.f62192c;
                oVar2.getClass();
                this.f62193e.onFrameDropped((l0) io.bidmachine.media3.common.util.a.checkStateNotNull(oVar2));
                break;
        }
    }
}
