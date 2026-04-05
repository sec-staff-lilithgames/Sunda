package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdxv implements zzdfw {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final synchronized void zza(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final synchronized void zzb(String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final synchronized void zzc(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfw
    public final void zzd(String str) {
    }
}
