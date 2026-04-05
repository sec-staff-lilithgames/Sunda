package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfz extends zzef {
    private final VideoController.VideoLifecycleCallbacks zza;

    public zzfz(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeg
    public final void zze() {
        this.zza.onVideoStart();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeg
    public final void zzf() {
        this.zza.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeg
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeg
    public final void zzh() {
        this.zza.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeg
    public final void zzi(boolean z10) {
        this.zza.onVideoMute(z10);
    }
}
