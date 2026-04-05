package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhfb {
    private static final zzhfb zza = (zzhfb) zzhgh.zza(zzhfa.zza);
    private final AtomicReference zzb = new AtomicReference(new zzhgf(new zzhgc(), null));

    public static zzhfb zza() {
        return zza;
    }

    public final synchronized void zzb(zzhec zzhecVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhgc zzhgcVar = new zzhgc((zzhgf) atomicReference.get());
        zzhgcVar.zza(zzhecVar);
        atomicReference.set(new zzhgf(zzhgcVar, null));
    }

    public final synchronized void zzc(zzhdz zzhdzVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhgc zzhgcVar = new zzhgc((zzhgf) atomicReference.get());
        zzhgcVar.zzb(zzhdzVar);
        atomicReference.set(new zzhgf(zzhgcVar, null));
    }

    public final synchronized void zzd(zzhfi zzhfiVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhgc zzhgcVar = new zzhgc((zzhgf) atomicReference.get());
        zzhgcVar.zzc(zzhfiVar);
        atomicReference.set(new zzhgf(zzhgcVar, null));
    }

    public final synchronized void zze(zzhff zzhffVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhgc zzhgcVar = new zzhgc((zzhgf) atomicReference.get());
        zzhgcVar.zzd(zzhffVar);
        atomicReference.set(new zzhgf(zzhgcVar, null));
    }

    public final boolean zzf(zzhgb zzhgbVar) {
        return ((zzhgf) this.zzb.get()).zza(zzhgbVar);
    }

    public final zzgvt zzg(zzhgb zzhgbVar, zzgwn zzgwnVar) throws GeneralSecurityException {
        return ((zzhgf) this.zzb.get()).zzb(zzhgbVar, zzgwnVar);
    }

    public final zzhgb zzh(zzgvt zzgvtVar, Class cls, zzgwn zzgwnVar) throws GeneralSecurityException {
        return ((zzhgf) this.zzb.get()).zzc(zzgvtVar, cls, zzgwnVar);
    }

    public final boolean zzi(zzhgb zzhgbVar) {
        return ((zzhgf) this.zzb.get()).zzd(zzhgbVar);
    }

    public final zzgwj zzj(zzhgb zzhgbVar) throws GeneralSecurityException {
        return ((zzhgf) this.zzb.get()).zze(zzhgbVar);
    }

    public final zzhgb zzk(zzgwj zzgwjVar, Class cls) throws GeneralSecurityException {
        return ((zzhgf) this.zzb.get()).zzf(zzgwjVar, cls);
    }
}
