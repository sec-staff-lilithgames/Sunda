package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class k0 implements com.google.android.exoplayer2.util.a0, io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27568c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27569e;

    public /* synthetic */ k0(int i10, int i11, int i12) {
        this.f27567b = i12;
        this.f27568c = i10;
        this.f27569e = i11;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        int i10 = this.f27567b;
        int i11 = this.f27569e;
        int i12 = this.f27568c;
        switch (i10) {
            case 0:
                int i13 = r0.f27961y0;
                ((p2) obj).onSurfaceSizeChanged(i12, i11);
                break;
            default:
                int i14 = io.bidmachine.media3.exoplayer.l0.A0;
                ((gn.g1) obj).onSurfaceSizeChanged(i12, i11);
                break;
        }
    }
}
