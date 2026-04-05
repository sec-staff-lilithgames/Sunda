package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzacm {
    protected final zzacg zza;
    protected final zzacl zzb;
    protected zzaci zzc;
    private final int zzd;

    public zzacm(zzacj zzacjVar, zzacl zzaclVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzaclVar;
        this.zzd = i10;
        this.zza = new zzacg(zzacjVar, j10, 0L, j12, j13, j14, j15);
    }

    public static final int zzf(zzadb zzadbVar, long j10, zzaea zzaeaVar) {
        if (j10 == zzadbVar.zzn()) {
            return 0;
        }
        zzaeaVar.zza = j10;
        return 1;
    }

    public static final boolean zzg(zzadb zzadbVar, long j10) throws IOException {
        long jZzn = j10 - zzadbVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzadbVar.zzf((int) jZzn);
        return true;
    }

    public final zzaed zza() {
        return this.zza;
    }

    public final void zzb(long j10) {
        zzaci zzaciVar = this.zzc;
        if (zzaciVar == null || zzaciVar.zze() != j10) {
            zzacg zzacgVar = this.zza;
            this.zzc = new zzaci(j10, zzacgVar.zzd(j10), 0L, zzacgVar.zze(), zzacgVar.zzf(), zzacgVar.zzg(), zzacgVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        while (true) {
            zzaci zzaciVar = this.zzc;
            zzaciVar.getClass();
            long jZzb = zzaciVar.zzb();
            long jZzc = zzaciVar.zzc();
            long jZzh = zzaciVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzadbVar, jZzb, zzaeaVar);
            }
            if (!zzg(zzadbVar, jZzh)) {
                return zzf(zzadbVar, jZzh, zzaeaVar);
            }
            zzadbVar.zzl();
            zzack zzackVarZza = this.zzb.zza(zzadbVar, zzaciVar.zzd());
            int iZzd = zzackVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzadbVar, jZzh, zzaeaVar);
            }
            if (iZzd == -2) {
                zzaciVar.zzf(zzackVarZza.zze(), zzackVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzadbVar, zzackVarZza.zzf());
                    zze(true, zzackVarZza.zzf());
                    return zzf(zzadbVar, zzackVarZza.zzf(), zzaeaVar);
                }
                zzaciVar.zzg(zzackVarZza.zze(), zzackVarZza.zzf());
            }
        }
    }

    public final void zze(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
