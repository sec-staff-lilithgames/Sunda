package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkh implements Handler.Callback, zzur, zzyq, zzld, zzhy, zzlh, zzhp, zzaax {
    private static final long zza = zzep.zzp(10000);
    private zzlv zzA;
    private boolean zzC;
    private boolean zzD;
    private zzkg zzE;
    private int zzF;
    private zzlf zzG;
    private zzke zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzkg zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zzib zzX;
    private zzil zzZ;
    private boolean zzab;
    private final zzhu zzad;
    private final zzlr[] zzb;
    private final zzlp[] zzc;
    private final boolean[] zzd;
    private final zzyr zze;
    private final zzys zzf;
    private final zzkl zzg;
    private final zzza zzh;
    private final zzdm zzi;
    private final zzlg zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zzhz zzo;
    private final ArrayList zzp;
    private final zzdc zzq;
    private final zzkf zzr;
    private final zzks zzs;
    private final zzle zzt;
    private final long zzu;
    private final zzpc zzv;
    private final zzmi zzw;
    private final zzdm zzx;
    private final boolean zzy;
    private final zzhq zzz;
    private long zzaa = C.TIME_UNSET;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzlu zzB = zzlu.zza;
    private long zzY = C.TIME_UNSET;
    private long zzM = C.TIME_UNSET;

    public zzkh(Context context, zzln[] zzlnVarArr, zzln[] zzlnVarArr2, zzyr zzyrVar, zzys zzysVar, zzkl zzklVar, zzza zzzaVar, int i10, boolean z10, zzmi zzmiVar, zzlv zzlvVar, zzhu zzhuVar, long j10, boolean z11, boolean z12, Looper looper, zzdc zzdcVar, zzkf zzkfVar, zzpc zzpcVar, zzlg zzlgVar, zzil zzilVar, final zzaax zzaaxVar) {
        this.zzr = zzkfVar;
        this.zze = zzyrVar;
        this.zzf = zzysVar;
        this.zzg = zzklVar;
        this.zzh = zzzaVar;
        this.zzA = zzlvVar;
        this.zzad = zzhuVar;
        this.zzu = j10;
        this.zzq = zzdcVar;
        this.zzv = zzpcVar;
        this.zzZ = zzilVar;
        this.zzw = zzmiVar;
        this.zzn = zzklVar.zzf(zzpcVar);
        zzklVar.zzg(zzpcVar);
        zzbf zzbfVar = zzbf.zza;
        zzlf zzlfVarZza = zzlf.zza(zzysVar);
        this.zzG = zzlfVarZza;
        this.zzH = new zzke(zzlfVarZza);
        int length = zzlnVarArr.length;
        this.zzc = new zzlp[2];
        this.zzd = new boolean[2];
        zzlo zzloVarZzg = zzyrVar.zzg();
        this.zzb = new zzlr[2];
        boolean z13 = false;
        for (int i11 = 0; i11 < 2; i11++) {
            zzlnVarArr[i11].zzc(i11, zzpcVar, zzdcVar);
            this.zzc[i11] = zzlnVarArr[i11].zzb();
            this.zzc[i11].zzv(zzloVarZzg);
            zzln zzlnVar = zzlnVarArr2[i11];
            if (zzlnVar != null) {
                zzlnVar.zzc(i11, zzpcVar, zzdcVar);
                z13 = true;
            }
            this.zzb[i11] = new zzlr(zzlnVarArr[i11], zzlnVarArr2[i11], i11);
        }
        this.zzy = z13;
        this.zzo = new zzhz(this, zzdcVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzyrVar.zzr(this, zzzaVar);
        this.zzW = true;
        zzdm zzdmVarZzd = zzdcVar.zzd(looper, null);
        this.zzx = zzdmVarZzd;
        this.zzs = new zzks(zzmiVar, zzdmVarZzd, new zzka(this), zzilVar);
        this.zzt = new zzle(this, zzmiVar, zzdmVarZzd, zzpcVar);
        zzlg zzlgVar2 = new zzlg(null);
        this.zzj = zzlgVar2;
        Looper looperZza = zzlgVar2.zza();
        this.zzk = looperZza;
        zzdm zzdmVarZzd2 = zzdcVar.zzd(looperZza, this);
        this.zzi = zzdmVarZzd2;
        this.zzz = new zzhq(context, looperZza, this);
        zzdmVarZzd2.zzd(35, new zzaax() { // from class: com.google.android.gms.internal.ads.zzjw
            @Override // com.google.android.gms.internal.ads.zzaax
            public final /* synthetic */ void zzcS(long j11, long j12, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j11, j12, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i10) {
        zzks zzksVar = this.zzs;
        zzib zzibVarZza = zzib.zza(iOException, i10);
        zzkp zzkpVarZzm = zzksVar.zzm();
        if (zzkpVarZzm != null) {
            zzibVarZza = zzibVarZza.zzd(zzkpVarZzm.zzg.zza);
        }
        zzdt.zzf("ExoPlayerImplInternal", "Playback error", zzibVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zzibVarZza);
    }

    private final void zzB(int i10) {
        zzlf zzlfVar = this.zzG;
        if (zzlfVar.zze != i10) {
            if (i10 != 2) {
                this.zzY = C.TIME_UNSET;
            }
            this.zzG = zzlfVar.zze(i10);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzke(this.zzG);
        }
    }

    private final void zzD(float f10) throws zzib {
        this.zzac = f10;
        float fZza = this.zzz.zza() * f10;
        int i10 = 0;
        while (true) {
            zzlr[] zzlrVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzlrVarArr[i10].zzL(fZza);
            i10++;
        }
    }

    private final void zzE(boolean z10, int i10, boolean z11, int i11) throws zzib {
        this.zzH.zza(z11 ? 1 : 0);
        zzG(z10, i10, i11);
    }

    private final void zzF() throws zzib {
        zzlf zzlfVar = this.zzG;
        zzG(zzlfVar.zzl, zzlfVar.zzn, zzlfVar.zzm);
    }

    private final void zzG(boolean z10, int i10, int i11) throws zzib {
        zzH(z10, this.zzz.zzc(z10, this.zzG.zze), i10, i11);
    }

    private final void zzH(boolean z10, int i10, int i11, int i12) throws zzib {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i10 != -1) {
            z11 = true;
        } else {
            i10 = -1;
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.zzC;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        zzlf zzlfVar = this.zzG;
        if (zzlfVar.zzl == z11 && zzlfVar.zzn == i11 && zzlfVar.zzm == i12) {
            return;
        }
        this.zzG = zzlfVar.zzi(z11, i12, i11);
        zzaC(false, false);
        zzks zzksVar = this.zzs;
        for (zzkp zzkpVarZzm = zzksVar.zzm(); zzkpVarZzm != null; zzkpVarZzm = zzkpVarZzm.zzp()) {
            for (zzyk zzykVar : zzkpVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z13 = this.zzG.zzp;
            zzksVar.zzf(this.zzT);
            return;
        }
        int i13 = this.zzG.zze;
        if (i13 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i13 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z10) throws zzib {
        zzuu zzuuVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzuuVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzlf zzlfVar = this.zzG;
            this.zzG = zzao(zzuuVar, jZzT, zzlfVar.zzc, zzlfVar.zzd, z10, 5);
        }
    }

    private final void zzJ() throws zzib {
        zzkp zzkpVarZzm = this.zzs.zzm();
        if (zzkpVarZzm == null) {
            return;
        }
        zzys zzysVarZzr = zzkpVarZzm.zzr();
        int i10 = 0;
        while (true) {
            zzlr[] zzlrVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            if (zzysVarZzr.zza(i10)) {
                zzlrVarArr[i10].zzv();
            }
            i10++;
        }
    }

    private final void zzK() throws zzib {
        this.zzo.zzb();
        int i10 = 0;
        while (true) {
            zzlr[] zzlrVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzlrVarArr[i10].zzw();
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i10, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i10, z10);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j10) {
        int i10 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        if (zzbeVar.zzf == C.TIME_UNSET || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return C.TIME_UNSET;
        }
        long j11 = zzbeVar.zzg;
        String str = zzep.zza;
        return zzep.zzq((j11 == C.TIME_UNSET ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j10;
    }

    private final boolean zzP(zzbf zzbfVar, zzuu zzuuVar) {
        if (!zzuuVar.zzb() && !zzbfVar.zzg()) {
            int i10 = zzbfVar.zzo(zzuuVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i10, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != C.TIME_UNSET) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j10) {
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzlr[] zzlrVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                jMin = Math.min(jMin, zzep.zzp(zzlrVarArr[i10].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzks zzksVar = this.zzs;
                if ((zzksVar.zzm() != null ? zzksVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzep.zzq(jMin) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j10 + jMin);
    }

    private final void zzR(zzkg zzkgVar, boolean z10) throws Throwable {
        long jLongValue;
        long j10;
        long j11;
        boolean z11;
        zzuu zzuuVar;
        zzuu zzuuVar2;
        boolean z12;
        long j12;
        long jZzk;
        zzuu zzuuVar3;
        long j13;
        long j14;
        boolean z13;
        zzlf zzlfVar;
        int i10;
        this.zzH.zza(z10 ? 1 : 0);
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
            }
            this.zzE = zzkgVar;
            return;
        }
        zzbf zzbfVar = this.zzG.zza;
        int i11 = this.zzO;
        boolean z14 = this.zzP;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaD = zzaD(zzbfVar, zzkgVar, true, i11, z14, zzbeVar, zzbdVar);
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzuuVar = (zzuu) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z11 = !this.zzG.zza.zzg();
            j10 = -9223372036854775807L;
            j11 = 0;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j15 = zzkgVar.zzc;
            j10 = j15 == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
            j11 = 0;
            zzuu zzuuVarZzy = this.zzs.zzy(this.zzG.zza, obj, jLongValue);
            if (zzuuVarZzy.zzb()) {
                this.zzG.zza.zzo(zzuuVarZzy.zza, zzbdVar);
                if (zzbdVar.zzd(zzuuVarZzy.zzb) == zzuuVarZzy.zzc) {
                    zzbdVar.zzj();
                }
                zzuuVar = zzuuVarZzy;
                z11 = true;
                jLongValue = 0;
            } else {
                z11 = j15 == C.TIME_UNSET;
                zzuuVar = zzuuVarZzy;
            }
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzkgVar;
            } else if (pairZzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzuuVar.equals(this.zzG.zzb)) {
                    zzkp zzkpVarZzm = this.zzs.zzm();
                    if (zzkpVarZzm == null || !zzkpVarZzm.zze || jLongValue == j11) {
                        jZzk = jLongValue;
                    } else {
                        zzus zzusVar = zzkpVarZzm.zza;
                        long j16 = zzbeVar.zzm;
                        if (this.zzC && j16 != C.TIME_UNSET) {
                            Double d10 = this.zzB.zzc;
                        }
                        jZzk = zzusVar.zzk(jLongValue, this.zzA);
                    }
                    if (zzep.zzp(jZzk) == zzep.zzp(this.zzG.zzs) && ((i10 = (zzlfVar = this.zzG).zze) == 2 || i10 == 3)) {
                        jLongValue = zzlfVar.zzs;
                    }
                } else {
                    jZzk = jLongValue;
                }
                this.zzD = this.zzC;
                long jZzS = zzS(zzuuVar, jZzk, this.zzG.zze == 4);
                boolean z15 = z11 | (jLongValue != jZzS);
                try {
                    zzlf zzlfVar2 = this.zzG;
                    zzbf zzbfVar2 = zzlfVar2.zza;
                    zzuu zzuuVar4 = zzuuVar;
                    long j17 = j10;
                    try {
                        zzag(zzbfVar2, zzuuVar4, zzbfVar2, zzlfVar2.zzb, j17, true);
                        zzuuVar3 = zzuuVar4;
                        j13 = j17;
                        j14 = jZzS;
                        z13 = z15;
                        this.zzG = zzao(zzuuVar3, j14, j13, j14, z13, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        zzuuVar2 = zzuuVar4;
                        j10 = j17;
                        j12 = jZzS;
                        z12 = z15;
                        this.zzG = zzao(zzuuVar2, j12, j10, j12, z12, 2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zzuuVar2 = zzuuVar;
                }
            }
            z13 = z11;
            zzuuVar3 = zzuuVar;
            j14 = jLongValue;
            j13 = j10;
            this.zzG = zzao(zzuuVar3, j14, j13, j14, z13, 2);
        } catch (Throwable th4) {
            th = th4;
            zzuuVar2 = zzuuVar;
            z12 = z11;
            j12 = jLongValue;
        }
    }

    private final long zzS(zzuu zzuuVar, long j10, boolean z10) throws zzib {
        zzks zzksVar = this.zzs;
        return zzT(zzuuVar, j10, zzksVar.zzm() != zzksVar.zzn(), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzT(com.google.android.gms.internal.ads.zzuu r10, long r11, boolean r13, boolean r14) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzT(com.google.android.gms.internal.ads.zzuu, long, boolean, boolean):long");
    }

    private final void zzU(long j10, boolean z10) throws zzib {
        zzkp zzkpVarZzm = this.zzs.zzm();
        long jZza = j10 + (zzkpVarZzm == null ? 1000000000000L : zzkpVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzlr[] zzlrVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            zzlrVarArr[i10].zzE(zzkpVarZzm, this.zzT, z10);
        }
        for (zzkp zzkpVarZzm2 = r0.zzm(); zzkpVarZzm2 != null; zzkpVarZzm2 = zzkpVarZzm2.zzp()) {
            for (zzyk zzykVar : zzkpVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzib {
        int i10 = 0;
        while (true) {
            zzlr[] zzlrVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzlrVarArr[i10].zzz(this.zzC ? this.zzB : null);
            i10++;
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzX(z10 || !this.zzQ, false, true, false);
        this.zzH.zza(z11 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[PHI: r2 r7 r9
      0x0094: PHI (r2v2 com.google.android.gms.internal.ads.zzuu) = (r2v1 com.google.android.gms.internal.ads.zzuu), (r2v11 com.google.android.gms.internal.ads.zzuu) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v12 com.google.android.gms.internal.ads.zzbf)
      (r3v12 com.google.android.gms.internal.ads.zzbf)
     binds: [B:31:0x00a1, B:33:0x00a5, B:35:0x00b6, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzX(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzX(boolean, boolean, boolean, boolean):void");
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j10 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzlf.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, C.TIME_UNSET);
        zzuu zzuuVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzuuVarZzy.zzb()) {
            zzbfVar.zzo(zzuuVarZzy.zza, zzbdVar);
            if (zzuuVarZzy.zzc == zzbdVar.zzd(zzuuVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zzuuVarZzy, Long.valueOf(j10));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzkd) arrayList.get(size)).zzb;
            String str = zzep.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z10 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzlf zzlfVar, zzbd zzbdVar) {
        zzuu zzuuVar = zzlfVar.zzb;
        zzbf zzbfVar = zzlfVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzuuVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z10, boolean z11) {
        this.zzL = z10;
        long jElapsedRealtime = C.TIME_UNSET;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    private static Pair zzaD(zzbf zzbfVar, zzkg zzkgVar, boolean z10, int i10, boolean z11, zzbe zzbeVar, zzbd zzbdVar) {
        Pair pairZzm;
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzkgVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar3 = zzbfVar;
        }
        try {
            pairZzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzkgVar.zzb, zzkgVar.zzc);
            zzbfVar2 = zzbfVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar2)) {
            return pairZzm;
        }
        if (zzbfVar.zze(pairZzm.first) != -1) {
            return (zzbfVar2.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzkgVar.zzc) : pairZzm;
        }
        int iZzr = zzr(zzbeVar, zzbdVar, i10, z11, pairZzm.first, zzbfVar2, zzbfVar);
        if (iZzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, C.TIME_UNSET);
        }
        return null;
    }

    private static final void zzaE(zzlj zzljVar) throws zzib {
        zzljVar.zzh();
        try {
            zzljVar.zza().zzx(zzljVar.zzc(), zzljVar.zze());
        } finally {
            zzljVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzkp zzkpVar) {
        if (zzkpVar != null) {
            try {
                if (zzkpVar.zze) {
                    zzwk[] zzwkVarArr = zzkpVar.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzwk zzwkVar = zzwkVarArr[i10];
                        if (zzwkVar != null) {
                            zzwkVar.zzc();
                        }
                    }
                } else {
                    zzkpVar.zza.zzc();
                }
                if (zzkpVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzib {
        int i10 = 0;
        while (true) {
            zzlr[] zzlrVarArr = this.zzb;
            if (i10 >= 2) {
                this.zzaa = C.TIME_UNSET;
                return;
            }
            int iZzd = zzlrVarArr[i10].zzd();
            zzlrVarArr[i10].zzA(this.zzo);
            zzN(i10, false);
            this.zzR -= iZzd;
            i10++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzlr[] zzlrVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                zzlr zzlrVar = zzlrVarArr[i10];
                int iZzd = zzlrVar.zzd();
                zzlrVar.zzC(this.zzo);
                this.zzR -= iZzd - zzlrVar.zzd();
            }
            this.zzaa = C.TIME_UNSET;
        }
    }

    private final void zzac() throws zzib {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzib {
        zzkh zzkhVar;
        int i10;
        boolean z10;
        zzhz zzhzVar = this.zzo;
        float f10 = zzhzVar.zzj().zzb;
        zzks zzksVar = this.zzs;
        zzkp zzkpVarZzm = zzksVar.zzm();
        zzkp zzkpVarZzn = zzksVar.zzn();
        zzys zzysVar = null;
        boolean z11 = true;
        while (zzkpVarZzm != null && zzkpVarZzm.zze) {
            zzlf zzlfVar = this.zzG;
            zzys zzysVarZzk = zzkpVarZzm.zzk(f10, zzlfVar.zza, zzlfVar.zzl);
            zzys zzysVar2 = zzkpVarZzm == zzksVar.zzm() ? zzysVarZzk : zzysVar;
            zzys zzysVarZzr = zzkpVarZzm.zzr();
            boolean z12 = false;
            if (zzysVarZzr != null) {
                zzyk[] zzykVarArr = zzysVarZzk.zzc;
                if (zzysVarZzr.zzc.length == zzykVarArr.length) {
                    for (int i11 = 0; i11 < zzykVarArr.length; i11++) {
                        if (zzysVarZzk.zzb(zzysVarZzr, i11)) {
                        }
                    }
                    if (zzkpVarZzm != zzkpVarZzn) {
                        z12 = true;
                    }
                    z11 &= z12;
                    zzkpVarZzm = zzkpVarZzm.zzp();
                    zzysVar = zzysVar2;
                }
            }
            if (z11) {
                zzkp zzkpVarZzm2 = zzksVar.zzm();
                int iZzs = zzksVar.zzs(zzkpVarZzm2) & 1;
                zzlr[] zzlrVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzysVar2.getClass();
                long jZzm = zzkpVarZzm2.zzm(zzysVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzlf zzlfVar2 = this.zzG;
                if (zzlfVar2.zze == 4 || jZzm == zzlfVar2.zzs) {
                    z10 = false;
                } else {
                    z10 = false;
                    z12 = true;
                }
                zzlf zzlfVar3 = this.zzG;
                boolean z13 = z10;
                i10 = 2;
                zzkhVar = this;
                zzkhVar.zzG = zzao(zzlfVar3.zzb, jZzm, zzlfVar3.zzc, zzlfVar3.zzd, z12, 5);
                if (z12) {
                    zzkhVar.zzU(jZzm, true);
                }
                zzkhVar.zzab();
                boolean[] zArr2 = new boolean[2];
                for (int i12 = z13; i12 < 2; i12++) {
                    int iZzd = zzlrVarArr[i12].zzd();
                    zArr2[i12] = zzlrVarArr[i12].zzM();
                    zzlrVarArr[i12].zzD(zzkpVarZzm2.zzc[i12], zzhzVar, zzkhVar.zzT, zArr[i12]);
                    if (iZzd - zzlrVarArr[i12].zzd() > 0) {
                        zzkhVar.zzN(i12, z13);
                    }
                    zzkhVar.zzR -= iZzd - zzlrVarArr[i12].zzd();
                }
                zzkhVar.zzaq(zArr2, zzkhVar.zzT);
                zzkpVarZzm2.zzh = true;
            } else {
                zzkhVar = this;
                i10 = 2;
                zzksVar.zzs(zzkpVarZzm);
                if (zzkpVarZzm.zze) {
                    long jMax = Math.max(zzkpVarZzm.zzg.zzb, zzkhVar.zzT - zzkpVarZzm.zza());
                    if (zzkhVar.zzy && zzkhVar.zzaz() && zzksVar.zzo() == zzkpVarZzm) {
                        zzkhVar.zzab();
                    }
                    zzkpVarZzm.zzl(zzysVarZzk, jMax, false);
                }
            }
            zzkhVar.zzas(true);
            if (zzkhVar.zzG.zze != 4) {
                zzkhVar.zzam();
                zzkhVar.zzL();
                zzkhVar.zzi.zzh(i10);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzkp zzkpVarZzm = this.zzs.zzm();
        long j10 = zzkpVarZzm.zzg.zze;
        if (zzkpVarZzm.zze) {
            return j10 == C.TIME_UNSET || this.zzG.zzs < j10 || !zzax();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ee  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzaf(com.google.android.gms.internal.ads.zzbf, boolean):void");
    }

    private final void zzag(zzbf zzbfVar, zzuu zzuuVar, zzbf zzbfVar2, zzuu zzuuVar2, long j10, boolean z10) throws zzib {
        if (!zzP(zzbfVar, zzuuVar)) {
            zzav zzavVar = zzuuVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzuuVar.zza;
        zzbd zzbdVar = this.zzm;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        zzhu zzhuVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzep.zza;
        zzhuVar.zza(zzafVar);
        if (j10 != C.TIME_UNSET) {
            zzhuVar.zzb(zzO(zzbfVar, obj, j10));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzuuVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z10) {
            zzhuVar.zzb(C.TIME_UNSET);
        }
    }

    private final long zzah(zzkp zzkpVar) {
        if (zzkpVar == null) {
            return 0L;
        }
        long jZza = zzkpVar.zza();
        if (zzkpVar.zze) {
            int i10 = 0;
            while (true) {
                zzlr[] zzlrVarArr = this.zzb;
                if (i10 >= 2) {
                    break;
                }
                if (zzlrVarArr[i10].zzp(zzkpVar)) {
                    long jZzf = zzlrVarArr[i10].zzf(zzkpVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i10++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzks zzksVar = this.zzs;
        zzksVar.zzt();
        zzkp zzkpVarZzl = zzksVar.zzl();
        if (zzkpVarZzl != null) {
            if (!zzkpVarZzl.zzd || zzkpVarZzl.zze) {
                zzus zzusVar = zzkpVarZzl.zza;
                if (zzusVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzkpVarZzl.zzg.zza, zzkpVarZzl.zze ? zzusVar.zzi() : 0L)) {
                    if (!zzkpVarZzl.zzd) {
                        zzkpVarZzl.zzt(this, zzkpVarZzl.zzg.zzb);
                        return;
                    }
                    zzkm zzkmVar = new zzkm();
                    zzkmVar.zza(this.zzT - zzkpVarZzl.zza());
                    zzkmVar.zzb(this.zzo.zzj().zzb);
                    zzkmVar.zzc(this.zzM);
                    zzkpVarZzl.zzj(new zzkn(zzkmVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzkp zzkpVarZzm = this.zzs.zzm();
        boolean z10 = false;
        if (zzkpVarZzm != null && zzkpVarZzm.zzg.zzi && this.zzJ) {
            z10 = true;
        }
        this.zzK = z10;
    }

    private final void zzak(zzav zzavVar, boolean z10) throws zzib {
        zzal(zzavVar, zzavVar.zzb, true, z10);
    }

    private final void zzal(zzav zzavVar, float f10, boolean z10, boolean z11) throws zzib {
        int i10;
        if (z10) {
            if (z11) {
                this.zzH.zza(1);
            }
            zzlf zzlfVar = this.zzG;
            this.zzG = new zzlf(zzlfVar.zza, zzlfVar.zzb, zzlfVar.zzc, zzlfVar.zzd, zzlfVar.zze, zzlfVar.zzf, zzlfVar.zzg, zzlfVar.zzh, zzlfVar.zzi, zzlfVar.zzj, zzlfVar.zzk, zzlfVar.zzl, zzlfVar.zzm, zzlfVar.zzn, zzavVar, zzlfVar.zzq, zzlfVar.zzr, zzlfVar.zzs, zzlfVar.zzt, false);
        }
        float f11 = zzavVar.zzb;
        zzkp zzkpVarZzm = this.zzs.zzm();
        while (true) {
            i10 = 0;
            if (zzkpVarZzm == null) {
                break;
            }
            zzyk[] zzykVarArr = zzkpVarZzm.zzr().zzc;
            int length = zzykVarArr.length;
            while (i10 < length) {
                zzyk zzykVar = zzykVarArr[i10];
                i10++;
            }
            zzkpVarZzm = zzkpVarZzm.zzp();
        }
        zzlr[] zzlrVarArr = this.zzb;
        while (i10 < 2) {
            zzlrVarArr[i10].zzm(f10, f11);
            i10++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzks zzksVar = this.zzs;
        boolean zZzh = false;
        if (zzaF(zzksVar.zzk())) {
            zzkp zzkpVarZzk = zzksVar.zzk();
            long jZzau = zzau(zzkpVarZzk.zzg());
            if (zzkpVarZzk == zzksVar.zzm()) {
                jZza = this.zzT;
                jZza2 = zzkpVarZzk.zza();
            } else {
                jZza = this.zzT - zzkpVarZzk.zza();
                jZza2 = zzkpVarZzk.zzg.zzb;
            }
            zzkk zzkkVar = new zzkk(this.zzv, this.zzG.zza, zzkpVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzkpVarZzk.zzg.zza) ? this.zzad.zze() : C.TIME_UNSET, this.zzM);
            zzkl zzklVar = this.zzg;
            boolean zZzh2 = zzklVar.zzh(zzkkVar);
            zzkp zzkpVarZzm = zzksVar.zzm();
            if (zZzh2 || !zzkpVarZzm.zze || jZzau >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzkpVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzh = zzklVar.zzh(zzkkVar);
            }
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzkp zzkpVarZzk2 = zzksVar.zzk();
            zzkpVarZzk2.getClass();
            zzkm zzkmVar = new zzkm();
            zzkmVar.zza(this.zzT - zzkpVarZzk2.zza());
            zzkmVar.zzb(this.zzo.zzj().zzb);
            zzkmVar.zzc(this.zzM);
            zzkpVarZzk2.zzj(new zzkn(zzkmVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzkp zzkpVarZzk = this.zzs.zzk();
        boolean z10 = true;
        if (!this.zzN && (zzkpVarZzk == null || !zzkpVarZzk.zza.zzn())) {
            z10 = false;
        }
        zzlf zzlfVar = this.zzG;
        if (z10 != zzlfVar.zzg) {
            this.zzG = zzlfVar.zzg(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzlf zzao(com.google.android.gms.internal.ads.zzuu r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzao(com.google.android.gms.internal.ads.zzuu, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzlf");
    }

    private final void zzap() throws zzib {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j10) throws zzib {
        zzlr[] zzlrVarArr;
        long j11;
        zzkp zzkpVarZzn = this.zzs.zzn();
        zzys zzysVarZzr = zzkpVarZzn.zzr();
        int i10 = 0;
        while (true) {
            zzlrVarArr = this.zzb;
            if (i10 >= 2) {
                break;
            }
            if (!zzysVarZzr.zza(i10)) {
                zzlrVarArr[i10].zzG();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < 2) {
            if (!zzysVarZzr.zza(i11) || zzlrVarArr[i11].zzp(zzkpVarZzn)) {
                j11 = j10;
            } else {
                j11 = j10;
                zzar(zzkpVarZzn, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    private final void zzar(zzkp zzkpVar, int i10, boolean z10, long j10) throws zzib {
        zzlr zzlrVar = this.zzb[i10];
        if (zzlrVar.zzM()) {
            return;
        }
        boolean z11 = zzkpVar == this.zzs.zzm();
        zzys zzysVarZzr = zzkpVar.zzr();
        zzlq zzlqVar = zzysVarZzr.zzb[i10];
        zzyk zzykVar = zzysVarZzr.zzc[i10];
        boolean z12 = zzax() && this.zzG.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzR++;
        zzlrVar.zzx(zzlqVar, zzykVar, zzkpVar.zzc[i10], this.zzT, z13, z11, j10, zzkpVar.zza(), zzkpVar.zzg.zza, this.zzo);
        zzlrVar.zzy(11, new zzjv(this), zzkpVar);
        if (z12 && z11) {
            zzlrVar.zzv();
        }
    }

    private final void zzas(boolean z10) {
        zzkp zzkpVarZzk = this.zzs.zzk();
        zzuu zzuuVar = zzkpVarZzk == null ? this.zzG.zzb : zzkpVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzuuVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzuuVar);
        }
        zzlf zzlfVar = this.zzG;
        zzlfVar.zzq = zzkpVarZzk == null ? zzlfVar.zzs : zzkpVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z10) && zzkpVarZzk != null && zzkpVarZzk.zze) {
            zzaw(zzkpVarZzk.zzg.zza, zzkpVarZzk.zzq(), zzkpVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j10) {
        zzkp zzkpVarZzk = this.zzs.zzk();
        if (zzkpVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzT - zzkpVarZzk.zza()));
    }

    private final long zzav(zzkp zzkpVar) {
        zzgmd.zzh(zzkpVar.zze);
        return (long) ((zzkpVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzuu zzuuVar, zzwv zzwvVar, zzys zzysVar) {
        long jZza;
        long jZza2;
        zzks zzksVar = this.zzs;
        zzkp zzkpVarZzk = zzksVar.zzk();
        zzkpVarZzk.getClass();
        if (zzkpVarZzk == zzksVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzkpVarZzk.zza();
        } else {
            jZza = this.zzT - zzkpVarZzk.zza();
            jZza2 = zzkpVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzkk(this.zzv, this.zzG.zza, zzuuVar, jZza - jZza2, zzau(zzkpVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzkpVarZzk.zzg.zza) ? this.zzad.zze() : C.TIME_UNSET, this.zzM), zzwvVar, zzysVar.zzc);
    }

    private final boolean zzax() {
        zzlf zzlfVar = this.zzG;
        return zzlfVar.zzl && zzlfVar.zzn == 0;
    }

    private final void zzay(int i10) throws Throwable {
        zzlr zzlrVar = this.zzb[i10];
        try {
            zzkp zzkpVarZzm = this.zzs.zzm();
            if (zzkpVarZzm == null) {
                throw null;
            }
            zzlrVar.zzu(zzkpVarZzm);
        } catch (IOException e10) {
            e = e10;
            zzlrVar.zze();
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzlrVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzlr[] zzlrVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzlrVarArr[i10].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i10, boolean z10, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbfVar2.zza(); i11++) {
            if (zzbfVar2.zzb(i11, zzbeVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= iZzc || iZze2 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar2, i10, z10);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i12++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
            zzbeVar2 = zzbeVar;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzlj zzljVar) {
        try {
            zzaE(zzljVar);
        } catch (zzib e10) {
            zzdt.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05f6 A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TRY_LEAVE, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0705 A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, LOOP:18: B:349:0x0703->B:350:0x0705, LOOP_END, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x086e A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, LOOP:8: B:439:0x086c->B:440:0x086e, LOOP_END, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x087c A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x088c A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x096f A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a20 A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a2d A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0a34 A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a51 A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0ad1 A[Catch: IOException -> 0x0029, zztu -> 0x002c, zzgc -> 0x002f, zzat -> 0x0032, zzrr -> 0x0035, RuntimeException -> 0x0590, zzib -> 0x0593, TryCatch #34 {zzib -> 0x0593, RuntimeException -> 0x0590, blocks: (B:270:0x058c, B:278:0x05aa, B:279:0x05b3, B:281:0x05c4, B:283:0x05d2, B:287:0x05eb, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f6, B:300:0x0612, B:305:0x0623, B:309:0x0635, B:314:0x064b, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0c01  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zza(float f10) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzb(int i10) {
        this.zzi.zze(33, i10, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzcS(long j10, long j11, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z10, int i10, int i11) {
        this.zzi.zze(1, z10 ? 1 : 0, (i11 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i10, long j10) {
        this.zzi.zzd(3, new zzkg(zzbfVar, i10, j10)).zza();
    }

    public final void zzg(zzlu zzluVar) {
        this.zzi.zzd(38, zzluVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z10) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f10) {
        this.zzi.zzd(32, Float.valueOf(f10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final void zzk(zzlj zzljVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzljVar).zza();
        } else {
            zzdt.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzljVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j10) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdf zzdfVar = new zzdf(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdfVar)).zza();
        if (j10 != C.TIME_UNSET) {
            return zzdfVar.zze(j10);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdf zzdfVar = new zzdf(this.zzq);
        this.zzi.zzd(7, zzdfVar).zza();
        return zzdfVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final void zzo() {
        zzdm zzdmVar = this.zzi;
        zzdmVar.zzk(2);
        zzdmVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzp(zzus zzusVar) {
        this.zzi.zzd(8, zzusVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzs(zzwm zzwmVar) {
        this.zzi.zzd(9, (zzus) zzwmVar).zza();
    }

    public final /* synthetic */ zzkp zzt(zzkq zzkqVar, long j10) {
        zzyv zzyvVarZze = this.zzg.zze(this.zzv);
        long j11 = this.zzZ.zzb;
        zzys zzysVar = this.zzf;
        zzle zzleVar = this.zzt;
        return new zzkp(this.zzc, j10, this.zze, zzyvVarZze, zzleVar, zzkqVar, zzysVar, C.TIME_UNSET);
    }

    public final /* synthetic */ void zzu(int i10, boolean z10) {
        this.zzw.zzB(i10, this.zzb[i10].zze(), z10);
    }

    public final /* synthetic */ void zzv(int i10) {
        this.zzw.zzW(i10);
    }

    public final /* synthetic */ zzdm zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i10, long j10, zzwn zzwnVar) {
        this.zzi.zzd(17, new zzkb(list, zzwnVar, i10, j10, null)).zza();
    }
}
