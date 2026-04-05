package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g4 implements dn.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewAdObject f60366a;

    public g4(ViewAdObject viewAdObject) {
        this.f60366a = viewAdObject;
    }

    @Override // dn.i
    public boolean onViewShown() {
        return this.f60366a.getProcessCallback().processVisibilityTrackerShown();
    }

    @Override // dn.i
    public void onViewTrackingFinished() {
        this.f60366a.getProcessCallback().processVisibilityTrackerImpression();
    }
}
