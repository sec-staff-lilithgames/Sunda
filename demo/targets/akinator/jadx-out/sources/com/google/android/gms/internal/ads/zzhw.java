package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhw {
    public int zza = 1;
    public boolean zzb;
    public int zzc;
    private int zzd;

    public final synchronized void zza() {
        this.zzd++;
    }

    public final synchronized void zzb() {
        this.zzd--;
    }

    public final synchronized int zzc() {
        return this.zzd;
    }
}
