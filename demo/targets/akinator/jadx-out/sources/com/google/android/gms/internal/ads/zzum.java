package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzum implements zzus, zzur {
    public final zzuu zza;
    private final long zzb;
    private final zzyv zzc;
    private zzuw zzd;
    private zzus zze;
    private zzur zzf;
    private long zzg = C.TIME_UNSET;

    public zzum(zzuu zzuuVar, zzyv zzyvVar, long j10) {
        this.zza = zzuuVar;
        this.zzc = zzyvVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzg;
        return j11 != C.TIME_UNSET ? j11 : j10;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzb(zzur zzurVar, long j10) {
        this.zzf = zzurVar;
        zzus zzusVar = this.zze;
        if (zzusVar != null) {
            zzusVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzc() throws IOException {
        zzus zzusVar = this.zze;
        if (zzusVar != null) {
            zzusVar.zzc();
            return;
        }
        zzuw zzuwVar = this.zzd;
        if (zzuwVar != null) {
            zzuwVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final zzwv zzd() {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        return zzusVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zze(zzyk[] zzykVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j10) {
        long j11 = this.zzg;
        long j12 = (j11 == C.TIME_UNSET || j10 != this.zzb) ? j10 : j11;
        this.zzg = C.TIME_UNSET;
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        return zzusVar.zze(zzykVarArr, zArr, zzwkVarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzf(long j10, boolean z10) {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        zzusVar.zzf(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final void zzg(long j10) {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        zzusVar.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzh() {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        return zzusVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzi() {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        return zzusVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzj(long j10) {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        return zzusVar.zzj(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzk(long j10, zzlv zzlvVar) {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        return zzusVar.zzk(j10, zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzl() {
        zzus zzusVar = this.zze;
        String str = zzep.zza;
        return zzusVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzm(zzkn zzknVar) {
        zzus zzusVar = this.zze;
        return zzusVar != null && zzusVar.zzm(zzknVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzn() {
        zzus zzusVar = this.zze;
        return zzusVar != null && zzusVar.zzn();
    }

    public final void zzo(long j10) {
        this.zzg = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzp(zzus zzusVar) {
        zzur zzurVar = this.zzf;
        String str = zzep.zza;
        zzurVar.zzp(this);
    }

    public final long zzq() {
        return this.zzg;
    }

    public final void zzr(zzuw zzuwVar) {
        zzgmd.zzh(this.zzd == null);
        this.zzd = zzuwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzs(zzwm zzwmVar) {
        zzur zzurVar = this.zzf;
        String str = zzep.zza;
        zzurVar.zzs(this);
    }

    public final void zzt(zzuu zzuuVar) {
        long jZzv = zzv(this.zzb);
        zzuw zzuwVar = this.zzd;
        zzuwVar.getClass();
        zzus zzusVarZzG = zzuwVar.zzG(zzuuVar, this.zzc, jZzv);
        this.zze = zzusVarZzG;
        if (this.zzf != null) {
            zzusVarZzG.zzb(this, jZzv);
        }
    }

    public final void zzu() {
        zzus zzusVar = this.zze;
        if (zzusVar != null) {
            zzuw zzuwVar = this.zzd;
            zzuwVar.getClass();
            zzuwVar.zzD(zzusVar);
        }
    }
}
