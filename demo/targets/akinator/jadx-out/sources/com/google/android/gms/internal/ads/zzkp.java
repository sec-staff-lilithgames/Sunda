package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkp {
    public final zzus zza;
    public final Object zzb;
    public final zzwk[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzkq zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzlp[] zzj;
    private final zzyr zzk;
    private final zzle zzl;
    private zzkp zzm;
    private zzwv zzn;
    private zzys zzo;
    private long zzp;

    public zzkp(zzlp[] zzlpVarArr, long j10, zzyr zzyrVar, zzyv zzyvVar, zzle zzleVar, zzkq zzkqVar, zzys zzysVar, long j11) {
        this.zzj = zzlpVarArr;
        this.zzp = j10;
        this.zzk = zzyrVar;
        this.zzl = zzleVar;
        zzuu zzuuVar = zzkqVar.zza;
        this.zzb = zzuuVar.zza;
        this.zzg = zzkqVar;
        this.zzn = zzwv.zza;
        this.zzo = zzysVar;
        this.zzc = new zzwk[2];
        this.zzi = new boolean[2];
        long j12 = zzkqVar.zzb;
        long j13 = zzkqVar.zzd;
        zzus zzusVarZze = zzleVar.zze(zzuuVar, zzyvVar, j12);
        this.zza = j13 != C.TIME_UNSET ? new zzty(zzusVarZze, true, 0L, j13) : zzusVarZze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzys zzysVar = this.zzo;
            if (i10 >= zzysVar.zza) {
                return;
            }
            zzysVar.zza(i10);
            zzyk zzykVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzys zzysVar = this.zzo;
            if (i10 >= zzysVar.zza) {
                return;
            }
            zzysVar.zza(i10);
            zzyk zzykVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j10) {
        this.zzp = j10;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= C.TIME_UNSET;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zze : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f10, zzbf zzbfVar, boolean z10) throws zzib {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzys zzysVarZzk = zzk(f10, zzbfVar, z10);
        zzkq zzkqVar = this.zzg;
        long jMax = zzkqVar.zzb;
        long j10 = zzkqVar.zze;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jZzl = zzl(zzysVarZzk, jMax, false);
        long j11 = this.zzp;
        zzkq zzkqVar2 = this.zzg;
        this.zzp = (zzkqVar2.zzb - jZzl) + j11;
        this.zzg = zzkqVar2.zza(jZzl);
    }

    public final void zzi(long j10) {
        zzgmd.zzh(zzw());
        if (this.zze) {
            this.zza.zzg(j10 - this.zzp);
        }
    }

    public final void zzj(zzkn zzknVar) {
        zzgmd.zzh(zzw());
        this.zza.zzm(zzknVar);
    }

    public final zzys zzk(float f10, zzbf zzbfVar, boolean z10) throws zzib {
        zzwv zzwvVar = this.zzn;
        zzuu zzuuVar = this.zzg.zza;
        zzyr zzyrVar = this.zzk;
        zzlp[] zzlpVarArr = this.zzj;
        zzys zzysVarZzq = zzyrVar.zzq(zzlpVarArr, zzwvVar, zzuuVar, zzbfVar);
        for (int i10 = 0; i10 < zzysVarZzq.zza; i10++) {
            if (zzysVarZzq.zza(i10)) {
                if (zzysVarZzq.zzc[i10] == null) {
                    zzlpVarArr[i10].zza();
                    z = false;
                }
                zzgmd.zzh(z);
            } else {
                zzgmd.zzh(zzysVarZzq.zzc[i10] == null);
            }
        }
        for (zzyk zzykVar : zzysVarZzq.zzc) {
        }
        return zzysVarZzq;
    }

    public final long zzl(zzys zzysVar, long j10, boolean z10) {
        return zzm(zzysVar, j10, false, new boolean[2]);
    }

    public final long zzm(zzys zzysVar, long j10, boolean z10, boolean[] zArr) {
        zzlp[] zzlpVarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzysVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z10 || !zzysVar.zzb(this.zzo, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzlpVarArr = this.zzj;
            if (i11 >= 2) {
                break;
            }
            zzlpVarArr[i11].zza();
            i11++;
        }
        zzv();
        this.zzo = zzysVar;
        zzu();
        zzus zzusVar = this.zza;
        zzyk[] zzykVarArr = zzysVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzwk[] zzwkVarArr = this.zzc;
        long jZze = zzusVar.zze(zzykVarArr, zArr3, zzwkVarArr, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            zzlpVarArr[i12].zza();
        }
        this.zzf = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (zzwkVarArr[i13] != null) {
                zzgmd.zzh(zzysVar.zza(i13));
                zzlpVarArr[i13].zza();
                this.zzf = true;
            } else {
                zzgmd.zzh(zzykVarArr[i13] == null);
            }
        }
        return jZze;
    }

    public final void zzn() {
        zzv();
        zzus zzusVar = this.zza;
        try {
            boolean z10 = zzusVar instanceof zzty;
            zzle zzleVar = this.zzl;
            if (z10) {
                zzleVar.zzf(((zzty) zzusVar).zza);
            } else {
                zzleVar.zzf(zzusVar);
            }
        } catch (RuntimeException e10) {
            zzdt.zzf("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzkp zzkpVar) {
        if (zzkpVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzkpVar;
        zzu();
    }

    public final zzkp zzp() {
        return this.zzm;
    }

    public final zzwv zzq() {
        return this.zzn;
    }

    public final zzys zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzus zzusVar = this.zza;
        if (zzusVar instanceof zzty) {
            long j10 = this.zzg.zzd;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            ((zzty) zzusVar).zza(0L, j10);
        }
    }

    public final void zzt(zzur zzurVar, long j10) {
        this.zzd = true;
        this.zza.zzb(zzurVar, j10);
    }
}
