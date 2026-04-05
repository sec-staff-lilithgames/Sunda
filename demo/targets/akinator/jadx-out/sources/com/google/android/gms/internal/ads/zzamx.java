package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzamx implements zzamq {
    private final zzant zza;
    private long zzf;
    private String zzh;
    private zzaem zzi;
    private zzamw zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzanh zzc = new zzanh(7, 128);
    private final zzanh zzd = new zzanh(8, 128);
    private final zzanh zze = new zzanh(6, 128);
    private long zzl = C.TIME_UNSET;
    private final zzeg zzn = new zzeg();

    public zzamx(zzant zzantVar, boolean z10, boolean z11, String str) {
        this.zza = zzantVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j10, int i10, long j11) {
        if (!this.zzk) {
            this.zzc.zzc(i10);
            this.zzd.zzc(i10);
        }
        this.zze.zzc(i10);
        this.zzj.zzd(j10, i10, j11, this.zzm);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i10, int i11) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i10, i11);
            this.zzd.zzd(bArr, i10, i11);
        }
        this.zze.zzd(bArr, i10, i11);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j10, int i10, int i11, long j11) {
        if (!this.zzk) {
            zzanh zzanhVar = this.zzc;
            zzanhVar.zze(i11);
            zzanh zzanhVar2 = this.zzd;
            zzanhVar2.zze(i11);
            if (this.zzk) {
                if (zzanhVar.zzb()) {
                    zzfl zzflVarZzd = zzfm.zzd(zzanhVar.zza, 4, zzanhVar.zzb);
                    this.zza.zzb(zzflVarZzd.zzm);
                    this.zzj.zza(zzflVarZzd);
                    zzanhVar.zza();
                } else if (zzanhVar2.zzb()) {
                    this.zzj.zzb(zzfm.zzg(zzanhVar2.zza, 4, zzanhVar2.zzb));
                    zzanhVar2.zza();
                }
            } else if (zzanhVar.zzb() && zzanhVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzanhVar.zza, zzanhVar.zzb));
                arrayList.add(Arrays.copyOf(zzanhVar2.zza, zzanhVar2.zzb));
                zzfl zzflVarZzd2 = zzfm.zzd(zzanhVar.zza, 4, zzanhVar.zzb);
                zzfk zzfkVarZzg = zzfm.zzg(zzanhVar2.zza, 4, zzanhVar2.zzb);
                String strZza = zzdd.zza(zzflVarZzd2.zza, zzflVarZzd2.zzb, zzflVarZzd2.zzc);
                zzaem zzaemVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(strZza);
                zztVar.zzt(zzflVarZzd2.zze);
                zztVar.zzu(zzflVarZzd2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzflVarZzd2.zzj);
                zzhVar.zzb(zzflVarZzd2.zzk);
                zzhVar.zzc(zzflVarZzd2.zzl);
                zzhVar.zze(zzflVarZzd2.zzh + 8);
                zzhVar.zzf(zzflVarZzd2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzflVarZzd2.zzg);
                zztVar.zzp(arrayList);
                int i12 = zzflVarZzd2.zzm;
                zztVar.zzo(i12);
                zzaemVar.zzu(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i12);
                this.zzj.zza(zzflVarZzd2);
                this.zzj.zzb(zzfkVarZzg);
                zzanhVar.zza();
                zzanhVar2.zza();
            }
        }
        zzanh zzanhVar3 = this.zze;
        if (zzanhVar3.zze(i11)) {
            int iZza = zzfm.zza(zzanhVar3.zza, zzanhVar3.zzb);
            zzeg zzegVar = this.zzn;
            zzegVar.zzb(zzanhVar3.zza, iZza);
            zzegVar.zzh(4);
            this.zza.zzc(j11, zzegVar);
        }
        if (this.zzj.zze(j10, i10, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = C.TIME_UNSET;
        zzfm.zzi(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzamw zzamwVar = this.zzj;
        if (zzamwVar != null) {
            zzamwVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        this.zzh = zzaoeVar.zzc();
        zzaem zzaemVarZzu = zzaddVar.zzu(zzaoeVar.zzb(), 2);
        this.zzi = zzaemVarZzu;
        this.zzj = new zzamw(zzaemVarZzu, false, false);
        this.zza.zza(zzaddVar, zzaoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        this.zzl = j10;
        int i11 = i10 & 2;
        this.zzm = (i11 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    @Override // com.google.android.gms.internal.ads.zzamq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzeg r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzaem r1 = r14.zzi
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzep.zza
            int r1 = r15.zzg()
            int r7 = r15.zze()
            byte[] r8 = r15.zzi()
            long r2 = r14.zzf
            int r4 = r15.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.zzf = r2
            com.google.android.gms.internal.ads.zzaem r2 = r14.zzi
            int r3 = r15.zzd()
            r2.zzz(r15, r3)
        L26:
            boolean[] r2 = r14.zzg
            int r2 = com.google.android.gms.internal.ads.zzfm.zzh(r8, r1, r7, r2)
            if (r2 == r7) goto L68
            int r3 = r2 + 3
            r3 = r8[r3]
            r9 = r3 & 31
            r3 = 3
            if (r2 <= 0) goto L41
            int r4 = r2 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L41
            r3 = 4
            r11 = r3
            r10 = r4
            goto L43
        L41:
            r10 = r2
            r11 = r3
        L43:
            int r2 = r10 - r1
            if (r2 <= 0) goto L4a
            r14.zzg(r8, r1, r10)
        L4a:
            int r3 = r7 - r10
            long r4 = r14.zzf
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r2 >= 0) goto L55
            int r1 = -r2
        L53:
            r12 = r4
            goto L57
        L55:
            r1 = 0
            goto L53
        L57:
            long r5 = r14.zzl
            r0 = r14
            r4 = r1
            r1 = r12
            r0.zzh(r1, r3, r4, r5)
            long r4 = r14.zzl
            r3 = r9
            r0.zzf(r1, r3, r4)
            int r1 = r10 + r11
            goto L26
        L68:
            r14.zzg(r8, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zzd(com.google.android.gms.internal.ads.zzeg):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
        this.zzi.getClass();
        String str = zzep.zza;
        if (z10) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
