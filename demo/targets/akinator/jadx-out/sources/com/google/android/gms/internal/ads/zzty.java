package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzty implements zzus, zzur {
    public final zzus zza;
    long zzb;
    private zzur zzc;
    private zztx[] zzd = new zztx[0];
    private long zze = 0;

    public zzty(zzus zzusVar, boolean z10, long j10, long j11) {
        this.zza = zzusVar;
        this.zzb = j11;
    }

    private static long zzq(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    public final void zza(long j10, long j11) {
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzb(zzur zzurVar, long j10) {
        this.zzc = zzurVar;
        this.zza.zzb(this, j10);
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
        int length = zzwkVarArr.length;
        this.zzd = new zztx[length];
        zzwk[] zzwkVarArr2 = new zzwk[length];
        int i10 = 0;
        while (true) {
            zzwk zzwkVar = null;
            if (i10 >= zzwkVarArr.length) {
                break;
            }
            zztx[] zztxVarArr = this.zzd;
            zztx zztxVar = (zztx) zzwkVarArr[i10];
            zztxVarArr[i10] = zztxVar;
            if (zztxVar != null) {
                zzwkVar = zztxVar.zza;
            }
            zzwkVarArr2[i10] = zzwkVar;
            i10++;
        }
        long jZze = this.zza.zze(zzykVarArr, zArr, zzwkVarArr2, zArr2, j10);
        long jZzq = zzq(jZze, j10, this.zzb);
        boolean zZzo = zzo();
        long j11 = C.TIME_UNSET;
        if (zZzo) {
            if (jZze < j10) {
                j11 = jZzq;
                break;
            }
            if (jZze != 0) {
                for (zzyk zzykVar : zzykVarArr) {
                    if (zzykVar != null) {
                        zzv zzvVarZzc = zzykVar.zzc();
                        if (!zzas.zzd(zzvVarZzc.zzo, zzvVarZzc.zzk)) {
                            j11 = jZzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j11;
        for (int i11 = 0; i11 < zzwkVarArr.length; i11++) {
            zzwk zzwkVar2 = zzwkVarArr2[i11];
            if (zzwkVar2 == null) {
                this.zzd[i11] = null;
            } else {
                zztx[] zztxVarArr2 = this.zzd;
                zztx zztxVar2 = zztxVarArr2[i11];
                if (zztxVar2 == null || zztxVar2.zza != zzwkVar2) {
                    zztxVarArr2[i11] = new zztx(this, zzwkVar2);
                }
            }
            zzwkVarArr[i11] = this.zzd[i11];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzf(long j10, boolean z10) {
        this.zza.zzf(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final void zzg(long j10) {
        this.zza.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzh() {
        if (!zzo()) {
            long jZzh = this.zza.zzh();
            return jZzh == C.TIME_UNSET ? C.TIME_UNSET : zzq(jZzh, 0L, this.zzb);
        }
        long j10 = this.zze;
        this.zze = C.TIME_UNSET;
        long jZzh2 = zzh();
        return jZzh2 != C.TIME_UNSET ? jZzh2 : j10;
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzi < j10) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzj(long j10) {
        this.zze = C.TIME_UNSET;
        for (zztx zztxVar : this.zzd) {
            if (zztxVar != null) {
                zztxVar.zza();
            }
        }
        return zzq(this.zza.zzj(j10), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzk(long j10, zzlv zzlvVar) {
        if (j10 == 0) {
            return 0L;
        }
        long j11 = zzlvVar.zzd;
        String str = zzep.zza;
        long jMax = Math.max(0L, Math.min(j11, j10));
        long j12 = zzlvVar.zze;
        long j13 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != j11 || jMax2 != j12) {
            zzlvVar = new zzlv(jMax, jMax2);
        }
        return this.zza.zzk(j10, zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzl < j10) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzm(zzkn zzknVar) {
        return this.zza.zzm(zzknVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzn() {
        return this.zza.zzn();
    }

    public final boolean zzo() {
        return this.zze != C.TIME_UNSET;
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
