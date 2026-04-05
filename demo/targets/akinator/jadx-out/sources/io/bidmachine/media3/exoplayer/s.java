package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class s implements io.bidmachine.media3.common.util.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f61545c;

    public /* synthetic */ s(h2 h2Var, int i10) {
        this.f61544b = i10;
        this.f61545c = h2Var;
    }

    @Override // io.bidmachine.media3.common.util.d
    public final void onStateChanged(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        switch (this.f61544b) {
            case 0:
                ((h0) this.f61545c).onSelectedOutputSuitabilityChanged(bool.booleanValue());
                break;
            default:
                ((h0) this.f61545c).onSelectedOutputSuitabilityChanged(bool.booleanValue());
                break;
        }
    }
}
