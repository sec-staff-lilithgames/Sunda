package zl;

import com.unity3d.ads.beta.xyn.RnJusJ;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class g implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f98232c;

    public /* synthetic */ g(t tVar, int i10) {
        this.f98231b = i10;
        this.f98232c = tVar;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f98231b) {
            case 0:
                return String.format("removeFromCaches (%s)", this.f98232c);
            case 1:
                return String.format("onAdShown (%s)", this.f98232c.f98280d);
            case 2:
                return String.format("onExpired (%s)", this.f98232c.f98280d);
            case 3:
                return String.format("destroy (%s)", this.f98232c.f98280d);
            case 4:
                return String.format(RnJusJ.WZXBvZcSsz, this.f98232c.f98280d);
            default:
                return String.format("load (%s)", this.f98232c.f98280d);
        }
    }
}
