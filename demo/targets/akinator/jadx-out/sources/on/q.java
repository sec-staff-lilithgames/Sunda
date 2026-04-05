package on;

import ao.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class q implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79663c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ao.b0 f79664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f79665f;

    public /* synthetic */ q(b bVar, ao.b0 b0Var, g0 g0Var, int i10) {
        this.f79662b = i10;
        this.f79663c = bVar;
        this.f79664e = b0Var;
        this.f79665f = g0Var;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79662b) {
            case 0:
                ((c0) dVar).onLoadCanceled(this.f79663c, this.f79664e, this.f79665f);
                break;
            default:
                ((c0) dVar).onLoadCompleted(this.f79663c, this.f79664e, this.f79665f);
                break;
        }
    }
}
