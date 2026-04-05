package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class h0 implements com.google.android.exoplayer2.util.a0, io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f27501c;

    public /* synthetic */ h0(float f10, int i10) {
        this.f27500b = i10;
        this.f27501c = f10;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        int i10 = this.f27500b;
        float f10 = this.f27501c;
        switch (i10) {
            case 0:
                int i11 = r0.f27961y0;
                ((p2) obj).onVolumeChanged(f10);
                break;
            default:
                int i12 = io.bidmachine.media3.exoplayer.l0.A0;
                ((gn.g1) obj).onVolumeChanged(f10);
                break;
        }
    }
}
