package com.google.android.gms.internal.ads;

import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwc extends zztt implements zzvq {
    private final zzga zza;
    private final zzvm zzb;
    private final zzrz zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = C.TIME_UNSET;
    private boolean zzg;
    private boolean zzh;
    private zzgz zzi;
    private zzak zzj;
    private final zzze zzk;

    public /* synthetic */ zzwc(zzak zzakVar, zzga zzgaVar, zzvm zzvmVar, zzrz zzrzVar, zzze zzzeVar, int i10, int i11, zzv zzvVar, zzgmv zzgmvVar, byte[] bArr) {
        this.zzj = zzakVar;
        this.zza = zzgaVar;
        this.zzb = zzvmVar;
        this.zzc = zzrzVar;
        this.zzk = zzzeVar;
        this.zzd = i10;
    }

    private final void zzu() {
        long j10 = this.zzf;
        boolean z10 = this.zzg;
        boolean z11 = this.zzh;
        zzak zzakVarZzJ = zzJ();
        zzbf zzwoVar = new zzwo(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j10, 0L, 0L, z10, false, false, null, zzakVarZzJ, z11 ? zzakVarZzJ.zzc : null);
        if (this.zze) {
            zzwoVar = new zzvz(this, zzwoVar);
        }
        zze(zzwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final synchronized void zzA(zzak zzakVar) {
        this.zzj = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzD(zzus zzusVar) {
        ((zzvy) zzusVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final zzus zzG(zzuu zzuuVar, zzyv zzyvVar, long j10) {
        zzgb zzgbVarZza = this.zza.zza();
        zzgz zzgzVar = this.zzi;
        if (zzgzVar != null) {
            zzgbVarZza.zze(zzgzVar);
        }
        zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new zzvy(zzagVar.zza, zzgbVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzuuVar), this.zzk, zzf(zzuuVar), this, zzyvVar, null, this.zzd, 0, null, zzep.zzq(C.TIME_UNSET), null);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final synchronized zzak zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final void zza(zzgz zzgzVar) {
        this.zzi = zzgzVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzb(long j10, zzaed zzaedVar, boolean z10) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.zzf;
        }
        boolean zZzb = zzaedVar.zzb();
        if (!this.zze && this.zzf == j10 && this.zzg == zZzb && this.zzh == z10) {
            return;
        }
        this.zzf = j10;
        this.zzg = zZzb;
        this.zzh = z10;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzt() {
    }
}
