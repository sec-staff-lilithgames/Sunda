package on;

import ao.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class i implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79637c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f79638e;

    public /* synthetic */ i(b bVar, g0 g0Var, int i10) {
        this.f79636b = i10;
        this.f79637c = bVar;
        this.f79638e = g0Var;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79636b) {
            case 0:
                ((c0) dVar).onUpstreamDiscarded(this.f79637c, this.f79638e);
                break;
            default:
                ((c0) dVar).onDownstreamFormatChanged(this.f79637c, this.f79638e);
                break;
        }
    }
}
