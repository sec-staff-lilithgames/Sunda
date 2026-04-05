package com.google.android.exoplayer2;

import io.bidmachine.BidMachine;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class g0 implements com.google.android.exoplayer2.util.a0, rr.b, io.bidmachine.media3.common.util.w, o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27495c;

    public /* synthetic */ g0(boolean z10, int i10) {
        this.f27494b = i10;
        this.f27495c = z10;
    }

    @Override // rr.b
    public Object get() {
        return BidMachine.lambda$setTestMode$2(this.f27495c);
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        int i10 = this.f27494b;
        boolean z10 = this.f27495c;
        switch (i10) {
            case 0:
                int i11 = r0.f27961y0;
                ((p2) obj).onShuffleModeEnabledChanged(z10);
                break;
            case 1:
                int i12 = r0.f27961y0;
                ((p2) obj).onSkipSilenceEnabledChanged(z10);
                break;
            case 2:
                ((p2) obj).onSkipSilenceEnabledChanged(z10);
                break;
            case 3:
            default:
                ((l0.c) obj).onShuffleModeEnabledChanged(z10);
                break;
            case 4:
                int i13 = io.bidmachine.media3.exoplayer.l0.A0;
                ((gn.g1) obj).onShuffleModeEnabledChanged(z10);
                break;
            case 5:
                int i14 = io.bidmachine.media3.exoplayer.l0.A0;
                ((gn.g1) obj).onSkipSilenceEnabledChanged(z10);
                break;
            case 6:
                ((gn.g1) obj).onSkipSilenceEnabledChanged(z10);
                break;
        }
    }
}
