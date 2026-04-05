package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcxx {
    private final Context zza;
    private final zzfgn zzb;
    private final Bundle zzc;
    private final zzfgg zzd;
    private final zzcxp zze;
    private final zzehp zzf;
    private final int zzg;

    public /* synthetic */ zzcxx(zzcxw zzcxwVar, byte[] bArr) {
        this.zza = zzcxwVar.zzi();
        this.zzb = zzcxwVar.zzj();
        this.zzc = zzcxwVar.zzk();
        this.zzd = zzcxwVar.zzl();
        this.zze = zzcxwVar.zzm();
        this.zzf = zzcxwVar.zzn();
        this.zzg = zzcxwVar.zzo();
    }

    public final zzcxw zza() {
        zzcxw zzcxwVar = new zzcxw();
        zzcxwVar.zza(this.zza);
        zzcxwVar.zzb(this.zzb);
        zzcxwVar.zzc(this.zzc);
        zzcxwVar.zzd(this.zze);
        zzcxwVar.zzg(this.zzf);
        return zzcxwVar;
    }

    public final zzfgn zzb() {
        return this.zzb;
    }

    public final zzfgg zzc() {
        return this.zzd;
    }

    public final Bundle zzd() {
        return this.zzc;
    }

    public final zzcxp zze() {
        return this.zze;
    }

    public final Context zzf(Context context) {
        return this.zza;
    }

    public final zzehp zzg(String str) {
        zzehp zzehpVar = this.zzf;
        return zzehpVar != null ? zzehpVar : new zzehp(str);
    }

    public final int zzh() {
        return this.zzg;
    }
}
