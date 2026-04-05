package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class o0 implements com.google.android.exoplayer2.util.a0, io.bidmachine.media3.common.util.w, rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27850c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f27851e;

    public /* synthetic */ o0(int i10, boolean z10, int i11) {
        this.f27849b = i11;
        this.f27850c = i10;
        this.f27851e = z10;
    }

    @Override // rr.b
    public Object get() {
        yp.k kVar = yp.k.D;
        return "MediaView videoPlayerActivityClosed, position: " + this.f27850c + ", finished: " + this.f27851e;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        switch (this.f27849b) {
            case 0:
                ((p2) obj).onDeviceVolumeChanged(this.f27850c, this.f27851e);
                break;
            default:
                ((gn.g1) obj).onDeviceVolumeChanged(this.f27850c, this.f27851e);
                break;
        }
    }
}
