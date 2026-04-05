package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwj implements zzaem {
    private boolean zzB;
    private final zzwe zza;
    private final zzrz zzd;
    private final zzru zze;
    private zzwi zzf;
    private zzv zzg;
    private zzrs zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzv zzz;
    private final zzwf zzb = new zzwf();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzael[] zzo = new zzael[1000];
    private final zzwq zzc = new zzwq(zzwg.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    public zzwj(zzyv zzyvVar, zzrz zzrzVar, zzru zzruVar) {
        this.zzd = zzrzVar;
        this.zze = zzruVar;
        this.zza = new zzwe(zzyvVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzkj zzkjVar, zzhh zzhhVar, boolean z10, boolean z11, zzwf zzwfVar) {
        try {
            zzhhVar.zzd = false;
            if (!zzH()) {
                if (!z11 && !this.zzw) {
                    zzv zzvVar = this.zzz;
                    if (zzvVar == null || (!z10 && zzvVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzvVar, zzkjVar);
                    return -5;
                }
                zzhhVar.zzg(4);
                zzhhVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzwh) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z10 && zzvVar2 == this.zzg) {
                int iZzM = zzM(this.zzs);
                if (!zzJ(iZzM)) {
                    zzhhVar.zzd = true;
                    return -3;
                }
                zzhhVar.zzg(this.zzm[iZzM]);
                if (this.zzs == this.zzp - 1 && (z11 || this.zzw)) {
                    zzhhVar.zzh(536870912);
                }
                zzhhVar.zze = this.zzn[iZzM];
                zzwfVar.zza = this.zzl[iZzM];
                zzwfVar.zzb = this.zzk[iZzM];
                zzwfVar.zzc = this.zzo[iZzM];
                return -4;
            }
            zzI(zzvVar2, zzkjVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzvVar, this.zzz)) {
                return false;
            }
            zzwq zzwqVar = this.zzc;
            if (zzwqVar.zzf() || !((zzwh) zzwqVar.zzc()).zza.equals(zzvVar)) {
                this.zzz = zzvVar;
            } else {
                this.zzz = ((zzwh) zzwqVar.zzc()).zza;
            }
            boolean z10 = this.zzA;
            zzv zzvVar2 = this.zzz;
            this.zzA = z10 & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized long zzD(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzp     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.zzn     // Catch: java.lang.Throwable -> L32
            int r2 = r7.zzr     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.zzs     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzK(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.zzL(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwj.zzD(long, boolean, boolean):long");
    }

    private final synchronized long zzE() {
        int i10 = this.zzp;
        if (i10 == 0) {
            return -1L;
        }
        return zzL(i10);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j10, int i10, long j11, int i11, zzael zzaelVar) {
        try {
            int i12 = this.zzp;
            if (i12 > 0) {
                int iZzM = zzM(i12 - 1);
                zzgmd.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j11);
            }
            this.zzw = (536870912 & i10) != 0;
            this.zzv = Math.max(this.zzv, j10);
            int iZzM2 = zzM(this.zzp);
            this.zzn[iZzM2] = j10;
            this.zzk[iZzM2] = j11;
            this.zzl[iZzM2] = i11;
            this.zzm[iZzM2] = i10;
            this.zzo[iZzM2] = zzaelVar;
            this.zzj[iZzM2] = 0;
            zzwq zzwqVar = this.zzc;
            if (zzwqVar.zzf() || !((zzwh) zzwqVar.zzc()).zza.equals(this.zzz)) {
                zzv zzvVar = this.zzz;
                if (zzvVar == null) {
                    throw null;
                }
                zzwqVar.zzb(this.zzq + this.zzp, new zzwh(zzvVar, zzry.zzb, null));
            }
            int i13 = this.zzp + 1;
            this.zzp = i13;
            int i14 = this.zzi;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                zzael[] zzaelVarArr = new zzael[i15];
                int i16 = this.zzr;
                int i17 = i14 - i16;
                System.arraycopy(this.zzk, i16, jArr2, 0, i17);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i17);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i17);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i17);
                System.arraycopy(this.zzo, this.zzr, zzaelVarArr, 0, i17);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i17);
                int i18 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i17, i18);
                System.arraycopy(this.zzn, 0, jArr3, i17, i18);
                System.arraycopy(this.zzm, 0, iArr, i17, i18);
                System.arraycopy(this.zzl, 0, iArr2, i17, i18);
                System.arraycopy(this.zzo, 0, zzaelVarArr, i17, i18);
                System.arraycopy(this.zzj, 0, jArr, i17, i18);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzaelVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzv zzvVar, zzkj zzkjVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zzrz zzrzVar = this.zzd;
        zzkjVar.zzb = zzvVar.zzb(zzrzVar.zzb(zzvVar));
        zzkjVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzrs zzrsVarZza = zzrzVar.zza(this.zze, zzvVar);
            this.zzh = zzrsVarZza;
            zzkjVar.zza = zzrsVarZza;
        }
    }

    private final boolean zzJ(int i10) {
        if (this.zzh == null) {
            return true;
        }
        int i11 = this.zzm[i10];
        return false;
    }

    private final int zzK(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzn[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzm[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.zzi) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final long zzL(int i10) {
        long j10 = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iZzM = zzM(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j10, jMax);
        this.zzp -= i10;
        int i12 = this.zzq + i10;
        this.zzq = i12;
        int i13 = this.zzr + i10;
        this.zzr = i13;
        int i14 = this.zzi;
        if (i13 >= i14) {
            this.zzr = i13 - i14;
        }
        int i15 = this.zzs - i10;
        this.zzs = i15;
        if (i15 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i12);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i16 = this.zzr;
        if (i16 == 0) {
            i16 = this.zzi;
        }
        return this.zzk[i16 - 1] + this.zzl[r12];
    }

    private final int zzM(int i10) {
        int i11 = this.zzr + i10;
        int i12 = this.zzi;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final void zza() {
        zzb(true);
        zzF();
    }

    public final void zzb(boolean z10) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z10) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzc(long j10) {
        this.zzt = j10;
    }

    public final int zzd() {
        return this.zzq + this.zzp;
    }

    public final void zze() {
        zzs();
        zzF();
    }

    public final void zzf() throws IOException {
        zzrs zzrsVar = this.zzh;
        if (zzrsVar != null) {
            throw zzrsVar.zza();
        }
    }

    public final int zzg() {
        return this.zzq;
    }

    public final int zzh() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzi() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzj() {
        return this.zzv;
    }

    public final synchronized boolean zzk() {
        return this.zzw;
    }

    public final synchronized boolean zzl(boolean z10) {
        boolean z11 = true;
        if (zzH()) {
            if (((zzwh) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z10 && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z11 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final int zzm(zzkj zzkjVar, zzhh zzhhVar, int i10, boolean z10) {
        boolean z11 = (i10 & 2) != 0;
        zzwf zzwfVar = this.zzb;
        int iZzB = zzB(zzkjVar, zzhhVar, z11, z10, zzwfVar);
        if (iZzB != -4) {
            return iZzB;
        }
        if (!zzhhVar.zzb()) {
            int i11 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i11 != 0) {
                    this.zza.zzd(zzhhVar, zzwfVar);
                    return -4;
                }
                this.zza.zzc(zzhhVar, zzwfVar);
            } else if (i11 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzn(int i10) {
        zzA();
        int i11 = this.zzq;
        if (i10 >= i11 && i10 <= this.zzp + i11) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzo(long j10, boolean z10) throws Throwable {
        Throwable th2;
        zzwj zzwjVar;
        long j11;
        int iZzK;
        try {
            try {
                zzA();
                int i10 = this.zzs;
                int iZzM = zzM(i10);
                if (zzH() && j10 >= this.zzn[iZzM]) {
                    if (j10 > this.zzv) {
                        if (z10) {
                            z10 = true;
                        }
                    }
                    if (this.zzA) {
                        try {
                            int i11 = this.zzp - i10;
                            int i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    if (this.zzn[iZzM] >= j10) {
                                        zzwjVar = this;
                                        j11 = j10;
                                        iZzK = i12;
                                        break;
                                    }
                                    iZzM++;
                                    if (iZzM == this.zzi) {
                                        iZzM = 0;
                                    }
                                    i12++;
                                } else if (z10) {
                                    j11 = j10;
                                    iZzK = i11;
                                    zzwjVar = this;
                                } else {
                                    zzwjVar = this;
                                    j11 = j10;
                                    iZzK = -1;
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        zzwjVar = this;
                        j11 = j10;
                        iZzK = zzwjVar.zzK(iZzM, this.zzp - i10, j11, true);
                    }
                    if (iZzK != -1) {
                        zzwjVar.zzt = j11;
                        zzwjVar.zzs += iZzK;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized int zzp(long j10, boolean z10) {
        Throwable th2;
        try {
            try {
                int i10 = this.zzs;
                int iZzM = zzM(i10);
                if (!zzH() || j10 < this.zzn[iZzM]) {
                    return 0;
                }
                if (j10 <= this.zzv || !z10) {
                    int iZzK = zzK(iZzM, this.zzp - i10, j10, true);
                    if (iZzK == -1) {
                        return 0;
                    }
                    return iZzK;
                }
                try {
                    return this.zzp - i10;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized void zzq(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzs + i10 <= this.zzp) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzgmd.zza(z10);
        this.zzs += i10;
    }

    public final void zzr(long j10, boolean z10, boolean z11) {
        this.zza.zze(zzD(j10, false, z11));
    }

    public final void zzs() {
        this.zza.zze(zzE());
    }

    public final void zzt(zzwi zzwiVar) {
        this.zzf = zzwiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzu(zzv zzvVar) {
        boolean zZzC = zzC(zzvVar);
        zzwi zzwiVar = this.zzf;
        if (zzwiVar == null || !zZzC) {
            return;
        }
        zzwiVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final int zzv(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zzg(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzw(zzeg zzegVar, int i10, int i11) {
        this.zza.zzh(zzegVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzx(long j10, int i10, int i11, int i12, zzael zzaelVar) {
        if (this.zzx) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j10 < this.zzt) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzB) {
                    zzdt.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i10 |= 1;
            }
        }
        zzG(j10, i10, (this.zza.zzf() - i11) - i12, i11, zzaelVar);
    }
}
