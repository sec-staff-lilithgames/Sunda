package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbdz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcve implements zzdac, com.google.android.gms.ads.internal.client.zza, zzdbu, zzczi, zzcyo, zzdef {
    private final Clock zza;
    private final zzcbd zzb;

    public zzcve(Clock clock, zzcbd zzcbdVar) {
        this.zza = clock;
        this.zzb = zzcbdVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(zzfgf zzfgfVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdx() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(zzbdz.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzl(zzbdz.zzb zzbVar) {
        this.zzb.zzc();
    }

    public final String zzp() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdy() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzk(zzbdz.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzm(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzd(zzbxv zzbxvVar, String str, String str2) {
    }
}
