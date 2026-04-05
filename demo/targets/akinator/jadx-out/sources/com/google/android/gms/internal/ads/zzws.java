package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzws implements zzus, zzur {
    private final zzus zza;
    private final long zzb;
    private zzur zzc;

    public zzws(zzus zzusVar, long j10) {
        this.zza = zzusVar;
        this.zzb = j10;
    }

    public final zzus zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzb(zzur zzurVar, long j10) {
        this.zzc = zzurVar;
        this.zza.zzb(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final zzwv zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zze(zzyk[] zzykVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j10) {
        zzwk[] zzwkVarArr2 = new zzwk[zzwkVarArr.length];
        int i10 = 0;
        while (true) {
            zzwk zzwkVarZza = null;
            if (i10 >= zzwkVarArr.length) {
                break;
            }
            zzwr zzwrVar = (zzwr) zzwkVarArr[i10];
            if (zzwrVar != null) {
                zzwkVarZza = zzwrVar.zza();
            }
            zzwkVarArr2[i10] = zzwkVarZza;
            i10++;
        }
        zzus zzusVar = this.zza;
        long j11 = this.zzb;
        long jZze = zzusVar.zze(zzykVarArr, zArr, zzwkVarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < zzwkVarArr.length; i11++) {
            zzwk zzwkVar = zzwkVarArr2[i11];
            if (zzwkVar == null) {
                zzwkVarArr[i11] = null;
            } else {
                zzwk zzwkVar2 = zzwkVarArr[i11];
                if (zzwkVar2 == null || ((zzwr) zzwkVar2).zza() != zzwkVar) {
                    zzwkVarArr[i11] = new zzwr(zzwkVar, j11);
                }
            }
        }
        return jZze + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzf(long j10, boolean z10) {
        this.zza.zzf(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final void zzg(long j10) {
        this.zza.zzg(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzh() {
        long jZzh = this.zza.zzh();
        return jZzh == C.TIME_UNSET ? C.TIME_UNSET : jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzj(long j10) {
        long j11 = this.zzb;
        return this.zza.zzj(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzk(long j10, zzlv zzlvVar) {
        long j11 = this.zzb;
        return this.zza.zzk(j10 - j11, zzlvVar) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzm(zzkn zzknVar) {
        long j10 = zzknVar.zza;
        long j11 = this.zzb;
        zzkm zzkmVarZza = zzknVar.zza();
        zzkmVarZza.zza(j10 - j11);
        return this.zza.zzm(zzkmVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzp(zzus zzusVar) {
        zzur zzurVar = this.zzc;
        zzurVar.getClass();
        zzurVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzs(zzwm zzwmVar) {
        zzur zzurVar = this.zzc;
        zzurVar.getClass();
        zzurVar.zzs(this);
    }
}
