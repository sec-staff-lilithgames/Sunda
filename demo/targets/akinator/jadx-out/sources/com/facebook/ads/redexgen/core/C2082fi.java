package com.facebook.ads.redexgen.core;

import com.facebook.ads.MediaViewListener;

/* renamed from: com.facebook.ads.redexgen.X.fi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2082fi implements Y1 {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C2081fh A01;

    public C2082fi(C2081fh c2081fh, MediaViewListener mediaViewListener) {
        this.A01 = c2081fh;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void ACn() {
        this.A00.onComplete(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void AD9() {
        this.A00.onEnterFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void ADF() {
        this.A00.onExitFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void ADN() {
        this.A00.onFullscreenBackground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void ADP() {
        this.A00.onFullscreenForeground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void AEX() {
        this.A00.onPlay(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void AFu() {
        this.A00.onVolumeChange(this.A01.A03, this.A01.A05.getVolume());
    }

    @Override // com.facebook.ads.redexgen.core.Y1
    public final void onPause() {
        this.A00.onPause(this.A01.A03);
    }
}
