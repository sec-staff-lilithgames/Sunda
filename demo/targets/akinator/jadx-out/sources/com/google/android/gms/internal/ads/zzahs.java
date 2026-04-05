package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzahs implements zzada {
    public static final /* synthetic */ int zza = 0;
    private final zzeg zzb;
    private final zzadw zzc;
    private final zzads zzd;
    private final zzadu zze;
    private final zzaem zzf;
    private zzadd zzg;
    private zzaem zzh;
    private zzaem zzi;
    private int zzj;
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzahu zzq;
    private boolean zzr;

    public zzahs() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022d  */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.internal.ads.zzaed, com.google.android.gms.internal.ads.zzahu] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.google.android.gms.internal.ads.zzaht] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzadd] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzh(com.google.android.gms.internal.ads.zzadb r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahs.zzh(com.google.android.gms.internal.ads.zzadb):int");
    }

    private final long zzi(long j10) {
        zzadw zzadwVar = this.zzc;
        return ((j10 * 1000000) / zzadwVar.zzd) + this.zzl;
    }

    private final boolean zzj(zzadb zzadbVar, boolean z10) throws IOException {
        int iZzm;
        int i10;
        int iZza;
        zzadbVar.zzl();
        long jZzn = zzadbVar.zzn();
        int i11 = true != z10 ? 131072 : 32768;
        if (jZzn == 0) {
            zzap zzapVarZza = this.zze.zza(zzadbVar, null, i11);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzadbVar.zzm();
            if (!z10) {
                zzadbVar.zzf(iZzm);
            }
            i10 = 0;
        } else {
            iZzm = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!zzk(zzadbVar)) {
                zzeg zzegVar = this.zzb;
                zzegVar.zzh(0);
                int iZzB = zzegVar.zzB();
                if ((i10 == 0 || zzm(iZzB, i10)) && (iZza = zzadx.zza(iZzB)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(iZzB);
                        i10 = iZzB;
                    }
                    zzadbVar.zzk(iZza - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        zzl();
                        throw new EOFException();
                    }
                    if (z10) {
                        zzadbVar.zzl();
                        zzadbVar.zzk(iZzm + i14);
                    } else {
                        zzadbVar.zzf(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                zzl();
                throw new EOFException();
            }
        }
        if (z10) {
            zzadbVar.zzf(iZzm + i13);
        } else {
            zzadbVar.zzl();
        }
        this.zzj = i10;
        return true;
    }

    private final boolean zzk(zzadb zzadbVar) throws IOException {
        zzahu zzahuVar = this.zzq;
        if (zzahuVar != null) {
            long jZzf = zzahuVar.zzf();
            if (jZzf != -1 && zzadbVar.zzm() > jZzf - 4) {
                return true;
            }
        }
        try {
            return !zzadbVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzl() {
        zzahu zzahuVar = this.zzq;
        if ((zzahuVar instanceof zzahn) && zzahuVar.zzb()) {
            long j10 = this.zzo;
            if (j10 == -1 || j10 == this.zzq.zzf()) {
                return;
            }
            this.zzq = ((zzahn) this.zzq).zzh(this.zzo);
            zzadd zzaddVar = this.zzg;
            zzaddVar.getClass();
            zzaddVar.zzw(this.zzq);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    private static boolean zzm(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        return zzj(zzadbVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzg = zzaddVar;
        zzaem zzaemVarZzu = zzaddVar.zzu(0, 1);
        this.zzh = zzaemVarZzu;
        this.zzi = zzaemVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws Throwable {
        this.zzh.getClass();
        String str = zzep.zza;
        int iZzh = zzh(zzadbVar);
        if (iZzh == -1 && (this.zzq instanceof zzaho)) {
            if (this.zzq.zza() != zzi(this.zzm)) {
                throw null;
            }
        }
        return iZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzj = 0;
        this.zzl = C.TIME_UNSET;
        this.zzm = 0L;
        this.zzp = 0;
        if (this.zzq instanceof zzaho) {
            throw null;
        }
    }

    public final void zzg() {
        this.zzr = true;
    }

    public zzahs(int i10) {
        this.zzb = new zzeg(10);
        this.zzc = new zzadw();
        this.zzd = new zzads();
        this.zzl = C.TIME_UNSET;
        this.zze = new zzadu();
        zzacx zzacxVar = new zzacx();
        this.zzf = zzacxVar;
        this.zzi = zzacxVar;
        this.zzo = -1L;
    }
}
