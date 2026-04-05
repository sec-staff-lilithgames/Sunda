package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaoa implements zzada {
    private final int zza;
    private final List zzb;
    private final zzeg zzc;
    private final SparseIntArray zzd;
    private final zzaod zze;
    private final zzakg zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanw zzj;
    private zzanv zzk;
    private zzadd zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzaoa() {
        this(1, 1, zzakg.zza, new zzem(0L), new zzamn(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzadb r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzeg r0 = r6.zzc
            byte[] r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzacr r7 = (com.google.android.gms.internal.ads.zzacr) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzh(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zze(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.zza(com.google.android.gms.internal.ads.zzadb):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        if (this.zza == 0) {
            zzaddVar = new zzakj(zzaddVar, this.zzf);
        }
        this.zzl = zzaddVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzadb r20, com.google.android.gms.internal.ads.zzaea r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.zzd(com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzaea):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.zzb
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L35
            java.lang.Object r4 = r10.get(r1)
            com.google.android.gms.internal.ads.zzem r4 = (com.google.android.gms.internal.ads.zzem) r4
            long r5 = r4.zzc()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.zza()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.zzd(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L40
            com.google.android.gms.internal.ads.zzanv r10 = r9.zzk
            if (r10 == 0) goto L40
            r10.zzb(r12)
        L40:
            com.google.android.gms.internal.ads.zzeg r10 = r9.zzc
            r10.zza(r0)
            android.util.SparseIntArray r10 = r9.zzd
            r10.clear()
            r10 = r0
        L4b:
            android.util.SparseArray r11 = r9.zzg
            int r12 = r11.size()
            if (r10 >= r12) goto L5f
            java.lang.Object r11 = r11.valueAt(r10)
            com.google.android.gms.internal.ads.zzaof r11 = (com.google.android.gms.internal.ads.zzaof) r11
            r11.zzb()
            int r10 = r10 + 1
            goto L4b
        L5f:
            r9.zzq = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.zze(long, long):void");
    }

    public final /* synthetic */ List zzg() {
        return this.zzb;
    }

    public final /* synthetic */ zzaod zzh() {
        return this.zze;
    }

    public final /* synthetic */ SparseArray zzi() {
        return this.zzg;
    }

    public final /* synthetic */ SparseBooleanArray zzj() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzi;
    }

    public final /* synthetic */ zzadd zzl() {
        return this.zzl;
    }

    public final /* synthetic */ int zzm() {
        return this.zzm;
    }

    public final /* synthetic */ void zzn(int i10) {
        this.zzm = i10;
    }

    public final /* synthetic */ void zzo(boolean z10) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzp(int i10) {
        this.zzr = i10;
    }

    public zzaoa(int i10, int i11, zzakg zzakgVar, zzem zzemVar, zzaod zzaodVar, int i12) {
        this.zze = zzaodVar;
        this.zza = i11;
        this.zzf = zzakgVar;
        this.zzb = Collections.singletonList(zzemVar);
        this.zzc = new zzeg(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanw(112800);
        this.zzl = zzadd.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzaodVar.zza();
        int size = sparseArrayZza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(sparseArrayZza.keyAt(i13), (zzaof) sparseArrayZza.valueAt(i13));
        }
        this.zzg.put(0, new zzanr(new zzanx(this)));
    }
}
