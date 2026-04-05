package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzemo extends zzbro {
    private final zzcym zza;
    private final zzdgt zzb;
    private final zzczg zzc;
    private final zzczv zzd;
    private final zzdaa zze;
    private final zzdds zzf;
    private final zzdaz zzg;
    private final zzdhr zzh;
    private final zzddo zzi;
    private final zzczb zzj;

    public zzemo(zzcym zzcymVar, zzdgt zzdgtVar, zzczg zzczgVar, zzczv zzczvVar, zzdaa zzdaaVar, zzdds zzddsVar, zzdaz zzdazVar, zzdhr zzdhrVar, zzddo zzddoVar, zzczb zzczbVar) {
        this.zza = zzcymVar;
        this.zzb = zzdgtVar;
        this.zzc = zzczgVar;
        this.zzd = zzczvVar;
        this.zze = zzdaaVar;
        this.zzf = zzddsVar;
        this.zzg = zzdazVar;
        this.zzh = zzdhrVar;
        this.zzi = zzddoVar;
        this.zzj = zzczbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdz();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzf() {
        this.zzg.zzdY(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzq() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    @Deprecated
    public final void zzs(int i10) throws RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i10, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfhp.zzc(8, zzeVar));
    }

    public void zzt() throws RemoteException {
    }

    public void zzz() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzg(int i10) {
    }

    public void zzp(zzbyh zzbyhVar) {
    }

    public void zzr(zzbyl zzbylVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzm(zzbjc zzbjcVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzw(int i10, String str) {
    }
}
