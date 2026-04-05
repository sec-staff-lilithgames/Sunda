package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzks {
    private final zzmi zzc;
    private final zzdm zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzil zzh;
    private zzkp zzi;
    private zzkp zzj;
    private zzkp zzk;
    private zzkp zzl;
    private zzkp zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzka zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzks(zzmi zzmiVar, zzdm zzdmVar, zzka zzkaVar, zzil zzilVar) {
        this.zzc = zzmiVar;
        this.zzd = zzdmVar;
        this.zzr = zzkaVar;
        this.zzh = zzilVar;
    }

    private static zzuu zzA(zzbf zzbfVar, Object obj, long j10, long j11, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j10);
        return iZze == -1 ? new zzuu(obj, j11, zzbdVar.zzf(j10)) : new zzuu(obj, iZze, zzbdVar.zzd(iZze), j11);
    }

    private final void zzB() {
        int i10 = zzgpe.zzd;
        final zzgpb zzgpbVar = new zzgpb();
        for (zzkp zzkpVarZzp = this.zzi; zzkpVarZzp != null; zzkpVarZzp = zzkpVarZzp.zzp()) {
            zzgpbVar.zzf(zzkpVarZzp.zzg.zza);
        }
        zzkp zzkpVar = this.zzj;
        final zzuu zzuuVar = zzkpVar == null ? null : zzkpVar.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgpbVar, zzuuVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzkp zzkpVar = (zzkp) this.zzq.get(i10);
            if (zzkpVar.zzb.equals(obj)) {
                return zzkpVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzkp zzkpVarZzp = this.zzi;
        if (zzkpVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzkpVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkpVarZzp.getClass();
                if (zzkpVarZzp.zzp() == null || zzkpVarZzp.zzg.zzh) {
                    break;
                }
                zzkpVarZzp = zzkpVarZzp.zzp();
            }
            zzkp zzkpVarZzp2 = zzkpVarZzp.zzp();
            if (iZze == -1 || zzkpVarZzp2 == null || zzbfVar2.zze(zzkpVarZzp2.zzb) != iZze) {
                break;
            }
            zzkpVarZzp = zzkpVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzkpVarZzp);
        zzkpVarZzp.zzg = zzx(zzbfVar2, zzkpVarZzp.zzg);
        return iZzs;
    }

    private final zzkq zzE(zzbf zzbfVar, zzkp zzkpVar, long j10) {
        zzbf zzbfVar2;
        long j11;
        zzbf zzbfVar3;
        zzbd zzbdVar;
        zzbe zzbeVar;
        Object obj;
        long j12;
        long j13;
        long j14;
        zzkq zzkqVar = zzkpVar.zzg;
        long jZza = zzkpVar.zza();
        long j15 = zzkqVar.zze;
        long j16 = (jZza + j15) - j10;
        if (!zzkqVar.zzh) {
            zzuu zzuuVar = zzkqVar.zza;
            Object obj2 = zzuuVar.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj2, zzbdVar2);
            if (!zzuuVar.zzb()) {
                int i10 = zzuuVar.zze;
                if (i10 != -1) {
                    zzbdVar2.zzi(i10);
                }
                int iZzd = zzbdVar2.zzd(i10);
                zzbdVar2.zzk(i10);
                if (iZzd != zzbdVar2.zzg(i10)) {
                    return zzG(zzbfVar, obj2, i10, iZzd, j15, zzuuVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i10);
                return zzH(zzbfVar, obj2, 0L, j15, zzuuVar.zzd, false);
            }
            int i11 = zzuuVar.zzb;
            if (zzbdVar2.zzg(i11) == -1) {
                return null;
            }
            int iZza = zzbdVar2.zzg.zza(i11).zza(zzuuVar.zzc);
            if (iZza < 0) {
                return zzG(zzbfVar, obj2, i11, iZza, zzkqVar.zzc, zzuuVar.zzd, false);
            }
            long jLongValue = zzkqVar.zzc;
            if (jLongValue == C.TIME_UNSET) {
                Pair pairZzn = zzbfVar.zzn(this.zzb, zzbdVar2, zzbdVar2.zzc, C.TIME_UNSET, Math.max(0L, j16));
                zzbfVar2 = zzbfVar;
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j11 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j11 = jLongValue;
            }
            zzK(zzbfVar2, obj2, i11);
            return zzH(zzbfVar2, obj2, Math.max(0L, jLongValue), j11, zzuuVar.zzd, false);
        }
        zzuu zzuuVar2 = zzkqVar.zza;
        Object obj3 = zzuuVar2.zza;
        int iZze = zzbfVar.zze(obj3);
        int i12 = this.zzf;
        boolean z10 = this.zzg;
        zzbe zzbeVar2 = this.zzb;
        zzbd zzbdVar3 = this.zza;
        long j17 = 0;
        int iZzl = zzbfVar.zzl(iZze, zzbdVar3, zzbeVar2, i12, z10);
        if (iZzl == -1) {
            return null;
        }
        int i13 = zzbfVar.zzd(iZzl, zzbdVar3, true).zzc;
        Object obj4 = zzbdVar3.zzb;
        obj4.getClass();
        long j18 = zzuuVar2.zzd;
        if (zzbfVar.zzb(i13, zzbeVar2, 0L).zzn == iZzl) {
            Pair pairZzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar3, i13, C.TIME_UNSET, Math.max(0L, j16));
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzkp zzkpVarZzp = zzkpVar.zzp();
            if (zzkpVarZzp == null || !zzkpVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j14 = jZzC;
            } else {
                j14 = zzkpVarZzp.zzg.zza.zzd;
            }
            zzbfVar3 = zzbfVar;
            zzbeVar = zzbeVar2;
            zzbdVar = zzbdVar3;
            j12 = jLongValue2;
            obj = obj5;
            j13 = j14;
            j17 = -9223372036854775807L;
        } else {
            zzbfVar3 = zzbfVar;
            zzbdVar = zzbdVar3;
            zzbeVar = zzbeVar2;
            obj = obj4;
            j12 = 0;
            j13 = j18;
        }
        zzuu zzuuVarZzA = zzA(zzbfVar3, obj, j12, j13, zzbeVar, zzbdVar);
        long j19 = j12;
        zzbd zzbdVar4 = zzbdVar;
        if (j17 != C.TIME_UNSET && zzkqVar.zzc != C.TIME_UNSET) {
            zzbfVar3.zzo(obj3, zzbdVar4).zzb();
            int i14 = zzbdVar4.zzg.zzd;
        }
        return zzF(zzbfVar3, zzuuVarZzA, j17, j19);
    }

    private final zzkq zzF(zzbf zzbfVar, zzuu zzuuVar, long j10, long j11) {
        Object obj = zzuuVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzuuVar.zzb() ? zzG(zzbfVar, obj, zzuuVar.zzb, zzuuVar.zzc, j10, zzuuVar.zzd, false) : zzH(zzbfVar, obj, j11, j10, zzuuVar.zzd, false);
    }

    private final zzkq zzG(zzbf zzbfVar, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        zzuu zzuuVar = new zzuu(obj, i10, i11, j11);
        Object obj2 = zzuuVar.zza;
        int i12 = zzuuVar.zzb;
        int i13 = zzuuVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i12, i13);
        if (i11 == zzbdVar.zzd(i10)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i12);
        long jMax = 0;
        if (jZzh != C.TIME_UNSET && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzkq(zzuuVar, jMax, j10, C.TIME_UNSET, jZzh, false, false, false, false, false);
    }

    private final zzkq zzH(zzbf zzbfVar, Object obj, long j10, long j11, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        long jMax = j10;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(iZzf);
        }
        zzuu zzuuVar = new zzuu(obj, j12, iZzf);
        boolean zZzL = zzL(zzuuVar);
        boolean zZzI = zzI(zzbfVar, zzuuVar);
        boolean zZzJ = zzJ(zzbfVar, zzuuVar, zZzL);
        if (iZzf != -1) {
            zzbdVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzc(iZzf);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != C.TIME_UNSET) {
            j15 = j13;
            j14 = j15;
        } else {
            j14 = zzbdVar.zzd;
            j15 = -9223372036854775807L;
        }
        if (j14 != C.TIME_UNSET && jMax >= j14) {
            jMax = Math.max(0L, j14 - 1);
        }
        return new zzkq(zzuuVar, jMax, j11, j15, j14, false, false, zZzL, zZzI, zZzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzuu zzuuVar) {
        if (!zzL(zzuuVar)) {
            return false;
        }
        Object obj = zzuuVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzuu zzuuVar, boolean z10) {
        int iZze = zzbfVar.zze(zzuuVar.zza);
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i10, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z10;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i10) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i10);
        long j10 = zzbdVar.zzg.zza(i10).zzi;
        return 0L;
    }

    private static final boolean zzL(zzuu zzuuVar) {
        return !zzuuVar.zzb() && zzuuVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i10) {
        this.zzf = i10;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z10) {
        this.zzg = z10;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzil zzilVar) {
        this.zzh = zzilVar;
        long j10 = zzilVar.zzb;
        zzj();
    }

    public final boolean zzd(zzus zzusVar) {
        zzkp zzkpVar = this.zzl;
        return zzkpVar != null && zzkpVar.zza == zzusVar;
    }

    public final boolean zze(zzus zzusVar) {
        zzkp zzkpVar = this.zzm;
        return zzkpVar != null && zzkpVar.zza == zzusVar;
    }

    public final void zzf(long j10) {
        zzkp zzkpVar = this.zzl;
        if (zzkpVar != null) {
            zzkpVar.zzi(j10);
        }
    }

    public final boolean zzg() {
        zzkp zzkpVar = this.zzl;
        if (zzkpVar != null) {
            return !zzkpVar.zzg.zzj && zzkpVar.zzd() && this.zzl.zzg.zze != C.TIME_UNSET && this.zzn < 100;
        }
        return true;
    }

    public final zzkq zzh(long j10, zzlf zzlfVar) {
        zzkp zzkpVar = this.zzl;
        return zzkpVar == null ? zzF(zzlfVar.zza, zzlfVar.zzb, zzlfVar.zzc, zzlfVar.zzs) : zzE(zzlfVar.zza, zzkpVar, j10);
    }

    public final zzkp zzi(zzkq zzkqVar) {
        zzkp zzkpVarZza;
        zzkp zzkpVar = this.zzl;
        long jZza = zzkpVar == null ? 1000000000000L : (zzkpVar.zza() + zzkpVar.zzg.zze) - zzkqVar.zzb;
        int i10 = 0;
        while (true) {
            if (i10 >= this.zzq.size()) {
                zzkpVarZza = null;
                break;
            }
            zzkq zzkqVar2 = ((zzkp) this.zzq.get(i10)).zzg;
            long j10 = zzkqVar2.zze;
            long j11 = zzkqVar.zze;
            if ((j10 == C.TIME_UNSET || j10 == j11) && zzkqVar2.zzb == zzkqVar.zzb && zzkqVar2.zza.equals(zzkqVar.zza)) {
                zzkpVarZza = (zzkp) this.zzq.remove(i10);
                break;
            }
            i10++;
        }
        if (zzkpVarZza == null) {
            zzkpVarZza = this.zzr.zza(zzkqVar, jZza);
        } else {
            zzkpVarZza.zzg = zzkqVar;
            zzkpVarZza.zzb(jZza);
        }
        zzkp zzkpVar2 = this.zzl;
        if (zzkpVar2 != null) {
            zzkpVar2.zzo(zzkpVarZza);
        } else {
            this.zzi = zzkpVarZza;
            this.zzj = zzkpVarZza;
            this.zzk = zzkpVarZza;
        }
        this.zzo = null;
        this.zzl = zzkpVarZza;
        this.zzn++;
        zzB();
        return zzkpVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            ((zzkp) this.zzq.get(i10)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzkp zzk() {
        return this.zzl;
    }

    public final zzkp zzl() {
        return this.zzm;
    }

    public final zzkp zzm() {
        return this.zzi;
    }

    public final zzkp zzn() {
        return this.zzj;
    }

    public final zzkp zzo() {
        return this.zzk;
    }

    public final zzkp zzp() {
        zzkp zzkpVar = this.zzk;
        zzkp zzkpVar2 = this.zzj;
        if (zzkpVar == zzkpVar2) {
            zzkpVar2.getClass();
            this.zzk = zzkpVar2.zzp();
        }
        zzkpVar2.getClass();
        this.zzj = zzkpVar2.zzp();
        zzB();
        zzkp zzkpVar3 = this.zzj;
        zzkpVar3.getClass();
        return zzkpVar3;
    }

    public final zzkp zzq() {
        zzkp zzkpVar = this.zzk;
        zzkpVar.getClass();
        this.zzk = zzkpVar.zzp();
        zzB();
        zzkp zzkpVar2 = this.zzk;
        zzkpVar2.getClass();
        return zzkpVar2;
    }

    public final zzkp zzr() {
        zzkp zzkpVar = this.zzi;
        if (zzkpVar == null) {
            return null;
        }
        if (zzkpVar == this.zzj) {
            this.zzj = zzkpVar.zzp();
        }
        if (zzkpVar == this.zzk) {
            this.zzk = zzkpVar.zzp();
        }
        zzkpVar.zzn();
        int i10 = this.zzn - 1;
        this.zzn = i10;
        if (i10 == 0) {
            this.zzl = null;
            zzkp zzkpVar2 = this.zzi;
            this.zzo = zzkpVar2.zzb;
            this.zzp = zzkpVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzkp zzkpVar) {
        zzkpVar.getClass();
        int i10 = 0;
        if (zzkpVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzkpVar;
        while (zzkpVar.zzp() != null) {
            zzkpVar = zzkpVar.zzp();
            zzkpVar.getClass();
            if (zzkpVar == this.zzj) {
                zzkp zzkpVar2 = this.zzi;
                this.zzj = zzkpVar2;
                this.zzk = zzkpVar2;
                i10 = 3;
            }
            if (zzkpVar == this.zzk) {
                this.zzk = this.zzj;
                i10 |= 2;
            }
            zzkpVar.zzn();
            this.zzn--;
        }
        zzkp zzkpVar3 = this.zzl;
        zzkpVar3.getClass();
        zzkpVar3.zzo(null);
        zzB();
        return i10;
    }

    public final void zzt() {
        zzkp zzkpVar = this.zzm;
        if (zzkpVar == null || zzkpVar.zze()) {
            this.zzm = null;
            for (int i10 = 0; i10 < this.zzq.size(); i10++) {
                zzkp zzkpVar2 = (zzkp) this.zzq.get(i10);
                if (!zzkpVar2.zze()) {
                    this.zzm = zzkpVar2;
                    return;
                }
            }
        }
    }

    public final zzkp zzu(zzus zzusVar) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzkp zzkpVar = (zzkp) this.zzq.get(i10);
            if (zzkpVar.zza == zzusVar) {
                return zzkpVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzkp zzkpVarZzp = this.zzi;
        zzkpVarZzp.getClass();
        this.zzo = zzkpVarZzp.zzb;
        this.zzp = zzkpVarZzp.zzg.zza.zzd;
        while (zzkpVarZzp != null) {
            zzkpVarZzp.zzn();
            zzkpVarZzp = zzkpVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        return zzs(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzw(com.google.android.gms.internal.ads.zzbf r14, long r15, long r17, long r19) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzkp r0 = r13.zzi
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzkq r3 = r0.zzg
            if (r1 != 0) goto L10
            com.google.android.gms.internal.ads.zzkq r1 = r13.zzx(r14, r3)
            r4 = r15
            goto L2a
        L10:
            r4 = r15
            com.google.android.gms.internal.ads.zzkq r6 = r13.zzE(r14, r1, r4)
            if (r6 == 0) goto L99
            long r7 = r3.zzb
            long r9 = r6.zzb
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L99
            com.google.android.gms.internal.ads.zzuu r7 = r3.zza
            com.google.android.gms.internal.ads.zzuu r8 = r6.zza
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L99
            r1 = r6
        L2a:
            long r6 = r3.zzc
            com.google.android.gms.internal.ads.zzkq r6 = r1.zzb(r6)
            r0.zzg = r6
            long r6 = r3.zze
            long r8 = r1.zze
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L90
            r0.zzs()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r14 != 0) goto L4c
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L51
        L4c:
            long r10 = r0.zza()
            long r8 = r8 + r10
        L51:
            com.google.android.gms.internal.ads.zzkp r14 = r13.zzj
            r10 = -9223372036854775808
            r1 = 1
            if (r0 != r14) goto L66
            com.google.android.gms.internal.ads.zzkq r14 = r0.zzg
            boolean r14 = r14.zzg
            int r14 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r14 == 0) goto L64
            int r14 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r14 < 0) goto L66
        L64:
            r14 = r1
            goto L67
        L66:
            r14 = r2
        L67:
            com.google.android.gms.internal.ads.zzkp r5 = r13.zzk
            if (r0 != r5) goto L75
            int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r5 == 0) goto L73
            int r5 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r5 < 0) goto L75
        L73:
            r5 = r1
            goto L76
        L75:
            r5 = r2
        L76:
            int r0 = r13.zzs(r0)
            if (r0 == 0) goto L7d
            return r0
        L7d:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L82
            r6 = r3
        L82:
            if (r14 == 0) goto L8a
            int r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r14 != 0) goto L89
            goto L8a
        L89:
            r2 = r1
        L8a:
            if (r5 == 0) goto L8f
            r14 = r2 | 2
            return r14
        L8f:
            return r2
        L90:
            com.google.android.gms.internal.ads.zzkp r1 = r0.zzp()
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L99:
            int r14 = r13.zzs(r1)
            return r14
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzw(com.google.android.gms.internal.ads.zzbf, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzkq zzx(com.google.android.gms.internal.ads.zzbf r19, com.google.android.gms.internal.ads.zzkq r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzuu r3 = r2.zza
            boolean r13 = zzL(r3)
            boolean r14 = r0.zzI(r1, r3)
            boolean r15 = r0.zzJ(r1, r3, r13)
            java.lang.Object r4 = r3.zza
            com.google.android.gms.internal.ads.zzbd r5 = r0.zza
            r1.zzo(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.zze
            if (r1 != r4) goto L2f
        L2d:
            r10 = r8
            goto L33
        L2f:
            r5.zzc(r1)
            r10 = r6
        L33:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L47
            int r1 = r3.zzb
            int r6 = r3.zzc
            long r6 = r5.zzh(r1, r6)
        L41:
            r16 = r10
            r9 = r6
            r7 = r16
            goto L51
        L47:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L4e
            r9 = r6
            r7 = r9
            goto L51
        L4e:
            long r6 = r5.zzd
            goto L41
        L51:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L5d
            int r1 = r3.zzb
            r5.zzk(r1)
            goto L64
        L5d:
            int r1 = r3.zze
            if (r1 == r4) goto L64
            r5.zzk(r1)
        L64:
            com.google.android.gms.internal.ads.zzkq r1 = new com.google.android.gms.internal.ads.zzkq
            r5 = r3
            long r3 = r2.zzb
            long r11 = r2.zzc
            r2 = r5
            r5 = r11
            r11 = 0
            r12 = 0
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzx(com.google.android.gms.internal.ads.zzbf, com.google.android.gms.internal.ads.zzkq):com.google.android.gms.internal.ads.zzkq");
    }

    public final zzuu zzy(zzbf zzbfVar, Object obj, long j10) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i10) {
            zzkp zzkpVarZzp = this.zzi;
            while (true) {
                if (zzkpVarZzp == null) {
                    zzkp zzkpVarZzp2 = this.zzi;
                    while (true) {
                        if (zzkpVarZzp2 != null) {
                            int iZze2 = zzbfVar.zze(zzkpVarZzp2.zzb);
                            if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i10) {
                                jZzC = zzkpVarZzp2.zzg.zza.zzd;
                                break;
                            }
                            zzkpVarZzp2 = zzkpVarZzp2.zzp();
                        } else {
                            jZzC = zzC(obj);
                            if (jZzC == -1) {
                                jZzC = this.zze;
                                this.zze = 1 + jZzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = jZzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzkpVarZzp.zzb.equals(obj)) {
                        jZzC = zzkpVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzkpVarZzp = zzkpVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j11 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i11 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i11, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j10, j11, zzbeVar, zzbdVar);
    }

    public final /* synthetic */ void zzz(zzgpb zzgpbVar, zzuu zzuuVar) {
        this.zzc.zzz(zzgpbVar.zzi(), zzuuVar);
    }
}
