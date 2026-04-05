package on;

import gn.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class g implements io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f79630c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f79631e;

    public /* synthetic */ g(b bVar, b1 b1Var, int i10) {
        this.f79629b = i10;
        this.f79630c = bVar;
        this.f79631e = b1Var;
    }

    @Override // io.bidmachine.media3.common.util.w
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f79629b) {
            case 0:
                ((c0) dVar).onPlayerErrorChanged(this.f79630c, this.f79631e);
                break;
            default:
                ((c0) dVar).onPlayerError(this.f79630c, this.f79631e);
                break;
        }
    }
}
