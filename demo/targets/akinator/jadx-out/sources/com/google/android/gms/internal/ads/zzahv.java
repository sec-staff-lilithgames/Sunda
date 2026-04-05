package com.google.android.gms.internal.ads;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahv implements zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahv(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j12;
        this.zze = i10;
    }

    public static zzahv zzd(long j10, long j11, zzadw zzadwVar, zzeg zzegVar) {
        int iZzs;
        zzeg zzegVar2 = zzegVar;
        zzegVar2.zzk(6);
        int iZzB = zzegVar2.zzB();
        long j12 = zzadwVar.zzc;
        long j13 = iZzB;
        if (zzegVar2.zzB() <= 0) {
            return null;
        }
        long jZzr = zzep.zzr((r4 * zzadwVar.zzg) - 1, zzadwVar.zzd);
        int iZzt = zzegVar2.zzt();
        int iZzt2 = zzegVar2.zzt();
        int iZzt3 = zzegVar2.zzt();
        zzegVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i10 = 0;
        long j14 = j11 + zzadwVar.zzc;
        while (i10 < iZzt) {
            long j15 = j12;
            jArr[i10] = (i10 * jZzr) / iZzt;
            jArr2[i10] = j14;
            if (iZzt3 == 1) {
                iZzs = zzegVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzegVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzegVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzegVar2.zzH();
            }
            j14 += iZzs * iZzt2;
            i10++;
            zzegVar2 = zzegVar;
            iZzt = iZzt;
            j12 = j15;
        }
        long j16 = j11 + j12;
        long jMax = j16 + j13;
        if (j10 != -1 && j10 != jMax) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27 + String.valueOf(jMax).length());
            e2.A(sb2, "VBRI data size mismatch: ", j10, ", ");
            sb2.append(jMax);
            zzdt.zzc("VbriSeeker", sb2.toString());
        }
        if (jMax != j14) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j14).length() + String.valueOf(jMax).length() + 43 + 28);
            e2.A(sb3, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
            sb3.append(j14);
            sb3.append("\nSeeking will be inaccurate.");
            zzdt.zzc("VbriSeeker", sb3.toString());
            jMax = Math.max(jMax, j14);
        }
        return new zzahv(jArr, jArr2, jZzr, j16, jMax, zzadwVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        long[] jArr = this.zza;
        int iZzm = zzep.zzm(jArr, j10, true, true);
        long j11 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzaee zzaeeVar = new zzaee(j11, jArr2[iZzm]);
        if (zzaeeVar.zzb >= j10 || iZzm == jArr.length - 1) {
            return new zzaeb(zzaeeVar, zzaeeVar);
        }
        int i10 = iZzm + 1;
        return new zzaeb(zzaeeVar, new zzaee(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j10) {
        return this.zza[zzep.zzm(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzg() {
        return this.zze;
    }
}
