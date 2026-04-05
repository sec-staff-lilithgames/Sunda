package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzerz implements zzexy {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;
    public final boolean zzk;

    public zzerz(int i10, boolean z10, boolean z11, int i11, int i12, int i13, int i14, int i15, float f10, boolean z12, boolean z13) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = f10;
        this.zzj = z12;
        this.zzk = z13;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcxq) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlY)).booleanValue()) {
            bundle.putInt("muv_min", this.zze);
            bundle.putInt("muv_max", this.zzf);
        }
        bundle.putFloat("android_app_volume", this.zzi);
        bundle.putBoolean("android_app_muted", this.zzj);
        if (this.zzk) {
            return;
        }
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        bundle.putInt("rm", this.zzg);
        bundle.putInt("riv", this.zzh);
    }
}
