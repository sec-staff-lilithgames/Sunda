package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzamz implements zzamq {
    private final zzant zza;
    private String zzb;
    private zzaem zzc;
    private zzamy zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzanh zzg = new zzanh(32, 128);
    private final zzanh zzh = new zzanh(33, 128);
    private final zzanh zzi = new zzanh(34, 128);
    private final zzanh zzj = new zzanh(39, 128);
    private final zzanh zzk = new zzanh(40, 128);
    private long zzm = C.TIME_UNSET;
    private final zzeg zzn = new zzeg();

    public zzamz(zzant zzantVar, String str) {
        this.zza = zzantVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j10, int i10, int i11, long j11) {
        this.zzd.zzb(j10, i10, i11, j11, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i11);
            this.zzh.zzc(i11);
            this.zzi.zzc(i11);
        }
        this.zzj.zzc(i11);
        this.zzk.zzc(i11);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i10, int i11) {
        this.zzd.zzc(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zzd(bArr, i10, i11);
            this.zzh.zzd(bArr, i10, i11);
            this.zzi.zzd(bArr, i10, i11);
        }
        this.zzj.zzd(bArr, i10, i11);
        this.zzk.zzd(bArr, i10, i11);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j10, int i10, int i11, long j11) {
        this.zzd.zzd(j10, i10, this.zze);
        if (!this.zze) {
            zzanh zzanhVar = this.zzg;
            zzanhVar.zze(i11);
            zzanh zzanhVar2 = this.zzh;
            zzanhVar2.zze(i11);
            zzanh zzanhVar3 = this.zzi;
            zzanhVar3.zze(i11);
            if (zzanhVar.zzb() && zzanhVar2.zzb() && zzanhVar3.zzb()) {
                String str = this.zzb;
                int i12 = zzanhVar.zzb;
                byte[] bArr = new byte[zzanhVar2.zzb + i12 + zzanhVar3.zzb];
                System.arraycopy(zzanhVar.zza, 0, bArr, 0, i12);
                System.arraycopy(zzanhVar2.zza, 0, bArr, zzanhVar.zzb, zzanhVar2.zzb);
                System.arraycopy(zzanhVar3.zza, 0, bArr, zzanhVar.zzb + zzanhVar2.zzb, zzanhVar3.zzb);
                String strZzb = null;
                zzfg zzfgVarZzf = zzfm.zzf(zzanhVar2.zza, 3, zzanhVar2.zzb, null);
                zzfb zzfbVar = zzfgVarZzf.zzb;
                if (zzfbVar != null) {
                    int i13 = zzfbVar.zzf;
                    int[] iArr = zzfbVar.zze;
                    int i14 = zzfbVar.zzd;
                    strZzb = zzdd.zzb(zzfbVar.zza, zzfbVar.zzb, zzfbVar.zzc, i14, iArr, i13);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzl("video/mp2t");
                zztVar.zzm("video/hevc");
                zztVar.zzj(strZzb);
                zztVar.zzt(zzfgVarZzf.zze);
                zztVar.zzu(zzfgVarZzf.zzf);
                zztVar.zzv(zzfgVarZzf.zzg);
                zztVar.zzw(zzfgVarZzf.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzfgVarZzf.zzk);
                zzhVar.zzb(zzfgVarZzf.zzl);
                zzhVar.zzc(zzfgVarZzf.zzm);
                zzhVar.zze(zzfgVarZzf.zzc + 8);
                zzhVar.zzf(zzfgVarZzf.zzd + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzfgVarZzf.zzi);
                zztVar.zzo(zzfgVarZzf.zzj);
                zztVar.zzD(zzfgVarZzf.zza + 1);
                zztVar.zzp(Collections.singletonList(bArr));
                zzv zzvVarZzM = zztVar.zzM();
                this.zzc.zzu(zzvVarZzM);
                int i15 = zzvVarZzM.zzq;
                zzgmd.zzh(i15 != -1);
                this.zza.zzb(i15);
                this.zze = true;
            }
        }
        zzanh zzanhVar4 = this.zzj;
        if (zzanhVar4.zze(i11)) {
            int iZza = zzfm.zza(zzanhVar4.zza, zzanhVar4.zzb);
            zzeg zzegVar = this.zzn;
            zzegVar.zzb(zzanhVar4.zza, iZza);
            zzegVar.zzk(5);
            this.zza.zzc(j11, zzegVar);
        }
        zzanh zzanhVar5 = this.zzk;
        if (zzanhVar5.zze(i11)) {
            int iZza2 = zzfm.zza(zzanhVar5.zza, zzanhVar5.zzb);
            zzeg zzegVar2 = this.zzn;
            zzegVar2.zzb(zzanhVar5.zza, iZza2);
            zzegVar2.zzk(5);
            this.zza.zzc(j11, zzegVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zzl = 0L;
        this.zzm = C.TIME_UNSET;
        zzfm.zzi(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzamy zzamyVar = this.zzd;
        if (zzamyVar != null) {
            zzamyVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        this.zzb = zzaoeVar.zzc();
        zzaem zzaemVarZzu = zzaddVar.zzu(zzaoeVar.zzb(), 2);
        this.zzc = zzaemVarZzu;
        this.zzd = new zzamy(zzaemVarZzu);
        this.zza.zza(zzaddVar, zzaoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzd(zzeg zzegVar) {
        this.zzc.getClass();
        String str = zzep.zza;
        while (zzegVar.zzd() > 0) {
            int iZzg = zzegVar.zzg();
            int iZze = zzegVar.zze();
            byte[] bArrZzi = zzegVar.zzi();
            this.zzl += zzegVar.zzd();
            this.zzc.zzz(zzegVar, zzegVar.zzd());
            while (iZzg < iZze) {
                int iZzh = zzfm.zzh(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzh == iZze) {
                    zzg(bArrZzi, iZzg, iZze);
                    return;
                }
                int i10 = bArrZzi[iZzh + 3] & 126;
                int i11 = 3;
                if (iZzh > 0) {
                    int i12 = iZzh - 1;
                    if (bArrZzi[i12] == 0) {
                        i11 = 4;
                        iZzh = i12;
                    }
                }
                int i13 = iZzh - iZzg;
                if (i13 > 0) {
                    zzg(bArrZzi, iZzg, iZzh);
                }
                int i14 = iZze - iZzh;
                long j10 = this.zzl - i14;
                zzh(j10, i14, i13 < 0 ? -i13 : 0, this.zzm);
                zzf(j10, i14, i10 >> 1, this.zzm);
                iZzg = iZzh + i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
        this.zzc.getClass();
        String str = zzep.zza;
        if (z10) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
